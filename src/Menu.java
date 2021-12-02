import Prog1Tools.IOTools;
import java.text.DecimalFormat;

public class Menu {

	public static void main(String[] args) {
		
		System.out.println("Lagerstatistik");
		System.out.println("===============");
		System.out.println("1.Durchschnittlicher Lagerbestand");
		System.out.println("2.Umsatzgeschwindigkeit");
		System.out.println("3.Lagerdauer");
		System.out.println("9.Programmende");
		System.out.println();
		
		float bestand_anfang, bestand_end, lagerbestand_dursch, umsatzgeschwind, umsatz_einstandpreisen, lagerdauer_dursch, bericht;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		bestand_anfang = IOTools.readInteger("Geben Sie den Anfangsbestand ein: ");
		bestand_end = IOTools.readInteger("Geben Sie den Endbestand ein: ");
		umsatz_einstandpreisen = IOTools.readInteger("Geben Sie den Umsatz zu Einstandpreisen ein: ");
		bericht = IOTools.readInteger("Geben Sie die Nummer des Berichtes ein (1,2,3) oder Programmende (9): ");
		
		lagerbestand_dursch = (bestand_anfang + bestand_end) / 2;
		
		umsatzgeschwind = umsatz_einstandpreisen / lagerbestand_dursch;
		
		lagerdauer_dursch = 360 / umsatzgeschwind;
		
		System.out.println();
		System.out.println("Lagerstatistik");
		System.out.println("===============");
		
		if (bericht == 1) {
			System.out.println("Bericht N1");
			System.out.println("Durchschnittlicher Lagerbestand: " + df.format(lagerbestand_dursch));
		} else if (bericht == 2) {
			System.out.println("Bericht N2");
			System.out.println("Umsatzgeschwindigkeit: " + df.format(umsatzgeschwind));
		} else if (bericht == 3) {
			System.out.println("Bericht N3");
			System.out.println("Lagerdauer: " + df.format(lagerdauer_dursch));
		} else {
			System.out.println("Bericht N9");
			System.out.println("Programmende: falsche Eingabe");
		}

	}

}
