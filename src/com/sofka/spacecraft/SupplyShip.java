package com.sofka.spacecraft;

import java.util.ArrayList;

/**
 * Clase para crear instancias de objetos de tipo Supply Ship: nave espacial para transportar recursos a otra nave espacial o estaciones espaciales.
 * @author Maira Bastidas Gómez
 */

public class SupplyShip extends Spacecraft{

    private ArrayList<String> resources;

    /**
     * Este es el constructor de la clase SupplyShip
     * @param name este atributo es extendido de la clase Spacecraft, y representa el nombre que recibirá la nave a crear.
     */
    public SupplyShip(String name) {
        super(name);
        this.typeShip = "Supply Ship";
    }

    /**
     * Método definido en la que define la forma de avanzar de una nave Supply.
     * Este método es definido en la interfaz IShip e implementado aquí.
     */
    @Override
    public void advance() {
        velocity = velocity + 200;
    }

    /**
     * Método que define la forma de acelerar de una nave supply.
     * Este método es definido en la interfaz IShip e implementado aquí.
     */
    @Override
    public void acelerate() {
        velocity = velocity + 5000;
    }

    /**
     * Método que define la forma de frenar de una nave supply. Este método es definido en la interfaz IShip, y es
     * implementado aquí.
     */
    @Override
    public void brake() {
        velocity = 0;
    }

    /**
     * Método definido en la clase abstracta Spacecraft. Es implementado aquí para definir la forma de navegar de una nave de tipo Lanzadera.
     */
    @Override
    public void surf() {
        System.out.println("I'm a Supply ship and i am surfing.");
    }

    /**
     * método para indicar la llegada al destino de la nave.
     */
    public void arrived() {
        System.out.println(this.name + " arrived at the destination");
    }

    /**
     * método para lanzar la nave.
     */
    public void launch() {
        System.out.println("Launching " + this.name + " supply spaceship ");
    }

    /**
     * Método para mostrar la información de la nave, es decir el valor de los atributos de una nava.
     *
     * @return devuelve los atributos de la nave.
     */
    @Override
    public String toString() {
        return "Ship{" +
                "Name:'" + name + '\'' +
                ", Type ship:'" + typeShip + '\'' +
                '}';
    }

}
