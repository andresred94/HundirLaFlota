public class Tetramino {
    /**
     * Crear una clase llamada "Tetramino" que represente cada barco en el tablero.
     * Esta clase debe contener información sobre el tipo de tetramino . puntos de vida y su posición,
     * un array con objetos de las casillas que contienen el barco (pueden ser alias de las casillas del tablero),
     * un método tocado() para recibir un disparo en una casilla y reducir el número puntos de vida del barco y un
     * método esHundido() para determinar si el barco ha sido hundido (puntos de vida igual a cero)
     */
    public enum TIPO {
        TIPOUNO,
        TIPODOS
    };

    /****** atributos de la clase *****/
    private TIPO tipo;
    private Casilla[][] posicion; //ToDo ¿Que es? = new Casilla[][];
    private final static int puntosdeVida = 4;

    /****** metodos constructores ******/
    public Tetramino(TIPO tipo, Casilla[][]posicion) {
        this.tipo=tipo;
        this.posicion=posicion;
    }

    /****** setter y getters ******/
    public TIPO getTipo() {
        return tipo;
    }
    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }
    public Casilla[][] getPosicion() {
        return posicion;
    }
    public void setPosicion(Casilla[][] posicion) {
        this.posicion = posicion;
    }

    /****** metodos normales de la clase Tetramino ******/
    //metodo para determinar si el barco ha sido hundido (puntos de vida igual a cero)
    /**
     * @param:
     * */
    public void esHundido(){
        //Es hundido cuando los puntos de vida llega a 0

    }

    //metodo para recibir un disparo en una casilla y reducir el número puntos de vida del barco
    /**
     * @param
     */
    public void tocado(){
    }

}
