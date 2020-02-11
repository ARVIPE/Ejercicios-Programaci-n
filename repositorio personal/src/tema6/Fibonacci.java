package tema6;

public class Fibonacci {
	
//	public static void main(String[] args) {
//		float ant2 = 0, ant = 0, actual = 1;
//		
//		for(int i = 0; i < 10; i++) {
//			ant2 = ant;
//			ant = actual;
//			actual = ant2 + ant;
//			
//			System.out.println("  " + actual);
//		}
//	}
	
	public static void main(String[] arg) {
		double ant2 = 0, ant = 0, actual = 1;
		double x = 0;
		
		for(int i = 0; i < 10; i++) {
			ant2 = ant;
			ant = actual;
			actual = x * Math.sin(x);
			x+= 0.001;
			if(ant > actual && ant > ant2) {
				System.out.println("x: " + x + " -y: " + actual + " - y ant" + ant + " - y ant2" + ant2);
			}
		}
	}

}
