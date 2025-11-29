package Model;

public interface IModel {

	public Kierowca znajdzKierowce(int aNrKierowcy);

	public Przystanek[] znajdzPrzystankiTrasy(Linia aLinia, String aKierunekTrasy);

	public void zapiszRozklad(String aRozklad);

	public void aktualizujStatusPrzystanku(int aIdPrzystanku, int aStatus);

	public Pojazd znajdzPojazd(int aNrPojazdu);

	public void zapiszPrzyjazd(Przystanek aDanePrzystanku);

	public Linia znajdzLinie(int aNrLinii);
}