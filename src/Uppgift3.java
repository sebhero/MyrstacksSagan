public class Uppgift3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Kurs kurs1 = new Kurs();
		Kurs kurs2 = new Kurs();

		kurs1.set_kurskod("DT006G2");
		kurs1.set_kursnamn("Java I");
		kurs1.set_totalpoints("7.5");
		kurs1.set_beskrivning("Grundläggande kurs i java");

		kurs2.set_kurskod(Skrivare.popup("Vad är kurskoden?"));
		kurs2.set_kursnamn(Skrivare.popup("Vad är kursnamnet?"));
		kurs2.set_totalpoints(Skrivare.popup("hur många poäng är kursen?"));
		kurs2.set_beskrivning(Skrivare
				.popup("Vänligen ge en beskrivning av kursen?"));

		Skrivare.skrivUt(kurs1.toString() + "\n");
		Skrivare.skrivUt(kurs2.toString());

	}
}
