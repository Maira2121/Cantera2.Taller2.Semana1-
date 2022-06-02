package com.sofka.ships;

/**
 * Interfaz creada como base para los métodos comunes de las naves
 */
public interface IShip {
    /**
     * Estos métodos se implementarán en las clases que implementen esta interfaz.
     */
    public void advance();
    public void acelerate();
    public void brake();

}
