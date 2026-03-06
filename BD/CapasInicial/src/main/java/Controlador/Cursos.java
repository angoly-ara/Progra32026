/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Enrique
 */
public class Cursos {
        
    // Atributos
    private String curCodigo;
    private String curNombre;
    private String curEstatus;

    // Constructor
    public Cursos(String curCodigo, String curNombre, String curEstatus) {
        this.curCodigo = curCodigo;
        this.curNombre = curNombre;
        this.curEstatus = curEstatus;
    }

    // Getters
    public String getCurCodigo() {
        return curCodigo;
    }

    public String getCurNombre() {
        return curNombre;
    }

    public String getCurEstatus() {
        return curEstatus;
    }

    // Setters
    public void setCurCodigo(String curCodigo) {
        this.curCodigo = curCodigo;
    }

    public void setCurNombre(String curNombre) {
        this.curNombre = curNombre;
    }

    public void setCurEstatus(String curEstatus) {
        this.curEstatus = curEstatus;
    }

    // Método toString
    @Override
    public String toString() {
        return "Cursos{" +
                "curCodigo='" + curCodigo + '\'' +
                ", curNombre='" + curNombre + '\'' +
                ", curEstatus='" + curEstatus + '\'' +
                '}';
    }
}
