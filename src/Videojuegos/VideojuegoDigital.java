package Videojuegos;

public class VideojuegoDigital extends Videojuego {

    public VideojuegoDigital(String titulo, String consola, double precioBase, String genero) {
        super(titulo, consola, precioBase, genero);
    }

    public static double calcularPrecioFinal(double precioBase) {
        double descuento = 2.99;
        return precioBase - descuento;
    }
}
