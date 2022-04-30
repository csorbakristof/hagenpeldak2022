
public class Hello {

	private int a;
	private static int b;
	
	public static void main(String[] args) {
		Person.staticShow();
		
		Person macilaci = new Person(12);
		Person drBubo = new Person(11);
		Person macilaci2 = macilaci; //.clone();
		macilaci2.Age = 5;

		Person.staticShow();

		macilaci.show();
		
		Hello h = new Hello();
		h.a=5;
		
		for(int i=0; i<5; i++)
			write(i);
		
		String s = String.valueOf(3.141592);
		int szam = Integer.parseInt("12");
		
		System.out.println(macilaci); //.toString());
	
		System.out.println("Bubblesort:");
		Bubblesort sorter = new Bubblesort();
		sorter.sort(new int[] {5, 4, 2, 1});
		
		NurKonsonanten nk = new NurKonsonanten();
		String text = "A pajzsmirigy alulmûködése (hypothyreosis) különbözõ életkorokban sokszor eltérõ módon alakul ki, de bizonyos formái gyermekkortól a felnõttkoron át az idõskorig egyaránt kimutathatóak és hasonló tünetekkel jelentkeznek.\r\n";
		nk.printNurKonsonanten(text);
	}

	public static void write(int i)
	{
		System.out.println("Hello, i="+i);
	}
}

