/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Enrique
 */
public class Maestros {
     // Atributos
    private String maeCodigo;
    private String maeNombre;
    private String maeDireccion;
    private String maeEstatus;

    // Constructor
    public Maestros(String maeCodigo, String maeNombre, String maeDireccion, String maeEstatus) {
        this.maeCodigo = maeCodigo;
        this.maeNombre = maeNombre;
        this.maeDireccion = maeDireccion;
        this.maeEstatus = maeEstatus;
    }

    // Getters
    public String getMaeCodigo() {
        return maeCodigo;
    }

    public String getMaeNombre() {
        return maeNombre;
    }

    public String getMaeDireccion() {
        return maeDireccion;
    }

    public String getMaeEstatus() {
        return maeEstatus;
    }

    // Setters
    public void setMaeCodigo(String maeCodigo) {
        this.maeCodigo = maeCodigo;
    }

    public void setMaeNombre(String maeNombre) {
        this.maeNombre = maeNombre;
    }

    public void setMaeDireccion(String maeDireccion) {
        this.maeDireccion = maeDireccion;
    }

    public void setMaeEstatus(String maeEstatus) {
        this.maeEstatus = maeEstatus;
    }

    // Método toString
    @Override
    public String toString() {
        return "Maestros{" +
                "maeCodigo='" + maeCodigo + '\'' +
                ", maeNombre='" + maeNombre + '\'' +
                ", maeDireccion='" + maeDireccion + '\'' +
                ", maeEstatus='" + maeEstatus + '\'' +
                '}';
    }
}
