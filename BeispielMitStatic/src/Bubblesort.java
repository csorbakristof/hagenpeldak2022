
public class Bubblesort {
	public void sort(int[] feld) {
		printFeld(feld);
		for (int i = 0; i < feld.length - 1; i++) {
			boolean nemvoltCsere = true;
			
			// Egyszer v?gigmegy?nk a "bubor?kkal" a t?mb?n
			//for (int j = 0; j < feld.length - 1 - i; j++) {
			for (int j = 0; j < feld.length - 1; j++) {
				if (feld[j] > feld[j + 1]) {
					int temp = feld[j];
					feld[j] = feld[j + 1];
					feld[j + 1] = temp;
					nemvoltCsere = false;
				}
			}
			System.out.println("i="+i);
			printFeld(feld);
			
			if (nemvoltCsere) { // == true) {
				break;
			}
		}
	}
	
	private void printFeld(int[] feld)
	{
		for (int i = 0; i < feld.length; i++) {
			System.out.print(feld[i]+" ");
		}
		System.out.println();
	}
}
