import java.util.Arrays;
import java.util.Random;

public class Tablero {

    /**
     * Clases necesarias
     * Crear una clase llamada "Tablero" que representa el tablero de juego de cada jugador
     * (uno guardar los barcos propios y otro para guardar los disparos efectuados).
     * Esta clase debe contener una matriz bidimensional de objetos Casilla de 10x10,
     * un método para inicializar el tablero (colocar los barcos de forma automática o pidiendo datos).
     */

    /****** atributos de la clase ******/
    private Casilla [][] TableroJugador = new Casilla [filas][columnas];
    private int numerodecasillas;
    private int casilla;
    private final static int columnas = 10;
    private final static int filas = 10;

    /******* setter y getter ******/
    public Casilla[][] getTableroJugador() {
        return TableroJugador;
    }
    public void setTableroJugador(Casilla[][] tableroJugador) {
        TableroJugador = tableroJugador;
    }
    public int getNumerodecasillas() {
        return numerodecasillas;
    }
    public void setNumerodecasillas(int numerodecasillas) {
        this.numerodecasillas = numerodecasillas;
    }
    public int getCasilla() {
        return casilla;
    }
    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }

    /******* metodos constructores ******/
    public Tablero(int casilla , int numerodecasillas , Casilla [][] TableroJugador){
        this.casilla=casilla;
        this.numerodecasillas=numerodecasillas;
        this.TableroJugador=TableroJugador;

    }

    /****** metodos de la clase Tablero ******/
    /**
     * Método que crea el tablero del juego del tamaño indicado en la constante
     * @param :constante que define el tamaño
     * @param agua
     * @param tetramino
     * @param numTetramino: numero de barcos en el tablero
     * @return un método que devuelve una matriz con los barcos colocados en una posicion
     */
    private char[][] crearTablerodeJuego(int filas, int columnas, char agua, char tetramino, int numTetramino) {
        char[][] tableroDeJuego = new char[filas][columnas];
        for (char[] fila : tableroDeJuego) {
            Arrays.fill(fila, agua);
        }
        return posicionTetraminos(tableroDeJuego, numTetramino, agua, tetramino);
    }
    /**
     * Método que sirve para colocar los barcos
     * @param tableroDeJuego
     * @param numTetramino
     * @param agua
     * @param tetramino
     * @return
     */
    private char[][] posicionTetraminos(char[][] tableroDeJuego, int numTetramino, char agua, char tetramino) {
        int tetraminoColocados = 0;
        int tamañoTablero = tableroDeJuego.length;
        while (tetraminoColocados < numTetramino) {
            int[] coordenadas = genCoordTetraminos(tamañoTablero);
            char posicionSugerida = tableroDeJuego[coordenadas[0]][coordenadas[1]];
            if (posicionSugerida == agua) {
                tableroDeJuego[coordenadas[0]][coordenadas[1]] = tetramino;
                tetraminoColocados++;
            }
        }
        return tableroDeJuego;
    }
    /**
     * Método que genera la primera posición a partir de donde será creado
     * el barco.
     * @param: TAMAÑO_TABLERO
     * @return: un array de dos indices con las dos coordenadas
     * de donde empezará a crear el barco.
     */
    private int[] genCoordTetraminos(int TAMAÑO_TABLERO) {
        int[] coordenadas = new int[2];
        for (int i = 0; i < coordenadas.length; i++) {
            coordenadas[i] = new Random().nextInt(TAMAÑO_TABLERO);
        }
        return coordenadas;
    }


}
