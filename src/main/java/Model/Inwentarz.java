package Model;

public class Inwentarz {
	private IDAO _dao;
	private Linia[] _linie = null;
	private Przystanek[] _przystanki = null;
	private Pojazd[] _pojazdy = null;
	private Kierowca[] _kierowcy = null;
	private IRozklad[] _rozklady = null;

	public Inwentarz(IDAO aDao) {
		throw new UnsupportedOperationException();
	}

	public Linia[] getLinie() {
		return this._linie;
	}

	public Przystanek[] getPrzystanki() {
		return this._przystanki;
	}

	public Pojazd[] getPojazdy() {
		return this._pojazdy;
	}

	public Kierowca[] getKierowcy() {
		return this._kierowcy;
	}

	public IRozklad[] getRozklady() {
		return this._rozklady;
	}
}