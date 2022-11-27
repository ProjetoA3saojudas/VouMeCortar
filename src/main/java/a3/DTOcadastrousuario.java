package a3;

public class DTOcadastrousuario {
    private String nome;
    private String email;
    private String senha;
    private String tipousuario;

    public DTOcadastrousuario(String nome, String email, String senha, String tipousuario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.tipousuario = tipousuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipousuario() {
        return tipousuario;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }
}
