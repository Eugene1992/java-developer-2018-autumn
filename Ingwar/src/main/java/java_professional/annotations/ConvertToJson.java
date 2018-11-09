package java_professional.annotations;

import java.lang.reflect.Field;

public class ConvertToJson<E> {
	private E workingClass;
	private String jsonString;

	public ConvertToJson(E workingClass) {
		this.workingClass = workingClass;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void Convert() {
		Class aClass = workingClass.getClass();
		if (!aClass.isAnnotationPresent(JsonEntity.class)) {
			throw new UnsupportedOperationException("No Json Annotation found!");
		}
		jsonString = "[\n {\n";
		Field[] fields = aClass.getDeclaredFields();
		jsonString = jsonString + getJsonStringFromFields(fields, workingClass, "");
		jsonString = jsonString + " }\n]";
	}

	private String getJsonStringFromFields(Field[] fields, Object fieldsOwnerClass, String offset) {
		offset = offset + "  ";
		String returnString = "";
		for (int index = 0; index < fields.length; index++) {//(Field field : fields) {
			Field field = fields[index];
			String endOfFields = index == fields.length - 1 ? "\n" : ",\n";
			field.setAccessible(true);
			if (field.isAnnotationPresent(JsonField.class)) {
                String fieldName = field.getAnnotation(JsonField.class).name();
                if (fieldName.equals("default")) {
                    fieldName = field.getName();
                }
                if (field.getType().isPrimitive() || field.getType() == String.class) {
					String value = "";
					try {
						value = field.get(fieldsOwnerClass).toString();
                        if (field.get(fieldsOwnerClass).getClass() == String.class) {
                            value = '"' + value + '"';
                        }

					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
                    returnString = returnString + offset + '"' + fieldName + '"' + ":" + value + endOfFields;
				} else {
					try {

                        returnString = returnString + offset + '"' + fieldName + '"' + ":\n" + offset + "{\n" +
								getJsonStringFromFields(field.getType().getDeclaredFields(), field.get(fieldsOwnerClass),
										offset) + offset + "}" + endOfFields;
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return returnString;
	}
}
