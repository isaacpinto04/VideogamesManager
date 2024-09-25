package Plataforma;

import Videojuegos.Videojuego;

public interface IConsola {
    void switchOn();
    void switchOff();
    void installGame(Videojuego game);
    void playGame();
    String getPlataforma();
}
