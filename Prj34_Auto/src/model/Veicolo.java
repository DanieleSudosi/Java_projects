package model;

import java.util.Random;

public abstract class Veicolo implements Comparable<Veicolo> {// Pascal case

	private static int counter = 1;

	private int id;
	protected TipoVeicolo tipo;
	protected int anno;
	protected double prezzo;
	protected double costoNoleggio;// camel case
	protected double prezzoVendita;

	public Veicolo(int anno) {
		this();
		this.anno = anno;
	}

	public Veicolo() { // Pascal case

		this.id = counter++;// vincolo progettuale
	}

	public double getPrezzoCasuale() {

		double price = 0;
		Random r = new Random();

		switch (tipo) {
		case AUTO -> price = r.nextDouble(15000);
		case BARCA -> price = r.nextDouble(50000);
		case CAMION -> price = r.nextDouble(150000);
		case BICI -> price = r.nextDouble(5000);
		case CAMPER -> price = r.nextDouble(75000);
		case MONO_PATTINO -> price = r.nextDouble(1500);
		}

		return price;
	}
	
	public void setAnno(int anno) {
		this.anno = anno;
	}

	public abstract double getCostoNoleggio();// camel case

	public abstract double getPrezzoVendita();

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Veicolo o) {

		return this.id - o.id;
	}

	@Override
	public String toString() {

		return "id: " + id +
			" tipo: " + tipo + 
			"\nprezzo vendita: " + getPrezzoVendita() + 
			"\ncosto noleggio giornaliero: " + getCostoNoleggio() +
			"\nAnno :" +anno;
	}

}
