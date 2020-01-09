package formula1Juego.formula1Juego;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.util.HashMap;


public class SoundRepository {
	// Almacén de sonidos
	private HashMap<String, AudioClip> sounds = new HashMap<String, AudioClip>();
	// Variable principal del patrón Singleton
	private static SoundRepository instance = null;
	private static String RESOURCES_FOLDER = "../resources/sounds/";
	
	//Fijamos los sonidos que se van a utilizar en el juego
	public static String MUSICA_DE_FONDO_FORMULA1 = "musicafondo.wav";
	public static String MUSICA_DERRAPE = "derrapar.wav";
	public static String MUSICA_IMPULSO = "acelerar.wav";


	/**
	 * Constructor
	 */
	public SoundRepository() {
		this.getAudioClip(MUSICA_DE_FONDO_FORMULA1);
		this.getAudioClip(MUSICA_DERRAPE);
		this.getAudioClip(MUSICA_IMPULSO);
		
		
	}
	
	/**
	 * Método principal del patrón Singleton
	 * @return
	 */
	public static SoundRepository getInstance() {
		if (instance == null) {
			instance = new SoundRepository();
		}
		return instance;
	}
	/**
	 * CARGA EL SONIDO
	 * @param name
	 * @return
	 */
	private AudioClip loadResource (String name) {
		URL url = null;
		url = getClass().getResource(name);
		return Applet.newAudioClip(url);
	}
	
	/**
	 * 
	 * @param resourceName
	 * @return
	 */
	private AudioClip getAudioClip (String resourceName) {
		//PARA BUSCAR EL SONIDO EN EL HASMAP
		AudioClip clip = sounds.get(resourceName);
		// SI NO LO ENCUENTRA LO BUSCA EN EL DISCODURO
		if(clip == null) {
			clip = loadResource(RESOURCES_FOLDER + resourceName);
			//UNA VEZ QUE OBTENEMOS UN SONIDO, LO PONE EN EL HASMAP
			sounds.put(resourceName, clip);
		}
		return clip;
	}
	
	/**
	 * PARA SOLO OIR UNA VEZ EL SONIDO DE RAMPA Y OIL
	 * @param name
	 */
	public void playSound (final String name) {
		getAudioClip(name).play();
	}
	
	/**
	 * LANZA EL SONIDO EN BUCLE, PARA EL SONIDO DE LA CARRERA
	 * @param name
	 */
	public void loopSound (final String name) {
		getAudioClip(name).loop();
	}

	public HashMap<String, AudioClip> getSounds() {
		return sounds;
	}

	public void setSounds(HashMap<String, AudioClip> sounds) {
		this.sounds = sounds;
	}

	public static String getRESOURCES_FOLDER() {
		return RESOURCES_FOLDER;
	}

	public static void setRESOURCES_FOLDER(String rESOURCES_FOLDER) {
		RESOURCES_FOLDER = rESOURCES_FOLDER;
	}

	public static String getMUSICA_DE_FONDO_FORMULA1() {
		return MUSICA_DE_FONDO_FORMULA1;
	}

	public static void setMUSICA_DE_FONDO_FORMULA1(String mUSICA_DE_FONDO_FORMULA1) {
		MUSICA_DE_FONDO_FORMULA1 = mUSICA_DE_FONDO_FORMULA1;
	}

	public static String getMUSICA_DERRAPE() {
		return MUSICA_DERRAPE;
	}

	public static void setMUSICA_DERRAPE(String mUSICA_DERRAPE) {
		MUSICA_DERRAPE = mUSICA_DERRAPE;
	}

	public static String getMUSICA_IMPULSO() {
		return MUSICA_IMPULSO;
	}

	public static void setMUSICA_IMPULSO(String mUSICA_IMPULSO) {
		MUSICA_IMPULSO = mUSICA_IMPULSO;
	}

	public static void setInstance(SoundRepository instance) {
		SoundRepository.instance = instance;
	}


	
	


	
}