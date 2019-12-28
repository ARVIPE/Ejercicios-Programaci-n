package tresEnRaya.version14_Una_matriz_representa_el_juego;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

import javax.imageio.ImageIO;


public class SpritesRepository {
	private HashMap<String, BufferedImage> sprites = new HashMap<String, BufferedImage>();
	
	// Variable principal del patr�n Singleton
	private static SpritesRepository instance = null;
	
	// Carpeta en la que se encuentran los recursos: im�genes, sonidos, etc.
	private static String RESOURCES_FOLDER = "../resources/images/";
	
	// Recursos de sonido que puede utilizarse en el juego
	public static String IMAGEN_JUGADOR_1 = "Barcelona.png";
	public static String IMAGEN_JUGADOR_2 = "RealMadrid.png";

	
	/**
	 * Default constructor
	 */
	public SpritesRepository() {
		this.getSprite(IMAGEN_JUGADOR_1);
		this.getSprite(IMAGEN_JUGADOR_2);
	}
	
	/**
	 * M�todo principal del patr�n Singleton
	 * @return
	 */
	public static SpritesRepository getInstance() {
		if (instance == null) {
			instance = new SpritesRepository();
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
		
		// Se intenta cargar el recurso del disco duro, si no se pudiera se capturar� la excepci�n y se
		// mostrar� un mensaje en pantalla
		try {
			url = getClass().getResource(resourceName);
			return ImageIO.read(url);
		} catch (Exception e) {
			// Aqu� dentro capturamos y tratamos el error que pueda haberse ocasionado
			System.out.println("No se pudo cargar la imagen " + resourceName +" de "+url);
			System.out.println("El error fue : "+e.getClass().getName()+" "+e.getMessage());
			System.exit(0); // Fin del programa
		}
		return null; // S�lo se llegar� a esta l�nea si no se ha podido cargar el recurso correctamente
	}
	
	/**
	 * M�todo para obtener una imagen.
	 * @param nombre
	 * @return
	 */
	public BufferedImage getSprite(String resourceName) {
		// En primera instancia intentamos obtener el objeto BufferedImage a partir del HashMap.
		BufferedImage img = sprites.get(resourceName);
		
		// En caso de que el objeto BufferedImage no exista dentro del HashMap, se carga desde el disco duro
		if (img == null) {
			img = loadImage(RESOURCES_FOLDER + resourceName);
			// Una vez que cargo el recurso en la memoria, lo agrego al HashMap, as� no habr� que volver a 
			// buscarlo en el disco duro. Como "clave" del objeto en el HashMap utilizo el nombre del fichero
			sprites.put(resourceName, img);
		}
		return img;
	}
}
