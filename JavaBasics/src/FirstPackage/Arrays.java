package FirstPackage;

public class Arrays {

	public static void main(String[] args) {
		
		String x[] = new String[5];
		x[0]="usman";
		x[1]="Shoaib";
		x[3]="Ashwini";
		x[2]="Anees";
		System.out.println(x.length);
		/*
		 * System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		*/
		
		for (int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		

	}

}
