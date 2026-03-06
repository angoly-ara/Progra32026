package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Controlador.Alumnos;

public class AlumnosDAO {

    // 🔹 SQL Statements

    private static final String SQL_SELECT =
            "SELECT alu_codigo, alu_nombre, alu_direccion, alu_estatus FROM alumnos";

    private static final String SQL_INSERT =
            "INSERT INTO alumnos(alu_nombre, alu_direccion, alu_estatus) VALUES(?,?,?)";

    private static final String SQL_UPDATE =
            "UPDATE alumnos SET alu_nombre=?, alu_direccion=?, alu_estatus=? WHERE alu_codigo=?";

    private static final String SQL_DELETE =
            "DELETE FROM alumnos WHERE alu_codigo=?";

    private static final String SQL_QUERY =
            "SELECT alu_codigo, alu_nombre, alu_direccion, alu_estatus FROM alumnos WHERE alu_codigo=?";


    // 🔹 SELECT TODOS
    public List<Alumnos> select() {

        List<Alumnos> alumnos = new ArrayList<>();

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Alumnos alumno = new Alumnos(
                        rs.getInt("alu_codigo"),
                        rs.getString("alu_nombre"),
                        rs.getString("alu_direccion"),
                        rs.getString("alu_estatus")
                );

                alumnos.add(alumno);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return alumnos;
    }


    // 🔹 INSERT
    public int insert(Alumnos alumno) {

        int rows = 0;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)) {

            stmt.setString(1, alumno.getAluNombre());
            stmt.setString(2, alumno.getAluDireccion());
            stmt.setString(3, alumno.getAluEstatus());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }


    // 🔹 UPDATE
    public int update(Alumnos alumno) {

        int rows = 0;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE)) {

            stmt.setString(1, alumno.getAluNombre());
            stmt.setString(2, alumno.getAluDireccion());
            stmt.setString(3, alumno.getAluEstatus());
            stmt.setInt(4, alumno.getAluCodigo());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }


    // 🔹 DELETE
    public int delete(Alumnos alumno) {

        int rows = 0;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_DELETE)) {

            stmt.setInt(1, alumno.getAluCodigo());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }


    // 🔹 QUERY POR CÓDIGO
    public Alumnos query(Alumnos alumno) {

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_QUERY)) {

            stmt.setInt(1, alumno.getAluCodigo());

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    alumno.setAluCodigo(rs.getInt("alu_codigo"));
                    alumno.setAluNombre(rs.getString("alu_nombre"));
                    alumno.setAluDireccion(rs.getString("alu_direccion"));
                    alumno.setAluEstatus(rs.getString("alu_estatus"));
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return alumno;
    }
}
