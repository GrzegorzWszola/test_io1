package Kontroler;

import Model.IModel;
import java.time.LocalDateTime;

public class ZgłoszeniePrzyjazduNaPrzystanek {
	private IModel _model;
	private int _identyfikatorKursu;
	private int[] _kurs;
	private LocalDateTime _czasPrzyjazdu;
	private LocalDateTime _czasPoprzedniegoPrzyjazdu;
	private int _sumaOpóźnień;

	public ZgłoszeniePrzyjazduNaPrzystanek(int aIdentyfikatorKursu, int[] aKurs) {
		throw new UnsupportedOperationException();
	}

	public void zglosPrzyjazd() {
		throw new UnsupportedOperationException();
	}

	private String wyświetlanieInformacjiONastępnymPrzystanku() {
		throw new UnsupportedOperationException();
	}

	private int obliczenieOpóźnienia() {
		throw new UnsupportedOperationException();
	}

	private LocalDateTime aktualizujSumeOpóźnień() {
		throw new UnsupportedOperationException();
	}

	private LocalDateTime przypiszAktualneOpóźnienie() {
		throw new UnsupportedOperationException();
	}
}