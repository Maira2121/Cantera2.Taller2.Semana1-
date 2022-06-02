package com.sofka.spacecraft;

/**
 * Clase RoboticShip es una clase que extiende de la clase Spacecraft, esta clase fue creada para crear naves robóticas, cuanta con 2 atributos propios: número de motores y el tipo de combustible.
 * @author Maira Bastidas Gómez
 */
public class RoboticShip extends Spacecraft {
    private int numMotors;
    private  String fuelType;

    /**
     * Este es el constructor de la clase RoboticShip
     * @param name este atributo es extendido de la clase Spacecraft, y representa el nombre que recibirá la nave a crear.
     * @param fuelType este atributo representa el tipo de combustible que utiliza la nave.
     */
    public RoboticShip(String name, String fuelType) {
        super(name);
        this.typeShip = "Robotic Ship";
        this.fuelType = fuelType;
        this.numMotors = 0;
    }

    /**
     * Método para obtener el número de motores de una nave.
     * @return retorna el número de motores de la nave. Es un dato de tipo entero.
     */
    public int getNumMotors() {
        return numMotors;
    }

    /**
     * método para modificar/asignar el número de motores de una nave.
     * @param numMotors recibe como parámetro, el número de motores a asignar.
     */
    public void setNumMotors(int numMotors) {
        this.numMotors = numMotors;
    }

    /**
     * Método para obtener el tipo de combustible de una nave.
     * @return Retorna el tipo de combustible que usa una nave. Es un dato de tipo String.
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * método para modificar/asignar el tipo de combustible que usa una nave.
     * @param fuelType recibe como parámetro el tipo de combustible a asignar/modificar.
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Método definido en la clase abstracta Spacecraft. Es implementado aquí para definir la forma de navegar de una nave de tipo Robotica.
     */
    @Override
    public void surf() {
        System.out.println("I'm a Robotic ship and i am surfing.");
    }

    /**
     * Método definido en la que define la forma de avanzar de una nave Robótica.
     * Este método es definido en la interfaz IShip e implementado aquí.
     */
    @Override
    public void advance() {
        velocity = velocity + 50;
    }

    /**
     * Método que define la forma de acelerar de una nave Robótica.
     * Este método es definido en la interfaz IShip e implementado aquí.
     */
    @Override
    public void acelerate() {
        velocity = velocity + 100;

    }
    

    /**
     * Método que define la forma de frenar de una nave Robótica. Este método es definido en la interfaz IShip, y es
     * implementado aquí.
     */
    @Override
    public void brake() {
        velocity = 0;
    }

    /**
     * Método para poner la nave en modo orbitar
     */
    public void orbit(){
        System.out.println("I'm a Robotic ship and i am orbiting.");
    }

    /**
     * Método para mostrar la información de la nave, es decir el valor de los atributos de una nava.
     * @return devuelve los atributos de la nave.
     */
    @Override
    public String toString() {
        return "Ship{" +
                "Name:" + name +
                ", Type Ship:" + typeShip +
                '}';
    }
}
