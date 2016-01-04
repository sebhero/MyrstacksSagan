import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

/**
 * Help class for displaying text
 * 
 * @author seb
 * @version 1
 */
public class Skrivare {

	public static BufferedReader _lineReader = new BufferedReader(
			new InputStreamReader(System.in));

	/**
	 * Console ask user a question and return answer as a String Returns answer
	 * from user
	 * 
	 * @return String answer from user
	 */
	public static String ask(String question) {
		System.out.println(question);
		try {
			String svar = _lineReader.readLine();
			if (svar != null && !svar.isEmpty()) {
				return svar;
			} else {
				Skrivare.skrivUt("ogiltigt svar");
				return ask(question);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			return ask(question);
		}
	}

	/**
	 * Prints out text
	 * 
	 */
	public static void skrivUt(String text) {
		System.out.println(text);
	}

	/**
	 * popup ask user a question and return answer as a String Returns answer
	 * from user
	 * 
	 * @return String answer from user
	 */
	public static String popup(String question) {
		return JOptionPane.showInputDialog(question);
	}
}
