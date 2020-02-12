package tema6.tema6Bloque6.ejercicio2.Arkanoid.Codigo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

import javax.imageio.ImageIO;

import tema6.tema6Bloque6.ejercicio1.FicheroPropiedades;


public class SpriteRepository {
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	
	// Variable principal del patrï¿½n Singleton
	private static SpriteRepository instance = null;
	
	// Carpeta en la que se encuentran los recursos: imagenes, sonidos, etc.
	private static String RESOURCES_FOLDER = "../res/";
	
	// Recursos de sonido que puede utilizarse en el juego
	public static String NAVE = "nave-50x15.png";
	public static String GameOver = "game-over.png";
	public static String ImagenDeVidas = "nave-25x7.png";
	public static String Fondo = "Fondo.png";
	private static Properties propiedades = null;


	
	/**
	 * Default constructor
	 */
	public SpriteRepository() {
		this.getSprite(NAVE);
		this.getSprite(GameOver);
		this.getSprite(ImagenDeVidas);
		this.getSprite(Fondo);

	}
	
	/**
	 * Mï¿½todo principal del patrï¿½n Singleton
	 * @return
	 */
	public static SpriteRepository getInstance() {
		if (instance == null) {
			instance = new SpriteRepository();
		}
		return instance;
	}
	
	/**
	 * Realiza la carga de un recurso del disco duro, dentro de un objeto de tipo BufferedImgae
	 * @param nombre
	 * @return
	 */
	private BufferedImage loadImage(String resourceName) {
		// Para localizar el archivo se utiliza un objeto de tipo URL
		URL url=null;
		
		// Se intenta cargar el recurso del disco duro, si no se pudiera se capturarï¿½ la excepciï¿½n y se
		// mostrarï¿½ un mensaje en pantalla
		try {
			url = getClass().getResource(resourceName);
			return ImageIO.read(url);
		} catch (Exception e) {
			// Aquï¿½ dentro capturamos y tratamos el error que pueda haberse ocasionado
			System.out.println("No se pudo cargar la imagen " + resourceName +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0); // Fin del programa
		}
		return null; // Sï¿½lo se llegarï¿½ a esta lï¿½nea si no se ha podido cargar el recurso correctamente
	}
	
	/**
	 * Mï¿½todo para obtener una imagen.
	 * @param nombre
	 * @return
	 */
	public BufferedImage getSprite(String resourceName) {
		// En primera instancia intentamos obtener el objeto BufferedImage a partir del HashMap.
		BufferedImage img = sprites.get(resourceName);
		
		// En caso de que el objeto BufferedImage no exista dentro del HashMap, se carga desde el disco duro
		if (img == null) {
			img = loadImage(RESOURCES_FOLDER + resourceName);
			// Una vez que cargo el recurso en la memoria, lo agrego al HashMap, asï¿½ no habrï¿½ que volver a 
			// buscarlo en el disco duro. Como "clave" del objeto en el HashMap utilizo el nombre del fichero
			sprites.put(resourceName, img);
		}
		return img;
	}
	
	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();
		    
			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src/tema6/tema6Bloque6/ejercicio1/ejemplo.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		}
		return propiedades;
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty (String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty (String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main (String args[]) {
		String usuario = FicheroPropiedades.getProperty("USUARIO");
		String password = FicheroPropiedades.getProperty("PASSWORD");
		int id = FicheroPropiedades.getIntProperty("ID_USUARIO");
		
		System.out.println("Usuario leído del fichero de propiedades: " + usuario);
		System.out.println("Password leído del fichero de propiedades: " + password);
		System.out.println("Id de usuario leído del fichero de propiedades: " + id);
	}
}
