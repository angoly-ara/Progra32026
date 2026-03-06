/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Alumnos;
import Modelo.AlumnosDAO;


public class Principal {

    public static void main(String[] args) {

        AlumnosDAO dao = new AlumnosDAO();

        // INSERT
        Alumnos alumno = new Alumnos();
        alumno.setAluNombre("Juan Perez");
        alumno.setAluDireccion("Ciudad de Guatemala");
        alumno.setAluEstatus("Activo");

        //int registros = dao.insert(alumno);
        //System.out.println("Registros insertados: " + registros);

        // QUERY
        Alumnos alumnoBuscar = new Alumnos();
        alumnoBuscar.setAluCodigo(1);

        alumnoBuscar = dao.query(alumnoBuscar);
        //System.out.println("Alumno encontrado:");
        //System.out.println(alumnoBuscar);

        // UPDATE
        Alumnos alumnoActualizar = new Alumnos(1, "Juan Perez Actualizado", "Zona 1", "Activo");
        //int actualizados = dao.update(alumnoActualizar);
        //System.out.println("Registros actualizados: " + actualizados);

        // DELETE
        Alumnos alumnoEliminar = new Alumnos();
        //alumnoEliminar.setAluCodigo(1);
        //int eliminados = dao.delete(alumnoEliminar);
        //System.out.println("Registros eliminados: " + eliminados);
       
    }
}