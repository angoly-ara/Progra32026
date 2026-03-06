/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.Jornada;
import Modelo.JornadaDAO;
/**
 *
 * @author Enrique
 */
public class Principal2 {
     public static void main(String[] args) {

        JornadaDAO dao = new JornadaDAO();
        
        // INSERT
        Jornada jornada = new Jornada();
        jornada.setJor_nombre("Matutina");
        int registros = dao.insert(jornada);
        
        

        // QUERY
        Jornada jornadaBuscar = new Jornada();
        jornadaBuscar.setJor_codigo(1);

        //jornadaBuscar = dao.query(jornadaBuscar);
        //System.out.println("Jornada encontrado:");
        //System.out.println(jornadaBuscar);

        // UPDATE
        Jornada JornadaActualizar = new Jornada(2, "Despertina");
        //int actualizados = dao.update(jornadaActualizar);
        //System.out.println("Registros actualizados: " + actualizados);

        // DELETE
        Jornada jornadaEliminar = new Jornada();
        jornadaEliminar.setJor_codigo(1);
        //int eliminados = dao.delete(jornadaEliminar);
        //System.out.println("Registros eliminados: " + eliminados);
    }
}
