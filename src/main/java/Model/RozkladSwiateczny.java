package Model;

import java.time.LocalDateTime;

public class RozkladSwiateczny extends DekoratorRozkladu {
	private String _typSwieta;

	public RozkladSwiateczny(IRozklad aRozklad, String aTypSwieta) {
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