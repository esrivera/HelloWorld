/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.modelo;

/**
 *
 * @author Labs-DECC
 */
public class Animal {

    private int id;
    private String ojos;
    private String name;
    
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

    /**
     * @return the ojos
     */
    public String getOjos() {
        return ojos;
    }

    /**
     * @param ojos the ojos to set
     */
    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Animal(int id, String ojos, String name) {
        this.id = id;
        this.ojos = ojos;
        this.name = name;
    }
       
}
