package com.sofka.spacecraft;

/**
 * Clase MannedShip (Nave tripulada) permite crear instancias de objetos de tipo MannedShip.
 * @author Maira Bastidas Gómez
 */
public class MannedShip extends Spacecraft {
    private int numManned; // numero de tripulantes


    /**
     * Construcor de la clase MannedShip
     *
     * @param name      este atributo es extendido de la clase Spacecraft, y representa el nombre que recibirá la nave a crear.
     * @param numManned este atributo es propio de la clase y representa el número de tripulantes de la nave.
     */
    public MannedShip(String name, int numManned) {
        super(name);
        this.typeShip = "Manned Ship";
        this.numManned = numManned;
    }

    /**
     * Método para obtener el número de tripulantes de una nave.
     *
     * @return devuelve el número de tripulantes de la nave.
     */
    public double getNumManned() {
        return numManned;
    }

    /**
     * método para modificar/asignar el número de tripulantes que llevará una nave.
     *
     * @param numManned parámetro necesario para asignar el número de tripulantes.
     */
    public void setNumManned(int numManned) {
        this.numManned = numManned;
    }

    /**
     * Método definido en la clase abstracta Spacecraft. Es implementado aquí para definir la forma de navegar de una nave de tipo Tripulada.
     */
    @Override
    public void surf() {
        System.out.println("I'm a Manned ship and i am surfing.");
    }

    /**
     * Método definido en la que define la forma de avanzar de una nave Tripulada.
     * Este método es definido en la interfaz IShip e implementado aquí.
     */
    @Override
    public void advance() {

    }

    /**
     * Método que define la forma de acelerar de una nave Tripulada.
     * Este método es definido en la interfaz IShip e implementado aquí.
     */
    @Override
    public void acelerate() {
        velocity = velocity + 200;
    }

    /**
     * Método que define la forma de frenar de una nave Tripulada. Este método es definido en la interfaz IShip, y es
     * implementado aquí.
     */
    @Override
    public void brake() {
        velocity = 0;

    }

    /**
     * Método para mostrar la información de la nave, es decir el valor de los atributos de una nava.
     *
     * @return Devuelve los atributos de la nave.
     */
    @Override
    public String toString() {
        return "Ship{" +
                "Name:'" + name + '\'' +
                ", Number of crew:" + numManned +
                ", Type Ship='" + typeShip + '\'' +
                '}';
    }
}
