package a3;

public class DTOproduto {
    int idP;
    String produtoP;
    Double precoP;
    String descricaoP;

    public DTOproduto(String produtoP, Double precoP, String descricaoP) {
        this.produtoP = produtoP;
        this.precoP = precoP;
        this.descricaoP = descricaoP;
    }
    
    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getProdutoP() {
        return produtoP;
    }

    public void setProdutoP(String produtoP) {
        this.produtoP = produtoP;
    }

    public Double getPrecoP() {
        return precoP;
    }

    public void setPrecoP(Double precoP) {
        this.precoP = precoP;
    }

    public String getDescricaoP() {
        return descricaoP;
    }

    public void setDescricaoP(String descricaoP) {
        this.descricaoP = descricaoP;
    }

}