package parques;

import java.sql.*;

public class TestBDA {

    static String bd = "parques";
    static String login = "root";
    static String password = "root";
    static String url = "jdbc:mysql://localhost:3306/" + bd;

    public static void main(String[] args) throws Exception {

        try (Connection conn = DriverManager.getConnection(url, login, password)) {

            //CONECTADOS CON LA BDA REFERENCIADA POR URL, CON EL USUARIO LOGIN Y SU PASSWORD
            if (conn != null) {
//                System.out.println("Conexión a base de datos " + url + " ... Ok");
                //SELECT
//                String sentencia = "Select * from comunidad";
//
//                PreparedStatement ps = conn.prepareStatement(sentencia);
//                ResultSet rs = ps.executeQuery();
//                
                //INSERT
//                String sql = "Insert into parque(nombre,extension,idcomunidad) "
//                        + "values(?,?,?)";
//                PreparedStatement pi = conn.prepareStatement(sql);
//
//                pi.setString(1, "Albufera");
//                pi.setDouble(2, 100000);
//                pi.setInt(3, 1);
//
//                int numFilas = pi.executeUpdate();
//                System.out.println("filas insertadas:" + numFilas);
//                
                //UPDATE
//                String consulta = "UPDATE PARQUE "
//                        + "SET extension = extension * ? "
//                        + " WHERE nombre = ? ";
//
//                PreparedStatement pu = conn.prepareStatement(consulta);
//                pu.setDouble(1, 1.15);
//                pu.setString(2, "Albufera");
//
//                int numFilasUpdate = pu.executeUpdate();
//                System.out.println("filas modificadas:" + numFilasUpdate);

                //DELETE
                String consulta = "DELETE FROM PARQUE "
                        + " WHERE nombre = ? ";

                PreparedStatement pd = conn.prepareStatement(consulta);
                pd.setString(1, "Albufera");

                int numFilasDelete = pd.executeUpdate();
                System.out.println("filas modificadas:" + numFilasDelete);

            }
        } catch (SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos " + url);
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
