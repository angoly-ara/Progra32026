/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Enrique
 */
public class Alumnos {
    // Atributos
    private int alu_codigo;
    private String alu_nombre;
    private String alu_direccion;
    private String alu_estatus;

      public Alumnos() {
    }
    
    // Constructor
    public Alumnos(int aluCodigo, String aluNombre, String aluDireccion, String aluEstatus) {
        this.alu_codigo = aluCodigo;
        this.alu_nombre = aluNombre;
        this.alu_direccion = aluDireccion;
        this.alu_estatus = aluEstatus;
    }

    // Getters
    public int getAluCodigo() {
        return alu_codigo;
    }

    public String getAluNombre() {
        return alu_nombre;
    }

    public String getAluDireccion() {
        return alu_direccion;
    }

    public String getAluEstatus() {
        return alu_estatus;
    }

    // Setters
    public void setAluCodigo(int alu_codigo) {
        this.alu_codigo = alu_codigo;
    }

    public void setAluNombre(String alu_nombre) {
        this.alu_nombre = alu_nombre;
    }

    public void setAluDireccion(String alu_direccion) {
        this.alu_direccion = alu_direccion;
    }

    public void setAluEstatus(String alu_estatus) {
        this.alu_estatus = alu_estatus;
    }

    // Método toString
    @Override
    public String toString() {
        return "Alumnos{" +
                "alu_codigo='" + alu_codigo + '\'' +
                ", alu_nombre='" + alu_nombre + '\'' +
                ", alu_direccion='" + alu_direccion + '\'' +
                ", alu_estatus='" + alu_estatus + '\'' +
                '}';
    }
}
