package memory_game;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class Collection_cards {
	
	ArrayList<Card> cards = new ArrayList<Card>(); 
	ArrayList<Card> cards2 = new ArrayList<Card>(); 
	ArrayList<Card> cards_double = new ArrayList<Card>();
	Iterator<Card> iterator = cards_double.iterator();
	
	
	
	public void Add_card() {
		
		System.out.println("hello pleas enter this informations to get started :");
		//cards.add(new Card());
		cards.add(new Card("path1","name1"));
		cards.add(new Card("path2","name2"));
		//cards.add(new Card("path3","name3"));
		//cards.add(new Card("path4","name4"));
		//cards.add(new Card("path5","name5"));
		
		
	}
	
	public void Double_cards_randome() {
		
		cards_double.addAll(cards);
		cards_double.addAll(cards);
		Collections.shuffle(cards_double);
		
	}
	
	public void show_allcards() {
		Double_cards_randome();
		System.out.println("You have 10 seconds to remember this:");
	    
	    for (int i = 0; i < cards_double.size(); i++) {
	        System.out.println("Index " + i + ": " + cards_double.get(i));
	    }
	}
	
	
	
	public void Clear() {
	    System.out.println("u have to get two tings click start to play ");
	    Timer timer = new Timer();
	    timer.schedule(new TimerTask() {
	        @Override
	        public void run() {
	        	System.out.print("\033[H\033[2J");  
	        	System.out.flush();  // Call the method to clear the console
	        }
	    }, 2000);
	}
	
	public void Play() {
		System.out.println("give me two members from 0 to 5 :");
		Scanner s =new Scanner(System.in);
		int x,y,i=3,win=0;
		while(i<=0 || win<cards_double.size()/2) {
			x=s.nextInt();
			y=s.nextInt();
			
			if(cards_double.get(x).id_card==cards_double.get(y).id_card && x!=y){
	        	System.out.println("correct u have "+(cards_double.size()-2)+" and u eliminate the "+x+" and "+y);
	        	win++;
	        }else {
	        	System.out.println("try again :( u have "+i+" more tryies ");
	        	i--;
	        }
		}
		if (i<=0) System.out.println("u loooose :(");
		else System.out.println("u win :) ");
	}

}
