package interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {

	public void dodajKurs(Valuta nova);
	public boolean izbrisiKurs(Valuta nepotrebna);
	public double pronadjiKurs(GregorianCalendar dat, String trazena);
	
}
