package day6_hcl_assgn;



import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


     
public class FrequencyOfEachWord  {
        
    public static void main(String[] args) throws Exception {    
            
        int count = 0, maxCount = 0;    
        Map<String,Integer> map = new HashMap<String,Integer>();    
            
        //Opens file in read mode    
        FileReader file = new FileReader("story.txt ");    
        try(BufferedReader br = new BufferedReader(new FileReader("story.txt ")))   
        		{
        			String line=null;
        			 while((line = br.readLine()) != null) {    
        		            String words[]=line.split(" ");    
        		            for(String word : words){    
        		                if(map.containsKey(word)) {
        		                	    Integer freq=map.get(word);
        		                	    map.put(word, ++freq);
        		                }
        		                else {
        		                	map.put(word, 1);
        		                }
        		}
        			 }
                } catch(FileNotFoundException e) {
                	e.printStackTrace();
                }catch(IOException e) {
                	e.printStackTrace();
                }
    
    Set<Entry<String,Integer>> entrySet = map.entrySet();
 	  for(Entry<String,Integer>entry:entrySet) {
			System.out.println(entry.getKey()+" apperas "+entry.getValue()+" times ");
}
}
}
                	
                
              
            
           


