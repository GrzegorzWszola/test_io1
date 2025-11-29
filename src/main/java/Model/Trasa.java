package Model;

import java.util.List;
import java.util.Map;

public class Trasa {
	private int _nrTrasy;
	private String _kierunek;
	private Przystanek[] _przystanki;
	private List<Map<Float, Przystanek>> _czasNaPrzystanek;
	private float _calkowityCzasPrzejazdu;

	public Trasa(int aNrTrasy, String aKierunek, Przystanek[] aPrzystanki, List<Map<Float, Przystanek>> aCzasNaPrzystanek, float aCalkowityCzasPrzejazdu) {
		throw new UnsupportedOperationException();
	}

	public String opisz() {
		throw new UnsupportedOperationException();
	}
}