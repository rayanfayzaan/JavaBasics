package SecondPackage;

import FirstPackage.ClassAccessModifier1;

public class ClassAccessModifier3 extends  ClassAccessModifier1 {

	public static void main(String[] args) {
		
		ClassAccessModifier3 obj = new ClassAccessModifier3();
		
		System.out.println(obj.x);
		//System.out.println(obj.y);
		System.out.println(obj.z);
		//System.out.println(obj.a);
		
		obj.PublicMethod();
		//obj.defaultMethod();
		obj.protectedMethod();
		//obj.privateMethod();

	}

}
