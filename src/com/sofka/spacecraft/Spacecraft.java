package com.sofka.spacecraft;
import com.sofka.ships.IShip;

/**
 * Esta clase llamada Spacecraft, es una clase abstracta creada como base para las diferentes naves espaciales,
 * es esta se encuentran los atributos y los métodos comunes de las naves espaciales.
 * @author Maira Bastidas Gómez
 */
public abstract class Spacecraft implements IShip {
    protected String name;
    protected String typeShip;
    protected double capacity;
    protected double velocity;
    protected double weight;
    protected double height;
    protected double push;
    protected double power;

    /**
     * Este es el constructor de la clase, con todos sus atributos.
     * @param name este atributo es el nombre que recibirá la nave al ser creada.
     * @param typeShip este atributo representa el tipo de nave.
     * @param capacity este atributo de tipo double representa la capacidad de la nave en peso.
     * @param velocity este atributo de tipo double representa la velocidad de la nave.
     * @param weight este atributo de tipo double representa el peso de la nave.
     * @param height este atributo de tipo double representa la altura de la nave.
     * @param push este atributo de tipo double representa el empuje de la nave.
     * @param power este atributo de tipo double representa la potencia de la nave.
     */
    public Spacecraft(String name, String typeShip, double capacity, double velocity, double weight, double height, double push, double power) {
        this.name = name;
        this.typeShip = typeShip;
        this.capacity = capacity;
        this.velocity = velocity;
        this.weight = weight;
        this.height = height;
        this.push = push;
        this.power = power;
    }

    /**
     * Constructor creado para facilitar la finalidad de este taller, por lo que solo se pide el nombre de la nave a crear, el resto de atributos se inicializaron.
     * @param name este atributo es el nombre que recibirá la nave al ser creada.
     */
    public Spacecraft (String name){
        this.name = name;
        this.capacity = 0;
        this.velocity = 0;
        this.weight = 0;
        this.height = 0;
        this.push = 0;
        this.power = 0;
    }

    /**
     * método abstracto navegar, será implementado en las clases que extiendan de estas.
     */
    public abstract void surf();
}
