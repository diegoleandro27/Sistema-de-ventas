
package sistema;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionSQL {

    static com.mysql.cj.xdevapi.Statement createStament() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static PreparedStatement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
    Connection conectar; 
    Statement st;
    
    // Method used to conect to the local Database
    public Connection conexion()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema2","root", "Scarface27#");
            System.out.println("Conexion establecida.");   
          
        } catch (HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, """
                                                 No se pude hacer la conexion :(  
                                                """ +  e.getMessage());
        }return conectar; 
        
        
    } 

    PreparedStatement createStament(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
}



//            String sql = "select * from tabladedatos";
//            Statement pst = con.prepareStatement(sql);
//            java.sql.Connection co = conect.conexion();
//     
//            DefaultTableModel model = new DefaultTableModel();
//
//           
//
//            String[] data = new String[9];
//            try {
//                pst = co.createStatement();
//                ResultSet rs = pst.executeQuery(sql);
//
//                while (rs.next()) {
//                    tbd.addCell(data[0] = rs.getString(1));
//                    tbd.addCell(data[1] = rs.getString(2));
//                    tbd.addCell(data[2] = rs.getString(3));
//                    tbd.addCell(data[3] = rs.getString(4));
//                    tbd.addCell(data[4] = rs.getString(5));
//                    tbd.addCell(data[5] = rs.getString(6));
//                    tbd.addCell(data[6] = rs.getString(7));
//                    tbd.addCell(data[7] = rs.getString(8));
//                    tbd.addCell(data[8] = rs.getString(9));
//                    model.addRow(data);
//
//                }
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null, "Error" + ex.toString());
//            }
//            doc.add(tbd);
//            
//
//            doc.close(); 
//            archivo.close();
//            Desktop.getDesktop().open(file);
//            
//            
//        } catch (FileNotFoundException ex) {    
//           JOptionPane.showMessageDialog(null, ex.getMessage() + "No se pudo crear el Archivo");
//        } catch (DocumentException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage() + "No se pudo crear el Documento");
//        } catch (IOException ex) {
//             JOptionPane.showMessageDialog(null, ex.getMessage() + "Error de IO");
//        }

