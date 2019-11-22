package tema4.ejercicio_bloque03_ejercicio06;

public class Principal {
	public static void main(String[] args) {

		
		// Primeros platos
		Plato macarrones = new Plato("macarrones", 5f);
		Plato tortilla = new Plato("tortilla", 3f);
		Plato solomillo = new Plato("solomillo", 10f);
		Plato pizza = new Plato("pizza", 7.5f);
		Plato flamenquin = new Plato("flamenquin", 9f);
		Plato sanJacobo = new Plato("sanJacobo", 11f);
		Plato habicholones = new Plato("Habicholones", 4f);
		
		// Segundos platos
		Plato solomilloRoquefort = new Plato("Solomillo Roquefort", 7f);
		Plato bacalao = new Plato("bacalao", 10f);
		Plato lenguado = new Plato("lenguado", 12f);
		Plato pulpo = new Plato("pulpo", 15f);
		Plato ensalada = new Plato("ensalada", 5f);
		Plato calamares = new Plato("calamares", 8f);
		
		// Terceros platos
		Plato tartaAbuela = new Plato("Tarta de la abuela" , 4f);
		Plato natillas = new Plato("natillas" , 4f);
		Plato tartaQueso = new Plato("tartaQueso" , 4.5f);
		Plato tarta3Chocolates = new Plato("tarta3Chocolates" , 6f);
		Plato fruta = new Plato("Plato" , 3f);

		// Construimos los menús
		Menu menus[] = new Menu[3];
		menu[0] = new Menu(lenguado, pulpo, fruta);
		menu[1] = new Menu(flamenquin, ensalada, natillas);
		menu[2] = new Menu(flamenquin, solomilloRoquefort, tarta3chocolates);
		
		// Imprimimos menús con su precio
		for (int i = 0; i < menus.length; i++) {
			System.out.println(menus[i].toString);
		}
		
		
	}

}