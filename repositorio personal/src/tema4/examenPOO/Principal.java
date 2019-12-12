package tema4.examenPOO;


public class Principal {

	public static void main(String[] args) {
	
		ObjetoAfregar objetoAfregar = new ObjetoAfregar();
		
		objetoAfregar.imprimir();
		
		
		System.out.println("Una vez limpiado todo");
		ObjetoAfregar.limpiar();
		objetoAfregar.imprimir();

		
		
	}

}
