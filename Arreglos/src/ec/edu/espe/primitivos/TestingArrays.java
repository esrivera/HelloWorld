/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.primitivos;

/**
 *
 * @author Labs-DECC
 */
public class TestingArrays {

    public static void main(String[] args) {

        int[] enteros = new int[10];
        float[] flotantes = new float[5];

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = i + 1;
        }
        float aux;

        for (int i = 0; i < flotantes.length; i++) {
            aux = (float) (i);
            aux = aux / 10;
            flotantes[i] = aux + 1;
        }

        int[] otrosEnteros = {8, 11, 2017};

        for (int entero : enteros) {
            System.out.print(" " + entero);
        }

        System.out.println("\n");

        for (int otroentero : otrosEnteros) {
            System.out.print(" " + otroentero);
        }
        System.out.println("\n");

        for (float flotante : flotantes) {
            System.out.print(" " + flotante);
        }

        System.out.println("\n");
    }

}
