package a3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import pacote_a3.ConnectionFactory;
//import pacote_a3.UsuarioDTO;

public class UsuarioDAO {
    
    Connection c;
   
        public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
         c = new ConnectionFactory().obtemConexao();
         
         try {
             String sql = "select * from cadastrousuario where email = ? and senha =?";
             PreparedStatement pstm = c.prepareStatement(sql); 
             pstm.setString(1, objusuariodto.getEmail());
             pstm.setString(2, objusuariodto.getSenha()); 
             
             ResultSet rs = pstm.executeQuery();
             return rs; 
            
        } catch (SQLException erro) {
             JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
             return null;
        }
                 
                 
    }
    
}
