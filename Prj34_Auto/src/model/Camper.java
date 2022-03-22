package model;

public class Camper extends VeicoloTargato{
	

	public Camper(String targa) {
		
		super(targa);
		this.tipo = TipoVeicolo.CAMPER;	
		this.tipoPatente = tipoPatente.D;
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
