package Model;

import java.time.LocalDateTime;

public interface IRozklad {

	public Linia[] getLinie();

	public int getTyp();

	public LocalDateTime getDataOd();

	public int getCzestotliwoscPrzejazdow();

	public String opisz();
}