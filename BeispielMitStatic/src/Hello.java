
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
		String text = "A pajzsmirigy alulm?k?d?se (hypothyreosis) k?l?nb?z? ?letkorokban sokszor elt?r? m?don alakul ki, de bizonyos form?i gyermekkort?l a feln?ttkoron ?t az id?skorig egyar?nt kimutathat?ak ?s hasonl? t?netekkel jelentkeznek.\r\n";
		nk.printNurKonsonanten(text);
	}

	public static void write(int i)
	{
		System.out.println("Hello, i="+i);
	}
}

