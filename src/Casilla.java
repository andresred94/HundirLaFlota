public class Casilla {
    /**
     * Crear una clase llamada "Casilla" que represente cada casilla del tablero.
     * Esta clase debe contener atributos para guardar la fila, columna, un alias al barco que lo
     * ocupa si fuera el caso y el estado para poder representar si hay un barco en la casilla,
     * si la casilla ha sido impactada, si hay agua o si el barco en la casilla ha sido hundido.
     * Además debe tener métodos para cambiar el estado de la casilla y devolver su estado.*/

    //Atributos
    private int fila;
    private int columna;
    private boolean estadoCasilla;
    private boolean impactado;
    private boolean hundido;
    private char agua = '-';
    private char barco = 'B';
    private char tocado = 'X';

    //Si modifico este archivo se ve en GitHub?

    //metodos constructores
    public Casilla(int fila, int columna, boolean estadoCasilla,boolean impactado,boolean hundido, char agua, char barco){
        setFila(fila);
        setColumna(columna);
        this.estadoCasilla=estadoCasilla;
        this.impactado=impactado;
        this.hundido=hundido;
        this.agua=agua;
        this.barco=barco;
    }

    //metodos getter y Setter
    public int getFila(){
        return fila;
    }
    
    public void setFila(int fila){
        this.fila = fila;
    }

    public int getColumna(){
        return columna;
    }

    public void setColumna(int columna){
        this.columna=columna;
    }

    public boolean isImpactado() {
        return impactado;
    }

    public void setImpactado(boolean impactado) {
        this.impactado = impactado;
    }

    public boolean isHundido() {
        return hundido;
    }

    public void setHundido(boolean hundido) {
        this.hundido = hundido;
    }

    public char getAgua() {
        return agua;
    }

    public void setAgua(char agua) {
        this.agua = agua;
    }

    public char getBarco() {
        return barco;
    }

    public void setBarco(char barco) {
        this.barco = barco;
    }

    public char getTocado() {
        return tocado;
    }

    public void setTocado(char tocado) {
        this.tocado = tocado;
    }

    //metodos
    //metodo para cambiar el estado de la casilla y  devolver su estado
    public boolean estadoCasilla (){
        if (estadoCasilla==impactado){
            System.out.println(tocado);
        }
        return estadoCasilla=true;
    }

}
