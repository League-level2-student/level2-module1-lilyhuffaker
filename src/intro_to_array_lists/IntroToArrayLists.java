package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("Lily");
		list.add("Ralph");
		list.add("Carl");
		list.add("Rune");
		list.add("Peaches");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println("This is family member " +i+ ", " +s);
		}
		//4. Print all the Strings using a for-each loop
		for(String s: list) {
			//finish
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
