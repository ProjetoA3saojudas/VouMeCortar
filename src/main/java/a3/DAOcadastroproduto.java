package a3;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class DAOcadastroproduto {
    public void adicionar(String produtoP, double precoP, String descricaoP){
        DTOcadasproduto cpd = new DTOcadasproduto(produtoP, precoP, descricaoP);
        
        //1: Definir o comando SQL
        String sql = "INSERT INTO produtos ( produtoP, precoP, descricaoP) VALUES (?, ?, ?)";

        //2: Abrir uma conexão
        ConnectionFactory cf = new ConnectionFactory();
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

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
