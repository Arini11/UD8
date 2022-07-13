public class MainApp {
	
	public static void main(String[] args) {
		Persona p1 = new Persona("39933791H");
		Persona p2 = new Persona("Arnau", 19, "39933791H", genero.HOMBRE);
		Persona p3 = new Persona("Ionela", 30, genero.MUJER, "123456789I", 65, 1.72);
		System.out.println(p1.toString() + p2.toString() + p3.toString() );

		Password password = new Password();
		System.out.println(password.getContraseña());
		
		Electrodomestico e1 = new Electrodomestico(99.99, 44);
		Electrodomestico e2 = new Electrodomestico(124.99, colores.BLANCO, consumo.A, 44);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		Serie s1 = new Serie("Curro Jiménez", "Mario Camus");
		Serie s2 = new Serie("Plats Bruts", 6, "Sitcom", "Joel Joan");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}

}
