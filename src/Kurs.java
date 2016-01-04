import java.text.MessageFormat;

/**
 * 
 * @author seb
 * 
 */

public class Kurs {
	String _kurskod;
	private String _kursnamn;
	private String _totalpoints;
	private String _beskrivning;

	public Kurs() {
		// default konstruktur.
	}

	@Override
	public String toString() {

		return MessageFormat.format("kurskod: \t {0}\n" + "kursnamn: \t {1}\n"
				+ "antal poäng: \t {2}\n" + "beskrivning: \t {3}\n", _kurskod,
				_kursnamn, _totalpoints, _beskrivning);
	}

	public String get_kurskod() {
		return _kurskod;
	}

	public void set_kurskod(String _kurskod) {
		this._kurskod = _kurskod;
	}

	public String get_kursnamn() {
		return _kursnamn;
	}

	public void set_kursnamn(String _kursnamn) {
		this._kursnamn = _kursnamn;
	}

	public String get_totalpoints() {
		return _totalpoints;
	}

	public void set_totalpoints(String _totalpoints) {
		this._totalpoints = _totalpoints;
	}

	public String get_beskrivning() {
		return _beskrivning;
	}

	public void set_beskrivning(String _beskrivning) {
		this._beskrivning = _beskrivning;
	}
}
