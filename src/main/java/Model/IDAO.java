package Model;

public interface IDAO {

	public Linia znajdzLinie(int aNrLinii);

	public Pojazd znajdzPojazd(int aNrPojazdu);

	public Kierowca znajdzKierowce(int aNrKierowcy);

	public void dodajRozklad(String aRozklad);

	public void edytujPrzystanek(Przystanek aPrzystanek);
}