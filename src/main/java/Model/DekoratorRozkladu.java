package Model;

import java.time.LocalDateTime;

public class DekoratorRozkladu implements IRozklad {
	protected IRozklad _rozklad;

	public DekoratorRozkladu(IRozklad aRozklad) {
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

	public String opisz() {
		throw new UnsupportedOperationException();
	}
}