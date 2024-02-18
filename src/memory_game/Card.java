package memory_game;
import java.util.Scanner;

public class Card {
	
	static int id;
	int id_card;
	String path_image;
	String name;
	
	public Card(String p, String n) {
		path_image=p;
		name=n;
		id++;
		id_card=id;
	}
	public Card() {
		Scanner s =new Scanner(System.in);
		System.out.println("give me the path ");
		path_image= s.next();
		System.out.println("hello enter the name if card :");
		name= s.next();
		id++;
		id_card=id;
		
	}
	
	@Override 
	public String toString () {
		return "the id is "+ id_card + " the name is : "+ name;
	}

}
