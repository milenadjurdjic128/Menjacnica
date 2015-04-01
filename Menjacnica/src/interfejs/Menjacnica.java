package interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> niz = new LinkedList<Valuta>();
	
	public void dodajKurs(Valuta nova) {
		if (nova == null) 
			throw new RuntimeException("Nepravilan unos.");
		
		if(niz.contains(nova))
			throw new RuntimeException("Vec postoji.");
		
		niz.add(nova);
	}

	public boolean izbrisiKurs(Valuta nepotrebna) {
		if(nepotrebna == null)
			throw new RuntimeException("Morate uneti koji kurs zelite da izbrisete");
		if(!(niz.contains(nepotrebna)))
			throw new RuntimeException("Uneti kurs ne postoji");
		
		boolean izbrisan = false;
		
		niz.remove(nepotrebna);
		
		if(!(niz.contains(nepotrebna))) {
			izbrisan = true;
		} else {
			izbrisan = false;
		}
		
		return izbrisan;
	}

	public Valuta pronadjiKurs(GregorianCalendar dat, String trazena) {
		if(trazena == null || dat == null)
			throw new RuntimeException("Morate uneti sve podatke.");
			
		Valuta v = new Valuta();
			for (int i = 0; i < niz.size(); i++) {
				if ( (niz.get(i).getNaziv().equals(trazena) || 
						niz.get(i).getSkraceniNaziv().equals(trazena)) 
						&& niz.get(i).getDatum().equals(dat)) {
					
						v = niz.get(i);
						break;
				}
			}
		return v;
	}

}
