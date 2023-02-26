package FirstPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		
		/*
		There are 3 types of Collections
		1.List
		2.Set
		3.Map
		
		List - ArrayList, LinkedList and Vector
		List is an Ordered Collection and it can save duplicate values
		
		Set - HashSet, LinkedHashSet and TreeSet
		A set is a collection that cannot contain duplicate values
		There is no guarantee of the order
		
		Map - HashMap, TreeMap and LinkedHashMap
		A Map is a collection that cannot contain duplicate values
		HashMap takes the values in Key and Value pair
		
		*/


//ArrayList

	/*
		 
		
		obj.add("Usman"); //1
		obj.add("Achala");  //2
		obj.add("ashwini"); //4
		obj.add(2,"Shoaib"); //3
		obj.add(0,"Anees");  //0
		obj.add("Achala");
		obj.add(68);
		obj.add("Shoaib");
		 
		 System.out.println(obj);
		 System.out.println(obj.size());
		 System.out.println(obj.get(5));
		 
		 for(int i=0;i<obj.size();i++)
		 {
			 System.out.println(obj.get(i));
		 }
		 
		//System.out.println(obj.get(0));
		//System.out.println(obj.get(1));
		//System.out.println(obj.get(2));
		//System.out.println(obj.get(3));
		//System.out.println(obj.get(4));
		//obj.remove(3);
		//System.out.println(obj.contains("Usman"));
		//obj.remove("Usman");
		//System.out.println(obj);
		//obj.removeAll(obj);
		//System.out.println(obj);
		//System.out.println(obj);
		//System.out.println(obj.contains("Usman"));
		
		//System.out.println(obj.get(3));
 
 */

//===================================================================================//	
		

// HashSet
		
/*
		HashSet obj = new HashSet();
		obj.add("Usman");
		obj.add("Achala");  
		obj.add("ashwini"); 
		obj.add("Achala");
		obj.add(68);
		obj.add("Shoaib");
		obj.add("Anees");
		
		System.out.println(obj);
		obj.remove("Anees");
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
		obj.removeAll(obj);
		System.out.println(obj.isEmpty());
		
		
		Iterator  i =obj.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
			
*/
		
		
//====================================================================================


//HashMap
		
HashMap obj = new HashMap();

obj.put(0, "Usman");
obj.put(3, "Achala");
obj.put(5, "Shoaib");
obj.put(10, "Ashwini");
obj.put(50, "Anees");

//System.out.println(obj);
//System.out.println(obj.get(10));

 Set sm =obj.entrySet();
 //System.out.println(sm);
 
 Iterator  i =sm.iterator();

 while(i.hasNext())
	{
	Map.Entry mp = (Map.Entry)i.next();
		//System.out.println(i.next());
	//System.out.println(mp.getKey()); 
	System.out.println(mp.getValue()); 
	}

	}

}
