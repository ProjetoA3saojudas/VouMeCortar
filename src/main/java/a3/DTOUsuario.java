package a3;


public class DTOusuario {
    private int id;
    private String email, senha, tipousuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipousuario() {
        return tipousuario;
    }
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }
    
     
    
}
