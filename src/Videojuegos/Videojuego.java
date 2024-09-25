package Videojuegos;

public abstract class Videojuego {

    protected final String titulo;
    protected final String consola;
    protected final double precioBase;
    protected final String genero;

    public Videojuego(String titulo, String consola, double precioBase, String genero) {
        this.titulo = titulo;
        this.consola = consola;
        this.precioBase = precioBase;
        this.genero = genero;
    }
}
