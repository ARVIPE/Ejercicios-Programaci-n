package tema6;

public class eje2bloq2 {
	
	public eje2bloq2() {
		
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
	
	public static void main(String[] args) {
		ejercicio03();
	}

}
