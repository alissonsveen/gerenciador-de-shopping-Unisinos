public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataReferencia) {
        if (dataReferencia.getAno() > this.dataValidade.getAno()) {
            return true;
        } else if (dataReferencia.getAno() == this.dataValidade.getAno()) {
            if (dataReferencia.getMes() > this.dataValidade.getMes()) {
                return true;
            } else if (dataReferencia.getMes() == this.dataValidade.getMes()) {
                return dataReferencia.getDia() > this.dataValidade.getDia();
            }
        }
        return false;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco + ", Validade: " + dataValidade;
    }

}
