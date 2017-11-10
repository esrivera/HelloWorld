/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tipos;

import ec.edu.espe.modelo.Car;

/**
 *
 * @author Santiago
 */
public class TestingCar {
    
    public static void main(String[] args) {
        
        Car[] cars;
        cars = new Car[10];
        
        for(int i=0; i<cars.length;i++){            
            if(i==1 | i==4 | i==7){
                cars[i]=new Car("Black","Chevrolet",4,i+1);
            }
            else{
                if(i==2 | i==5 | i==8){
                cars[i]=new Car("Silver","Ford",5,i+1);
                }
                else{
                cars[i]=new Car("Red","Nissan",3,i+1);
                }
            }
        }
        
        for(Car car:cars){
            System.out.println("Color: "+car.getColor()+"\t\tManufacturer: "+car.getTrademark()+"\t\tNumber of Doors: "+car.getNumberOfDoor()+"\tId: "+car.getId());
        }
    }
}
