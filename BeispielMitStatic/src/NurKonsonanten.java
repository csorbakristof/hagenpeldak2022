
public class NurKonsonanten {


	public void printNurKonsonanten(String text)
	{
		String vokale = "A�E�a�e�i�o���u���";
		int length = text.length();
		for (int i=0; i<length; i++)
		{
			char aktuelleCharakter = text.charAt(i);
			int positionDieserCharakterInVokale =
					vokale.indexOf(aktuelleCharakter);
			if (positionDieserCharakterInVokale == -1) { // Nicht gefunden
				System.out.print(aktuelleCharakter);
			}
		}
	}
}
