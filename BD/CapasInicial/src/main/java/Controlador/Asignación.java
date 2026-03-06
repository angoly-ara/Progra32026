/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Enrique
 */
public class Asignación {
    private String carCodigo;
    private String curCodigo;
    private String maeCodigo;
    private String aluCodigo;
    private String acanota;

    public Asignación(String carCodigo, String curCodigo, String maeCodigo, String aluCodigo, String acanota) {
        this.carCodigo = carCodigo;
        this.curCodigo = curCodigo;
        this.maeCodigo = maeCodigo;
        this.aluCodigo = aluCodigo;
        this.acanota = acanota;
    }

    public String getCarCodigo() {
        return carCodigo;
    }

    public void setCarCodigo(String carCodigo) {
        this.carCodigo = carCodigo;
    }

    public String getCurCodigo() {
        return curCodigo;
    }

    public void setCurCodigo(String curCodigo) {
        this.curCodigo = curCodigo;
    }

    public String getMaeCodigo() {
        return maeCodigo;
    }

    public void setMaeCodigo(String maeCodigo) {
        this.maeCodigo = maeCodigo;
    }

    public String getAluCodigo() {
        return aluCodigo;
    }

    public void setAluCodigo(String aluCodigo) {
        this.aluCodigo = aluCodigo;
    }

    public String getAcanota() {
        return acanota;
    }

    public void setAcanota(String acanota) {
        this.acanota = acanota;
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Asignción{" +
                "car_Codigo='" + carCodigo + '\'' +
                ", cur_Codigo='" + curCodigo + '\'' +
                ", mae_Codio='" + maeCodigo + '\'' +
                ", alu_Codigo='" + aluCodigo + '\'' +
                ", aca_nota='" + acanota + '\'' +
                '}';
    } 
    
    
    
            
}
