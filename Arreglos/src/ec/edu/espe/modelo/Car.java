/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo;

/**
 *
 * @author Santiago
 */
public class Car {

    private String color;
    private String trademark;
    private int numberOfDoor;
    private int id;

    public Car(String color, String trademark, int numberOfDoor, int id) {
        this.color = color;
        this.trademark = trademark;
        this.numberOfDoor = numberOfDoor;
        this.id = id;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the trademark
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * @param trademark the trademark to set
     */
    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    /**
     * @return the numberOfDoor
     */
    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    /**
     * @param numberOfDoor the numberOfDoor to set
     */
    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
