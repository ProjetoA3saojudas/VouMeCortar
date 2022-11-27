
package a3;

import a3.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class DAOproduto {
    ConnectionFactory cf;
    Connection c;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<DTOprodutonova> lista = new ArrayList<>();
   
   public ArrayList<DTOprodutonova> PesquisarProduto(){
       String sql =  "select * from produtos";
       cf = new ConnectionFactory();
       c = cf.obtemConexao();
       
       
       try {
           ps = c.prepareStatement(sql);
           rs = ps.executeQuery();          
           
           while (rs.next()){
               DTOprodutonova objDTOprodutonova = new DTOprodutonova();
               objDTOprodutonova.setIdP(rs.getInt("idP"));
               objDTOprodutonova.setPrecoP(rs.getDouble("precoP"));
               objDTOprodutonova.setProdutoP(rs.getString("produtoP"));
                
            lista.add(objDTOprodutonova);
             
               
           }
           
       } catch (SQLException erro) {
           erro.printStackTrace();
           
           
       }
       return lista; 
   }
   
   public ResultSet listarproduto(){
       c = new ConnectionFactory().obtemConexao();
       String sql = "select * from produtos order by produtoP";
       
       try{
           ps = c.prepareStatement(sql);
           return ps.executeQuery();
       }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "listar produto combobox" + erro.getMessage());
           return null;
       }
   }
    
}
