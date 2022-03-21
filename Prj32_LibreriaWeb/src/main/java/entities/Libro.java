package entities;

public class Libro {

	private int id;
	private int editoreId;
	private String titolo;
	private double prezzo;
	private int pagine;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(int id, int editoreId, String titolo, double prezzo, int pagine) {
		this.id = id;
		this.editoreId = editoreId;
		this.titolo = titolo;
		this.prezzo = prezzo;
		this.pagine = pagine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEditoreId() {
		return editoreId;
	}

	public void setEditoreId(int editoreId) {
		this.editoreId = editoreId;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) {
		this.pagine = pagine;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [id=");
		builder.append(id);
		builder.append(", editoreId=");
		builder.append(editoreId);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append(", pagine=");
		builder.append(pagine);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
