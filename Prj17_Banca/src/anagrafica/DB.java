package anagrafica;

import java.util.ArrayList;

import model.Cliente;
import model.ContoCorrente;

public class DB {
	private static ArrayList<Cliente> clienti = new ArrayList<Cliente>();
	private static ArrayList<ContoCorrente> conti = new ArrayList<ContoCorrente>();
	
	public static ArrayList<Cliente> getClienti() {
		return clienti;
	}

	public static ArrayList<ContoCorrente> getConti() {
		return conti;
	}

	public void addCliente(Cliente c) {
		this.clienti.add(c);
	}
	
	public void addContoCorrente(ContoCorrente c) {
		this.conti.add(c);
	}
	
	
	
}
