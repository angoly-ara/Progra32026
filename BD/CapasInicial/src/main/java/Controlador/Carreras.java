/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Enrique
 */
public class Carreras {
   // Atributos
    private String carCodigo;
    private String carNombre;
    private String carEstatus;

    // Constructor
    public Carreras(String carCodigo, String carNombre, String carEstatus) {
        this.carCodigo = carCodigo;
        this.carNombre = carNombre;
        this.carEstatus = carEstatus;
    }

    // Getters
    public String getCarCodigo() {
        return carCodigo;
    }

    public String getCarNombre() {
        return carNombre;
    }

    public String getCarEstatus() {
        return carEstatus;
    }

    // Setters
    public void setCarCodigo(String carCodigo) {
        this.carCodigo = carCodigo;
    }

    public void setCarNombre(String carNombre) {
        this.carNombre = carNombre;
    }

    public void setCarEstatus(String carEstatus) {
        this.carEstatus = carEstatus;
    }

    // Método toString
    @Override
    public String toString() {
        return "Carreras{" +
                "carCodigo='" + carCodigo + '\'' +
                ", carNombre='" + carNombre + '\'' +
                ", carEstatus='" + carEstatus + '\'' +
                '}';
    } 
}
