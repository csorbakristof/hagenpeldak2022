
public class NurKonsonanten {


	public void printNurKonsonanten(String text)
	{
		String vokale = "AÁEÉaáeéiíoóöõuúüû";
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
