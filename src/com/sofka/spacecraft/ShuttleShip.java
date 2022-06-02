package com.sofka.spacecraft;

/**
 * Clase para crear instancias de objetos de tipo Shuttle Ship(Naves lanzaderas)
 * @author Maira Bastidas Gómez
 */
public class ShuttleShip extends Spacecraft {
    private String cargo;

    /**
     * Constructor de la clase Shuttle
     * @param name nombre de la nave
     * @param cargo carga que llevará la nave.
     */
    public ShuttleShip(String name, String cargo) {
        super(name);
        this.typeShip = "Shuttle Ship";
        this.cargo = cargo;
    }

    /**
     * Método para obtener el número de motores de una nave.
     *
     * @return retorna la carga que lleva la nave. Es un dato de tipo String.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * método para modificar/asignar la carga que llevará la nave.
     *
     * @param cargo recibe como parámetro la carga que llevará la nave.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Método definido en la clase abstracta Spacecraft. Es implementado aquí para definir la forma de navegar de una nave de tipo Lanzadera.
     */
    @Override
    public void surf() {
        System.out.println("I'm a Shuttle ship and i am surfing.");
    }

    /**
     * Método definido en la  que define la forma de avanzar de una nave Lanzadera.
     * este método es definido en la interfaz IShip e implementado aquí.
     */
    @Override
    public void advance() {
        velocity = velocity + 100;
    }

    /**
     * Método que define la forma de acelerar de una nave Lanzadera.
     * este método es definido en la interfaz IShip e implementado aquí.
     */
    @Override
    public void acelerate() {
        velocity = velocity + 1000;
    }
    /**
     * Sobrecargando el método acelerate
     */
    public void acelerate(double newVelocity){
        this.velocity = velocity+newVelocity;

    }

    /**
     * Método que define la forma de frenar de una nave Lanzadera. Este método es definido en la interfaz IShip, y es
     * implementado aquí.
     */
    @Override
    public void brake() {
        velocity = 0;
    }


    /**
     * Este es un método propio de esta clase y representa el comportamiento de lanzado de la carga.
     */
    public void launchCargo() {
        System.out.println("releasing load...");
        System.out.println("Thrown load");

    }

    /**
     * Método para mostrar la información de la nave, es decir el valor de los atributos de una nave.
     *
     * @return devuelve los atributos de la nave.
     */
    @Override
    public String toString() {
        return "Ship{" +
                "Name:'" + name + '\'' +
                ", Freight:'" + cargo + '\'' +
                ", Type ship:'" + typeShip + '\'' +
                '}';
    }
}
