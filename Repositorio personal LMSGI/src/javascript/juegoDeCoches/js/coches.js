var game = (function () {

    // Variables globales relacionadas con los elementos html e imágenes a cargar
    var canvas,
        ctx,
        imgFondo, // Imagen del background del juego
        imgCargadas = 0, // Control de la cantidad de imágenes cargadas
        imgCoche, // Imagen del coche
        imgCamion, // Imagen de camión
        vx = 1,
        WIDTH = 100,
        HEIGHT = 100;

        //Declaramos array de obstaculos
        obst = [];
        var lastRandomValue, exampleArray = [-84,-56,-28,0,28,56,84,112,140,168,196,224,252,280,308,336,364,392,420,448,476,504,532,560];

        //Coordenadas obstaculos
        var CoorXCam = 500;
        var CoorYCam = 300;

        //Coordenadas iniciales
        var CoorX = 350;
        var CoorY = 0;

        window.onload = init;

        

    /**
     * Función de inicialización del juego. Esta es la función principal, la que se llama desde el código html.
     * Se encarga de inicializar las variables globales necesarias para el juego
     */
    function init() {
        // Lo primero es comenzar a cargar las imágenes
        preloadImages();

        // Obtención del elemento html con id = "canvas". Puedes mirar el código html para entender mejor esto
        canvas = document.getElementById('canvas');
        // Necesitamos el contexto del canvas, para poderlo utilizar como "brocha", gracias a este elemento podremos
        // asignar colores y pintar primitivas, imágenes, textos, etc.
        ctx = canvas.getContext("2d");

         // Start the first frame request
         gameLoop();


    }

    function gameLoop(timeStamp){
        paintEscena();
        getTransitoryItems();
        getCollisions()

        // Keep requesting new frames
        window.requestAnimationFrame(gameLoop);
    }



    //Creamos una clase para los obstaculos
    class Obstaculo{
        constructor(){
            this.x = canvas.width;
            this.y = this.getRandomY();
            this.vx = -1;
            this.imgSprite = imgCamion;
        }
    
        getRandomY(){
            for(var i = 0, len = 1; i < len; i++) {
                return getRandomFromArrayNotRepeated(exampleArray);
            }
        }
        mover(){
            this.x += this.vx;
        }
        paint(){
          ctx.drawImage(this.imgSprite, this.x, this.y, 100, 100);
          /*ctx.fillRect(this.x - 50, this.y, 50, 50);*/
        }
    }

    function getTransitoryItems(){
        if (Math.random() < 0.01) {
            obst.push(new Obstaculo())
        }
    }

    function bucleobs(){
        for(let i = 0; i < obst.length; i++){
            obst[i].mover();
            obst[i].paint();
        }
    }

    function getCollisions() {
        for (let i = 0; i < obst.length; i++) {
            if (obst[i].x == CoorX && obst[i].y == CoorY) {
                    alert("Fin del juego");
            }
            
        }
    }

    function getRandomFromArrayNotRepeated(array) {
        var item = array[Math.floor(Math.random()*array.length)];
        if(lastRandomValue === item && array.length > 1) {
            return getRandomFromArrayNotRepeated(array, item);
        } 
        return lastRandomValue = item;
     }
     



    /**
     * A través de este método conseguiremos precargar las imágenes. Este proceso en JS no es síncrono, por tanto necesitamos implementar
     * una especie de disparador. Cada vez que una imagen se carge (lo controlaremos por la ejecución de la función "addEventListener")
     * se aumentará en 1 la cantidad de imágenes cargadas y se llamará a la función que pinta la escena.
     */
    function preloadImages() {
        // Carga de la imagen del fondo del juego
        imgFondo = new Image();
        imgFondo.src = 'images/carretera.jpg';
        imgFondo.addEventListener('load', function() {
            // Este trozo de código se ejecutará de manera asíncrona cuando la imagen se haya realmente cargado.
            imgCargadas++;
            paintEscena();
          }, false);

        imgCoche = new Image();
        imgCoche.src = 'images/coche.jpg';
        imgCoche.addEventListener('load', function() {
          imgCargadas++;
            paintEscena();
        }, false);

        document.addEventListener("keydown", function(event){
                  
            if(event.keyCode == 39){
                console.log("Has pulsado la derecha");
                moverDerecha();
                paintEscena();
            }
            if(event.keyCode == 37){
             console.log("Has pulsado la izquierda");
             moverIzquierda();
             paintEscena();
            }
            if(event.keyCode == 38){
                console.log("Has pulsado la izquierda");
                moverArriba();
                paintEscena();
               }
               if(event.keyCode == 40){
                console.log("Has pulsado la izquierda");
                moverAbajo();
                paintEscena();
               }   
         });

         // Carga de la imagen del fondo del juego
        imgCamion = new Image();
        imgCamion.src = 'images/moto.png';
        imgCamion.addEventListener('load', function() {
            // Este trozo de código se ejecutará de manera asíncrona cuando la imagen se haya realmente cargado.
            imgCargadas++;
            paintEscena();
          }, false);
      }
    


    /**
     * Función principal para pintar la escena, esta función puede tardar un poco en realizar el pintado, por lo que hemos
     * retrasado la llamada al siguiente método "interactua()" unos 100 milisegundos. Ten en cuenta que esa forma de hacer
     * "delay" es asíncrona. Todo el juego es un bucle entre las funciones "paintEscena" e "interactua". Las dos funciones 
     * continuamente se llaman entre sí, creando un "bucle".
     */
    function paintEscena () {
        // Sólo pasamos a pintar la escena si nos aseguramos de que las dos imágenes han sido cargadas correctamente.
        if (imgCargadas == 3) {
            // Pintamos el fondo, el personaje, los caracteres adivinados y los fallos comentidos por el usuario. Cada cosa en su función
            paintFondo();
            //Para ir aumentando la dificultad
        }
    } 


    /**
     * Pintamos las dos imágenes que componen el fondo del juego
     */
	function paintFondo () {
		// Pinto el fondo de la escena
        ctx.drawImage(imgFondo, 0, 0);
        ctx.drawImage(imgCoche, CoorX, CoorY, WIDTH, HEIGHT);
        bucleobs();
        
        
        

    }

    

    function moverDerecha(){
    
        //imgPelota = this.CoorX + 5;
        CoorX = CoorX+28;
    
        if(CoorX > (canvas.width - this.WIDTH )){
            CoorX = canvas.width - this.WIDTH
        }
       
      }
    
      function moverIzquierda(){
        
        //imgPelota = this.CoorX + 5;
        CoorX = CoorX-28;
       
      }
    
      function moverArriba(){
        
        //imgPelota = this.CoorX + 5;
        CoorY = CoorY-28;
        if(CoorY < 0){
            CoorY = canvas.height;
        }
      }
    
      function moverAbajo(){
        
        //imgPelota = this.CoorX + 5;
        CoorY = CoorY+ 28;
    
        if(CoorY > (canvas.height)){
            CoorY = 0;
        }
    }


    /**
     * Método devuelto por el objeto
     */
    return {
        init: init
        
    }
})();