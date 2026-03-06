/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Enrique
 */
public class Jornada {
    private int jor_codigo;
    private String jor_nombre;

    public Jornada(int jor_codigo, String jor_nombre) {
        this.jor_codigo = jor_codigo;
        this.jor_nombre = jor_nombre;
    }
    
    public Jornada() {
    }

    public int getJor_codigo() {
        return jor_codigo;
    }

    public void setJor_codigo(int jor_codigo) {
        this.jor_codigo = jor_codigo;
    }

    public String getJor_nombre() {
        return jor_nombre;
    }

    public void setJor_nombre(String jor_nombre) {
        this.jor_nombre = jor_nombre;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Jornada{" +
                "jor_codigo='" + jor_codigo + '\'' +
                ", jor_nombre='" + jor_nombre + '\'' +
                '}';
    }
}

