package interfejs;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	private LinkedList<Valuta> lista = new LinkedList<Valuta>();
	
	public void dodajKurs(Valuta nova) {

		if (nova == null) 
			throw new RuntimeException("Nepravilan unos.");
		
		if(lista.contains(nova))
			throw new RuntimeException("Vec postoji.");

		lista.add(nova);
	}

	public boolean izbrisiKurs(Valuta nepotrebna) {
		if(nepotrebna == null)
			throw new RuntimeException("Morate uneti koji kurs zelite da izbrisete");
		if(!(lista.contains(nepotrebna)))
			throw new RuntimeException("Uneti kurs ne postoji");
		
		boolean izbrisan = false;
		
		lista.remove(nepotrebna);
		
		if(!(lista.contains(nepotrebna))) {
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
			for (int i = 0; i < lista.size(); i++) {
				if ( (lista.get(i).getNaziv().equals(trazena) || 
						lista.get(i).getSkraceniNaziv().equals(trazena)) 
						&& lista.get(i).getDatum().equals(dat)) {
					
						v = lista.get(i);
						break;
				}
			}
		return v;
	}

}
