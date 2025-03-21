package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String> colours = new HashMap<Integer,String>();
		colours.put(1, "red");
		colours.put(2, "blue");
		colours.put(3, "green");
		colours.put(4, "yellow");
		colours.put(5, "black");
		
		System.out.println(colours);
		
		colours.remove(2);
		System.out.println("after removing : "+colours);
		
		System.out.println("Checking if green exists: ");
		if(colours.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
		
		System.out.println("size of hashmap is :"+colours.size());
		
	}

}