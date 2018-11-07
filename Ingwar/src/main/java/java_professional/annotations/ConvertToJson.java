package java_professional.annotations;

public class ConvertToJson<E> {
	private E workingClass;

	public ConvertToJson(E workingClass) {
		this.workingClass = workingClass;
	}
	
	public void Convert() {
		Class aClass = workingClass.getClass();
		
	}
	
	
	

}
