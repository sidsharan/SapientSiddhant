package mainpack;

//import static 

enum Apple {
	John(4), GoldenDel(8), RedDel(7), Winesap(0), Cortland(56);

	private int price;

	// constructor

	Apple(int p) {
		price = p;
	}

	public int getPrice() {
		return price;
	}
}

public class EnumDemo {

	public static void main(String[] args) {

		Apple ap;
		System.out.println("All apple constants");

		// use values()
		Apple allapples[] = Apple.values();
		for (Apple a : allapples)
			System.out.println(a);

		// use valueOf()
		ap = Apple.valueOf("Winesap");
		System.out.println("ap contains " + ap);

		//display price
		
	System.out.println("Winesap price is " + Apple.Winesap.getPrice());
		
		// display all prices
	
	for(Apple a : Apple.values())
	{
		System.out.println(a + " costs " + a.getPrice());
	}
		
	}
}
