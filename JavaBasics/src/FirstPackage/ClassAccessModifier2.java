package FirstPackage;

public class ClassAccessModifier2 {

	public static void main(String[] args) {
		
		ClassAccessModifier1 obj = new ClassAccessModifier1();
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		//System.out.println(obj.a);
		
		obj.PublicMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		//obj.privateMethod();

	}

}
