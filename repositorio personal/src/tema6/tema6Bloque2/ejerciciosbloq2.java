package tema6.tema6Bloque2;

public class ejerciciosbloq2 {
	
	public ejerciciosbloq2() {
		
	}

	public static void ejercicio(){
	float x = 0;
	float y1;
	float y2;
	
		do{
			y1 = (float) Math.sqrt(x);
			y2 =  (float) (Math.log(x) * (-1));
			x += 0.001;
		}while((Math.abs(y1-y2) < 0.001f) == false);
		
		System.out.println(x);
		System.out.println(y1);
		System.out.println(y2);
	
	}
	
	public static void ejercicio03() {
		double y = 0;
		double contador = 1;
		double x = 1;
		do {
			contador++;
			if(contador % 2 == 0) {
				y+= 4/x;
			}else {
				y-= 4/x;
			}
			x = x + 2;
		}while(!((Math.abs(Math.PI - y)) < 0.000001));
		System.out.println(y);
	}
	
	public static void ejercicio04() {
		double h = 0;
		double c1 = 2;
		double c2 = 3;
		h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		
		System.out.println("La hipotenusa de un triangulo de lados "+c1+" y "+c2+" es " + h);
		
		
	}
	
	public static void ejercicio05() {
		float x = 0;
		
		float xAnterior = 0;
		float xSiguiente = 0;
		
		int contadorMaximos = 0;
		
		do {
			if(x * Math.sin(x)> xAnterior * Math.sin(xAnterior) && (x * Math.sin(x)) > xSiguiente * Math.sin(xSiguiente)) {
				
				System.out.println(x + " es un máximo");
				contadorMaximos++;
			}
			x+= 0.01f;
			xAnterior = x - 0.01f;
			xSiguiente = x + 0.01f;
		}while(!(contadorMaximos == 5));
	}
	
	
	public static void main(String[] args) {
		ejercicio05();
	}

}
