/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tipos;

import ec.edu.espe.modelo.Animal;

/**
 *
 * @author Labs-DECC
 */
public class TestingAnimals {

    public static void main(String[] args) {
        Animal[] animals;
        animals = new Animal[10];
        for (int i = 0; i < animals.length; i++) {
            if (i == 0 | i == 2 | i == 4 | i == 6 | i == 8) {
                animals[i] = new Animal(i + 1, "black", "Lucy");
            } else {
                animals[i] = new Animal(i + 1, "brown", "Lucy");
            }
        }
        for (Animal animal : animals) {
            System.out.println("Nombre: " + animal.getName() + "  Id: " + animal.getId() + "  Color eyes: " + animal.getOjos());
        }
    }
}
