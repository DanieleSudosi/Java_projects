package model;

public class Barca extends VeicoloTargato implements Noleggiabile {

	public Barca(String targa) {
		super(targa);
		this.tipo= tipo.BARCA;
		this.tipoPatente = tipoPatente.C;
		this.prezzo = getPrezzoCasuale();
	}
	
	@Override
	public double getCostoNoleggio() {
		
		return getPrezzoVendita()/tipo.getFattore();
	}

	@Override
	public double getPrezzoVendita() {

		return prezzo * 1.22 + 45000;
	}

	@Override
	public String toString() {
		return super.toString() + MESSAGGIO ;
	}

	
}
