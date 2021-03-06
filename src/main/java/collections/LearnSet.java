package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class LearnSet {
	
	
	/**
	 * Date: 12 March 2017
	 * 
	 * Set is a Collection that cannot contain duplicate elements.
	 * The order of a map is defined as the order depends on implementation
	 * 
	 * Set implementations: HashSet, TreeSet, and LinkedHashSet.
	 * 
	 * HashSet, which stores its elements in a hash table, is the best-performing implementation; 
	 * however it makes no guarantees concerning the order of iteration.
	 * 
	 * Incase of ordered to be maintained, use LinkedHashSet
	 * 
	 * Methods we will learn today
	 * 
	 * size, add, remove, clear, isEmpty
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Create a set
		Set<String> mentors = new LinkedHashSet<String>();
		
		// Add mentors to the set -- Note the order
		mentors.add("Rasheed");
		mentors.add("Gopi");
		mentors.add("Indhu");
		mentors.add("Sethu");
		mentors.add("Sunil");
		mentors.add("Lokesh");
		
		
		// Now get the count
		System.out.println("The total mentors are :"+mentors.size());
		
		// Try duplicate
		mentors.add("Gopi");
		   		
		// Now get the count
		System.out.println("The total mentors are :"+mentors.size());
				
		// Print the name of all mentors -- you will notice the order in the list not maintained
		for (String mentor : mentors) {
			System.out.println(mentor);
		}
		
		// contains
		System.out.println("Is Indhu is available "
				+ "in the set :"+mentors.contains("Indhu"));
		
		// remove
		mentors.remove("Indhu");
		
		// contains
		System.out.println("Is Indhu is available in the set"
				+ " after removal :"+mentors.contains("Indhu"));
		
		// clear
		mentors.clear();
		
		// check if it empty
		System.out.println("The set is empty :"
				+ ""+mentors.isEmpty());
		
		
	}

}
