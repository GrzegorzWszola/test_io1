package Model;

import java.time.LocalDateTime;

public class RozkladNocny extends DekoratorRozkladu {
	private float _czasStartu;
	private float _czasKonca;

	public RozkladNocny(IRozklad aRozklad, float aCzasStartu, float aCzasKonca) {
		super(aRozklad);
		throw new UnsupportedOperationException();
	}

	public String opisz() {
		throw new UnsupportedOperationException();
	}

	public Linia[] getLinie() {
		throw new UnsupportedOperationException();
	}

	public int getTyp() {
		throw new UnsupportedOperationException();
	}

	public LocalDateTime getDataOd() {
		throw new UnsupportedOperationException();
	}

	public int getCzestotliwoscPrzejazdow() {
		throw new UnsupportedOperationException();
	}
}