package a3;

import a3.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOcadastroproduto {
    // Abrir uma conexão
    ConnectionFactory cf = new ConnectionFactory();
        
    public void adicionar(String produtoP, double precoP, String descricaoP){
        DTOproduto cpd = new DTOproduto(produtoP, precoP, descricaoP);
        
        //1: Definir o comando SQL
        String sql = "INSERT INTO produtos ( produtoP, precoP, descricaoP) VALUES (?, ?, ?)";

        try (Connection c = cf.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            //4: Preenche os dados faltantes
            ps.setString(1, cpd.getProdutoP());
            ps.setDouble(2, cpd.getPrecoP());
            ps.setString(3, cpd.getDescricaoP());            
            //5: Executa o comando
            ps.execute();
        }

        catch (SQLException erro){
            erro.printStackTrace();
        }
    }
    
//    public List<DTOproduto> produtoListar() throws SQLException{
//        
//        List<DTOproduto> produtos = new ArrayList<>();
//        Connection c = cf.obtemConexao();
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        
//        while(rs.next()){
//            DTOproduto  = new DTOproduto();
//        }
//         
//        
//        return produtos;
//    }
//    
}
