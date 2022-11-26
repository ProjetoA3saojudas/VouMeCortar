
package a3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class DAOproduto {
    Connection c;
    PreparedStatement ps;
    ResultSet rs;
    ArrayList<DTOprodutonova> lista = new ArrayList<>();
   
   public ArrayList<DTOprodutonova> PesquisarProduto(){
       String sql =  "select * from produtos";
       ConnectionFactory cf = new ConnectionFactory();
       Connection c = cf.obtemConexao();
       
       
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
    
    public ResultSet listarProduto(){
        ConnectionFactory cf = new ConnectionFactory();
       Connection c = cf.obtemConexao();
       String sql =  "select * from produtos ORDER BY idP";
         
         try {
            ps = c.prepareStatement(sql);
            return ps.executeQuery();
            
        } catch (SQLException erro) {
             erro.printStackTrace();
             return null;
        }
    }
    
}
