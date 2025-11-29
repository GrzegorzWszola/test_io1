package Model;

import java.time.LocalDateTime;

public class RozkladPodstawowy implements IRozklad {
	private Linia[] _linie;
	private int _typ;
	private LocalDateTime _dataOd;
	private int _czestotliwoscPrzejazdow;

	public RozkladPodstawowy(int aNrLinii, int aTyp, LocalDateTime aDataOd, int aCzestotliwoscPrzejazdu) {
		throw new UnsupportedOperationException();
	}

	public Linia[] getLinie() {
		return this._linie;
	}

	public int getTyp() {
		return this._typ;
	}

	public LocalDateTime getDataOd() {
		return this._dataOd;
	}

	public int getCzestotliwoscPrzejazdow() {
		return this._czestotliwoscPrzejazdow;
	}

	public String opisz() {
		throw new UnsupportedOperationException();
	}
}