package anagrafica;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import model.clienti.Cliente;
import model.clienti.ClienteNoleggiatore;

public class AnagraficaClienti {

	
	public static Map<Integer,Cliente> clienti;
	
	static {
		
		clienti = new TreeMap<>();
		
		Cliente c1 = new Cliente("Pippo");
		Cliente c2 = new ClienteNoleggiatore("Paperino");
		Cliente c3 = new Cliente("Paperina");
		Cliente c4 = new ClienteNoleggiatore("Franco");
		Cliente c5 = new Cliente("Minne");
		Cliente c6 = new ClienteNoleggiatore("Andrea");
		
		clienti.put(c1.getCodCliente(), c1);
		clienti.put(c2.getCodCliente(), c2);
		clienti.put(c3.getCodCliente(), c3);
		clienti.put(c4.getCodCliente(), c4);
		clienti.put(c5.getCodCliente(), c5);
		clienti.put(c6.getCodCliente(), c6);
		
	}
}
