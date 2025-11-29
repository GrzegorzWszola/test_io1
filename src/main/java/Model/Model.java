package Model;

public class Model implements IModel {
	private Inwentarz _inwentarz;
	private IDAO _dao;
	public IDAO _unnamed_IDAO_;

	public Model(Inwentarz aInwentarz, IDAO aDao) {
		throw new UnsupportedOperationException();
	}

	public Kierowca znajdzKierowce(int aNrKierowcy) {
		throw new UnsupportedOperationException();
	}

	public Przystanek[] znajdzPrzystankiTrasy(Linia aLinia, String aKierunekTrasy) {
		throw new UnsupportedOperationException();
	}

	public void zapiszRozklad(String aRozklad) {
		throw new UnsupportedOperationException();
	}

	public void aktualizujStatusPrzystanku(int aIdPrzystanku, int aStatus) {
		throw new UnsupportedOperationException();
	}

	public Pojazd znajdzPojazd(int aNrPojazdu) {
		throw new UnsupportedOperationException();
	}

	public void zapiszPrzyjazd(Przystanek aDanePrzystanku) {
		throw new UnsupportedOperationException();
	}

	public Linia znajdzLinie(int aNrLinii) {
		throw new UnsupportedOperationException();
	}
}