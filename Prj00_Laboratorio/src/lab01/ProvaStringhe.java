package lab01;

public class ProvaStringhe {

	public static void main(String[] args) {
		String nome = "giuseppe";
		System.out.println(nome);
		System.out.println(nome.toUpperCase());
		System.out.println(nome.equals("pippo"));
		System.out.println(nome.equalsIgnoreCase("GiuseppE"));
		System.out.println(nome.length());
		System.out.println(nome.charAt(3));
		System.out.println(nome.charAt(nome.length()-1));
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}

}
