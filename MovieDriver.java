import java.util.*;

public class MovieDriver {
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Movie m = new Movie();
		
		String choice = "";
		
		do
		{
			System.out.println("Enter Movie Title: ");
			String t = keyboard.nextLine();
			m.setTitle(t);
			System.out.println("Enter Movie Rating: ");
			String r = keyboard.nextLine();
			m.setRating(r);
			System.out.println("Enter Movie Tickets Sold: ");
			int s = keyboard.nextInt();
			m.setSoldTickets(s);
			keyboard.nextLine();
			
			System.out.println(m.toString());
			
			System.out.println("\nDo you wish to continue? (y/n)");
			choice = keyboard.nextLine();
			
		}while(choice.equals("y"));
		
		System.out.println("Goodbye");
		
	}

}
