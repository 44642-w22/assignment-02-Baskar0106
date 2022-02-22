import java.util.*;
/**
 * 
 */

/**
 * @author S544912
 *
 */
public class AssignmentTwo {
	
	public static void main(String[] args)
	{	
		try (Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println("Enter number of strings for Problem01: "); 
			int integer = Integer.parseInt(scanner.nextLine()); 
			String[] str1 = new String[integer];
			System.out.println("Enter " + integer + " Strings"); 
			for(int i = 0 ; i < str1.length ; i++)
			{
				str1[i] = scanner.nextLine(); 
			}
			Problem01(str1); 
			
			
			
			System.out.println("Enter number of strings for Problem02: "); 
			int integer2 = Integer.parseInt(scanner.nextLine()); 
			String[] str2 = new String[integer2];
			System.out.println("Enter " + integer2 + " Strings"); 
			for(int i = 0 ; i < str2.length ; i++) 
			{ 
				str2[i] = scanner.nextLine(); 
			}
			System.out.println(Problem02(str2));
			
			
			
			
			System.out.println("Enter number of strings for Problem03: ");
			int integer03 = Integer.parseInt(scanner.nextLine());
			Integer[] i03 = new Integer[integer03];
			System.out.println("Enter " + integer03 + " numbers"); 
			for(int i = 0 ; i < i03.length ; i++) 
			{
				i03[i] = Integer.parseInt(scanner.nextLine());
			}
			System.out.println(Problem03(i03));

			
			
			System.out.println("Enter number of strings for Problem04: ");
			int integer04 = Integer.parseInt(scanner.nextLine()); 
			ArrayList<String> array04 = new ArrayList<>(); 
			System.out.println("Enter " + integer04 + "Strings");
			for(int i = 0 ; i < integer04 ; i++) 
			{
				array04.add(scanner.nextLine()); 
			}
			System.out.println(Problem04(array04));
			
			
			  
			System.out.println("Enter number of strings for Problem05: "); 
			int integer05 = Integer.parseInt(scanner.nextLine());
			ArrayList<String> array05 = new ArrayList<>(); 
			System.out.println("Please enter " + integer05 + " Strings");
			for(int i = 0 ; i < integer05 ; i++) 
			{
				array05.add(scanner.nextLine()); 
			}
			System.out.println(Problem05(array05));
			
			
			
			System.out.println("Enter number of strings for Problem06: ");
			int integer06 = Integer.parseInt(scanner.nextLine()); 
			ArrayList<String> array06 = new ArrayList<>();
			System.out.println("Enter " + integer06 + " Strings");
			for(int i = 0 ; i < integer06 ; i++) 
			{
				array06.add(scanner.nextLine());
			}
			System.out.println(Problem06(array06));
		}
		catch (NumberFormatException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void Problem01(String[] String1) 
	{
		Map<String,Integer> map = new HashMap<>();
		for(String item : String1)
		{
			if(!map.containsKey(item) && !item.isEmpty())
			{
				map.put(item, 1);
			}
			else
			{
				map.computeIfPresent(item, (k, v) -> v + 1);
			}
		}
		
		System.out.println(map);
	}
	
	public static Map<String,String> Problem02(String[] String2)
	{
		Map<String,String> map = new HashMap<>();
		
		for(String item : String2) 
		{
			String value = "";
			for(int i=0;i<String2.length;i++)
			{
				if(item.charAt(0) == String2[i].charAt(0)) 
				{
					value = value + String2[i];
				}
			}
			if(!map.containsKey(item.charAt(0) + ""))
				map.put(item.charAt(0) + "", value);
		}
		
		return map;
	}
	
	public static Set<Integer> Problem03(Integer[] int03) 
	{
		Set<Integer> S03 = new LinkedHashSet<>();
		for(int i=0 ; i < int03.length ; i++) {
			if(!S03.contains(int03[i])) {
				S03.add(int03[i]);
			}
			else {
				S03.add( int03[i] + 1 );
			}
		}
		
		
		return S03;
	}

	public static ArrayList<String> Problem04(ArrayList<String> array04)
	{
		ArrayList<String> q04 = new ArrayList<>();
		for(String item : array04) 
		{
			q04.add(removeDuplicates(item));
		}
		
		return q04;
	}
	
	static String removeDuplicates(String s04)   
    {      
        LinkedHashSet<Character> set = new LinkedHashSet<>();   
        for(int i=0;i<s04.length();i++)   
            set.add(s04.charAt(i));   
        
        StringBuilder strbuilder = new StringBuilder();
        for (Character character : set) {
        	strbuilder.append(character);
        }
        
        return strbuilder.toString();
           
    } 

	public static Map<String,String> Problem05(ArrayList<String> arr05)
	{
		Map<String, String> map05 = new HashMap<>();
		
		for(String item : arr05)
		{
	        int n = item.length();
	        String first = "" + item.charAt(0);
	        String last = "" + item.charAt(n - 1); 
	        map05.put(first, last);
		}
		return map05;
	}
	
	public static Map<String,Boolean> Problem06(ArrayList<String> S06)
	{
		Map<String,Boolean> map06 = new HashMap<>();
		Map<String,Integer> m06 = new HashMap<>();
		
		for(String item : S06) 
		{
			if(!m06.containsKey(item)) 
			{
				m06.put(item, 1);
			}
			else
			{
				int value = m06.get(item);
				m06.put(item, value + 1);
			}
		}
		
		for (Map.Entry<String,Integer> item : m06.entrySet()) 
		{
			if(item.getValue() >= 2) 
			{
				map06.put(item.getKey(), true);
			}
			else
			{
				map06.put(item.getKey(), false);
			}
		}
		return map06;
	}
}

