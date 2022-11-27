package a3;

import a3.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DAOCadastrousuario {
    public void adicionar(String nome, String email, String senha, String tipousuario){
        DTOcadastrousuario cu = new DTOcadastrousuario(nome, email, senha, tipousuario);
        
        //1: Definir o comando SQL
        String sql = "INSERT INTO cadastrousuario(nome, email, senha,  tipousuario) VALUES (?, ?, ?, ?)";

        //2: Abrir uma conexão
        ConnectionFactory cf = new ConnectionFactory();
        try (Connection c = cf.obtemConexao()){
            //3: Pré compila o comando
            PreparedStatement ps = c.prepareStatement(sql);
            
            //4: Preenche os dados faltantes
            ps.setString(1, cu.getNome());
            ps.setString(2, cu.getEmail());
            ps.setString(3, cu.getSenha());
            ps.setString(4, cu.getTipousuario());
            
            //5: Executa o comando
            ps.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
    }
}
