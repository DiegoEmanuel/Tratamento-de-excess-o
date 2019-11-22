public class Material {
    private String nome;
    private int quantidade;
    
    //construtor

    public Material(String nome, int quantidade)throws QuantidadeInvalidaException{
        this.setNome(nome);
        this.setQuantidade(quantidade);
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int q) throws QuantidadeInvalidaException {
        
        if (quantidade<0){
            throw new QuantidadeInvalidaException("Numero negativo");
        }
        
        this.quantidade=q;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        this.setNome(n);
    }
}
