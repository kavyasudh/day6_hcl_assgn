package day6_hcl_assgn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListAndSet {

	public static void main(String[] args) {
		
		
		List<Integer>  list=new ArrayList<>();
		List<Integer>  list2=new ArrayList<>();
		
		
		Set<Integer> set=new TreeSet<>();
		Set<Integer> set2=new TreeSet<>();
		
		list2.add(29);         set2.add(29);
		list2.add(28);         set2.add(28);
		list2.add(24);         set2.add(24);
		list.add(27);          set.add(27);
		list.add(7);           set.add(7);
		
		System.out.println(list.add(26)+"  "
				+ ""+set.add(26));
		System.out.println(list+"   "+set);
		
		list.addAll(list2);  set.addAll(set2);
		System.out.println(list+"   "+set);
		
		System.out.println(list.remove(2)+"   "+set.remove(2));
		System.out.println(list+"   "+set);
		
		
		
		System.out.println(list.removeAll(list2)+"   "+set.removeAll(set2));
		System.out.println(list);
		
		
		
		System.out.println(list+"   "+set);
		
		System.out.println(list.size()+"   "+set.size());
		
		
		System.out.println(list.contains(27)+"   "+set.contains(27));
		
        Iterator<Integer>  iterator=list.iterator();  //return type:list
        while(iterator.hasNext())
        {
        	
        	System.out.println(iterator.next());
        }
		
        Iterator<Integer>  iterator1=set.iterator();  //return type:list
        while(iterator1.hasNext())
        {
        	
        	System.out.println(iterator1.next());
        }


        Object[] obj=list.toArray();        //returns array of type object
        for(Object ob:obj) {
        	System.out.println(ob);
        }
        
        Object[] obj1=set.toArray();        //returns array of type object
        for(Object ob1:obj1) {
        	System.out.println(ob1);
        }
		
		
		
		
        list.clear();  
        set.clear();
		System.out.println(list+"    "+set);
		

	}

}
