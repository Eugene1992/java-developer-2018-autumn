
public class HomeWork070918 {

	public static void main(String[] args) {
		//1
		byte byteVar = 97;
		short shortVar = 333;
		int intVar = 1128000000;
		long longVar= 3456789233345346657L;
		
		//2
		byte byteVar2 = 2+3;
		
		//3
		short shortVar2 = 654-128;
		
		//4
		int intVar2 = 1144000000/5;
		
		//5
		long longVar2 = 2144000000L*7;
		
		//6
		byte byteVar3;
		byte aVar = 7;
		byte bVar = 10;
		byteVar3 = (byte) (aVar+bVar);
		System.out.println("n.6, result: "+byteVar3);
		
		//7
		byte byteVar4;
		short cVar = 344;
		short dVar = 156;
		byte eVar = 5;
		short shortSum = (short) (cVar+dVar);
		byteVar4 = (byte) (shortSum/eVar);
		System.out.println("n.7, result: "+byteVar4);
		
		//8
		int intVar3;
		short gVar = 800;
		short hVar = 200;
		byte fVar = 25;
		byte jVar = 5;
		intVar3 = (gVar/hVar)*(fVar/jVar);
		System.out.println("n.8, result: "+intVar3);
		
		//9
		byte byteVar5 = 7;
		byte byteVar6 = 6;
		byte byteVar7;
		System.out.println("n.9: ");
		System.out.println("Initial numbers "+byteVar5+" and "+byteVar6);
		byteVar7 = byteVar6;
		byteVar6 = byteVar5;
		byteVar5 = byteVar7;
		System.out.println("Final numbers "+byteVar5+" and "+byteVar6);
		
		//10
		byte byteVar8 = 7;
		byte byteVar9 = 6;
		System.out.println("n.10: ");
		System.out.println("Initial numbers "+byteVar8+" and "+byteVar9);
		byteVar8 = (byte) (byteVar8+byteVar9);
		byteVar9 = (byte) (byteVar8-byteVar9);
		byteVar8 = (byte) (byteVar8-byteVar9);
		System.out.println("Final numbers "+byteVar8+" and "+byteVar9);
	}

}
