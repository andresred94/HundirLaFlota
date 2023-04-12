public class Jugador {
    /**
     * * Crear una clase llamada "Jugador" que represente a cada jugador del juego.
     * Esta clase debe contener información como el nombre del jugador,el tablero/s del jugador,
     * un array que contiene todos los barcos del jugador y el número de barcos-tetraminos no hundidos.
     * Debe tener un método para recibir un ataque en una posición específica de un jugador.
     * Este comprobará si en esa posición está alguno de sus barcos
     * (directamente desde el tablero o en el array de barcos), en caso afirmativo actualizará el estado del barco,
     * y en función de si es agua, tocado o hundido el tablero del jugador.
     */

    private String nombreJugador;
    private Tetramino[] barcosJugador = new Tetramino[5];
    private int numbarcosNOhundidos;

    public Jugador(String nombreJugador , int numbarcosNOhundidos , Tetramino[]barcosJugador ) {
        this.nombreJugador=nombreJugador;
        this.numbarcosNOhundidos=numbarcosNOhundidos;
        this.barcosJugador=barcosJugador;
    }
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Tetramino[] getBarcosJugador() {
        return barcosJugador;
    }

    public void setBarcosJugador(Tetramino[] barcosJugador) {
        this.barcosJugador = barcosJugador;
    }

    public int getNumbarcosNOhundidos() {
        return numbarcosNOhundidos;
    }

    public void setNumbarcosNOhundidos(int numbarcosNOhundidos) {
        this.numbarcosNOhundidos = numbarcosNOhundidos;
    }
}
