/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Enrique
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Controlador.Jornada;

public class JornadaDAO {

    // 🔹 SQL Statements

    private static final String SQL_SELECT =
            "SELECT jor_codigo, jor_nombre FROM jornadas";

    private static final String SQL_INSERT =
        "INSERT INTO jornadas(jor_nombre) VALUES(?)";

    private static final String SQL_UPDATE =
            "UPDATE jornadas SET jor_nombre=? WHERE jor_codigo=?";

    private static final String SQL_DELETE =
            "DELETE FROM jornadas WHERE jor_codigo=?";

    private static final String SQL_QUERY =
            "SELECT jor_codigo, jor_nombre FROM jornadas WHERE jor_codigo=?";


    // 🔹 SELECT TODOS
    public List<Jornada> select() {

        List<Jornada> jornadas = new ArrayList<>();

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_SELECT);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Jornada jornada = new Jornada(
                        rs.getInt("jor_codigo"),
                        rs.getString("jor_nombre")
                );
                jornadas.add(jornada);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return jornadas;
    }


    // 🔹 INSERT
public int insert(Jornada jornada) {

    int rows = 0;

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(SQL_INSERT)) {

        stmt.setString(1, jornada.getJor_nombre());

        rows = stmt.executeUpdate();

    } catch (SQLException ex) {
        ex.printStackTrace(System.out);
    }

    return rows;
}


    // 🔹 UPDATE
    public int update(Jornada jornada) {

    int rows = 0;

    try (Connection conn = Conexion.getConnection();
         PreparedStatement stmt = conn.prepareStatement(SQL_UPDATE)) {

        stmt.setString(1, jornada.getJor_nombre());
        stmt.setInt(2, jornada.getJor_codigo());

        rows = stmt.executeUpdate();

    } catch (SQLException ex) {
        ex.printStackTrace(System.out);
    }

    return rows;
}


    // 🔹 DELETE
    public int delete(Jornada jornada) {

        int rows = 0;

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_DELETE)) {

            stmt.setInt(1, jornada.getJor_codigo());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return rows;
    }


    // 🔹 QUERY POR CÓDIGO
    public Jornada query(Jornada jornada) {

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(SQL_QUERY)) {

            stmt.setInt(1, jornada.getJor_codigo());

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    jornada.setJor_codigo(rs.getInt("jor_codigo"));
                    jornada.setJor_nombre(rs.getString("jor_nombre"));

                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return jornada;
    }
}
