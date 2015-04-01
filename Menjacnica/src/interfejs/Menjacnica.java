package interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

LinkedList<Valuta> lista = new LinkedList<Valuta>();
	
	public void dodajKurs(Valuta nova) {
		
		if(nova == null || lista.contains(nova))
			throw new RuntimeException("Nemoguce je uneti nepostojeci ili vec postojeci kurs.");
	
		lista.add(nova);
	}

	public boolean izbrisiKurs(Valuta nepotrebna) {
		// TODO Auto-generated method stub
		return false;
	}

	public double pronadjiKurs(GregorianCalendar dat, String trazena) {
		// TODO Auto-generated method stub
		return 0;
	}

}
