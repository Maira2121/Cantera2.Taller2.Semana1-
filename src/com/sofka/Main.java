package com.sofka;

import com.sofka.spacecraft.MannedShip;
import com.sofka.spacecraft.Menu;
import com.sofka.spacecraft.RoboticShip;
import com.sofka.spacecraft.ShuttleShip;
import com.sofka.spacecraft.Spacecraft;
import com.sofka.spacecraft.SupplyShip;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase principal: permite el manejo del programa.
 * @author Maira Bastidas Gómez
 */
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Spacecraft> spacecrafts = new ArrayList<>();

    public static void main(String[] args) {
        boolean exit = false;
        int option, numManned;
        String name, freight, fuelType;
        while (!exit) {
            System.out.println("Menu");
            System.out.println("1. Create Spacecraft");
            System.out.println("2. Exit");
            try {
                System.out.println("Enter an option: ");
                option = scanner.nextInt();
                boolean goBack = false;
                switch (option) {
                    case 1:
                        while (!goBack) {
                            Menu menu = new Menu();
                            menu.menu();
                            try {
                                System.out.println("Enter an option: ");
                                option = scanner.nextInt();
                                scanner.nextLine();
                                switch (option) {
                                    case 1:
                                        System.out.println("Enter name of the spacecraft: ");
                                        name = scanner.nextLine();
                                        System.out.println("Enter fuel type of the spacecraft: ");
                                        fuelType = scanner.nextLine();
                                        RoboticShip roboticShip = new RoboticShip(name, fuelType);
                                        System.out.println("Spacecraft created: ");
                                        spacecrafts.add(roboticShip);
                                        break;
                                    case 2:
                                        System.out.println("Enter name of the spacecraft: ");
                                        name = scanner.nextLine();
                                        System.out.println("Enter number of crew: ");
                                        numManned = scanner.nextInt();
                                        scanner.nextLine();
                                        MannedShip mannedShip = new MannedShip(name, numManned);
                                        System.out.println("Spacecraft created: ");
                                        spacecrafts.add(mannedShip);
                                        break;
                                    case 3:
                                        System.out.println("Enter name of the spacecraft: ");
                                        name = scanner.nextLine();
                                        System.out.println("Enter freight: ");
                                        freight = scanner.nextLine();
                                        ShuttleShip shuttleShip = new ShuttleShip(name, freight);
                                        System.out.println("Spacecraft created: ");
                                        spacecrafts.add(shuttleShip);
                                        break;
                                    case 4:
                                        System.out.println("Enter name of the spacecraft: ");
                                        name = scanner.nextLine();
                                        SupplyShip supplyShip = new SupplyShip(name);
                                        System.out.println("Spacecraft created: ");
                                        spacecrafts.add(supplyShip);
                                        break;
                                    case 5:
                                        if (spacecrafts.size() > 0) {
                                            for (Spacecraft spacecraft : spacecrafts) {
                                                System.out.println(spacecraft.toString());
                                            }
                                        } else {
                                            System.out.println("No spaceships to display");
                                        }
                                        break;
                                    case 6:
                                        goBack = true;
                                        break;
                                    default:
                                        System.out.println("Only numbers between  1 y 5");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("You must enter a number");
                                scanner.nextLine();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("The program has ended");
                        exit = true;
                        break;
                    default:
                        System.out.println("Only numbers between  1 y 2");
                }
            } catch (InputMismatchException e) {
                System.out.println("You must enter a number");
                scanner.nextLine();
            }
        }
    }
}
