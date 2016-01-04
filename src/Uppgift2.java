import java.text.MessageFormat;

public class Uppgift2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		// 1. Namnet p� myran
		// 2. Vem myran bor med
		// 3. Hur m�nga syskon myran har
		// 4. Var n�gonstans i skogen myrstacken finns
		// 5. Vad myran och syskonen b�r in till stacken
		// 6. Vad myran och syskonen mer b�r in till stacken
		// 7. Vad det �r f�r speciell dag som g�r att myran �r ledig

		Skrivare.skrivUt("Välkommen till myr sagan.");
		// String name = "ulf";
		// String liveWith = "mamma och bror";
		// String siblings = String.valueOf(2);
		// String antColony = "damm";
		// String antCollect = "jordgubbar";
		// String antCollect2 = "godis";
		// String freeDay = "f�delsedag";
		String name = Skrivare.ask("Vad heter myran?");
		String liveWith = Skrivare.ask("hos vem bor myran?");
		String siblings = Skrivare.ask("hur många syskon har myran?");
		String antColony = Skrivare.ask("Vid vad finns myrstacken i skogen?");
		String antCollect = Skrivare.ask("Vad samlar myran mest på?");
		String antCollect2 = Skrivare.ask("Vad samlar myran också på?");
		String freeDay = Skrivare
				.ask("Vad är det för speciell dag idag, och därför är myran ledig?");

		String story = MessageFormat
				.format("Den lilla myran {0}\n\n"
						+ "Det var en gång en liten,"
						+ " liten myra som bodde med sin {1} \n"
						+ "och sina {2} syskon i en myrstack, vid en stor {3} i skogen. \n"
						+ "Den lilla myran hette {0}. För det mesta brukade {0} och hans syskon arbeta \n"
						+ "med att bära in {4} och {5} till stacken, men idag var det {6}, \n"
						+ "så därför var {0} ledig.\n", name, liveWith,
						siblings, antColony, antCollect, antCollect2, freeDay);

		Skrivare.skrivUt(story);
		Skrivare.skrivUt("\n slut på sagen");
	}

}
