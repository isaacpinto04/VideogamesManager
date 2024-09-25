package Videojuegos;

public class VideojuegoFisico extends Videojuego {
    public VideojuegoFisico(String titulo, String consola, double precioBase, String genero) {
        super(titulo, consola, precioBase, genero);
    }

    public static double calcularPrecioFinal(double precioBase) {
        double costeEnvio = 2.99;
        return precioBase + costeEnvio;
    }
}
