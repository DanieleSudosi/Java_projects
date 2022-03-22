package model;

public class Camion extends VeicoloTargato {

	public Camion(String targa) {
		
		super(targa);
		this.tipo = tipo.CAMION;
		this.tipoPatente = tipoPatente.C;
		this.prezzo = getPrezzoCasuale();
	}

	@Override
	public double getCostoNoleggio() {
		
		return getPrezzoVendita()/tipo.getFattore();
		
	}

	@Override
	public double getPrezzoVendita() {
		return prezzo * 1.22 + 10000;
	}
	
}
