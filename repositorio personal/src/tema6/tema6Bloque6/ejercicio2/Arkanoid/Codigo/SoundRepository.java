package tema6.tema6Bloque6.ejercicio2.Arkanoid.Codigo;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.HashMap;

/**
 * @author Rafael Carlos Mu�oz Ruiz
 *
 */

public class SoundRepository {

	// Almac�n de sonidos, se trata de un HashMap que tiene String como "claves" de los objetos y "AudioClip" como objetos
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();

	// Variable principal del patr�n Singleton
	private static SoundRepository instance = null;
	
	// Carpeta en la que se encuentran los recursos: im�genes, sonidos, etc.
	private static String RESOURCES_FOLDER = "../res/";
	
	// Recursos de sonido que puede utilizarse en el juego
	public static String MUSICACOMIENZO = "musicaComienzo.wav";
	public static String CHOCARPELOTA = "ChocarPelota.wav";
	public static String EXPLOSION = "explosion.wav";
	public static String MUSICAVIDA = "musicamuere.wav";
	
	/**
	 * Default constructor
	 */
	public SoundRepository() {
		// Carga de recursos en memoria
		this.getAudioClip(MUSICACOMIENZO);
		this.getAudioClip(CHOCARPELOTA);
		this.getAudioClip(EXPLOSION);
		this.getAudioClip(MUSICAVIDA);
	}
	
	/**
	 * M�todo principal del patr�n Singleton
	 * @return
	 */
	public static SoundRepository getInstance() {
		if (instance == null) {
			instance = new SoundRepository();
		}
		return instance;
	}
	
	/**
	 * Carga un sonido, en forma de AudioClip, desde el disco duro
	 * @param name
	 * @return
	 */
	private AudioClip loadResource(String name) {
		URL url=null;
		url = getClass().getResource(name);
		return Applet.newAudioClip(url);
	}
	
	/**
	 * Obtiene el AudioClip desde el almac�n HashMap, si no existe lo carga desde el disco duro.
	 * @param resourceName
	 * @return
	 */
	private AudioClip getAudioClip(String resourceName) {
		// En primera instancia intentamos obtener el objeto AudioClip a partir del HashMap.
		AudioClip clip = sounds.get(resourceName);
		
		// En caso de que el objeto AudioClip no exista dentro del HashMap, se carga desde el disco duro
		if (clip == null) {
			clip = loadResource(RESOURCES_FOLDER + resourceName);
			// Una vez que cargo el recurso en la memoria, lo agrego al HashMap, as� no habr� que volver a 
			// buscarlo en el disco duro. Como "clave" del objeto en el HashMap utilizo el nombre del fichero
			sounds.put(resourceName, clip);
		}
		return clip;	
	}
	
	/**
	 * Lanza un sonido, el sonido s�lo se escuchar� una vez
	 * @param name
	 */
	public void playSound(final String name) {
		getAudioClip(name).play();
	}
	
	/**
	 * Lanza un sonido en bucle.
	 * @param name
	 */
	public void loopSound(final String name) {
		getAudioClip(name).loop();
	}

}
