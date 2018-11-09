package java_professional.annotations;

import java.lang.reflect.Field;

public class ConvertToJson<E> {
	private E workingClass;
	private String jsonString;
	final private Class[] primitiveClasses = new Class[]{boolean.class, byte.class, char.class, short.class, int.class,
			long.class, float.class, double.class, String.class};

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
				if (isPrimitive(field.getType())) {
					String value = "";
					try {
						value = field.get(fieldsOwnerClass).toString();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
					returnString = returnString + offset + '"' + field.getName() + '"' + ":" + value + endOfFields;
				} else {
					try {

						returnString = returnString + offset + '"' + field.getName() + '"' + ":\n" + offset + "{\n" +
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

	private boolean isPrimitive(Class aClass) {
		for (Class primitiveClass : primitiveClasses) {
			if (primitiveClass.equals(aClass)) {
				return true;
			}
		}
		return false;
	}


}
