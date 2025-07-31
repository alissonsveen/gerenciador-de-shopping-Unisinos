public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public boolean insereLoja (Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja (String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        if (tipoLoja == null) return -1;

        tipoLoja = tipoLoja.trim().toLowerCase();

        int quantidadeLojas = 0;
        for (Loja loja : lojas) {
            if (loja == null) continue;

            switch (tipoLoja) {
                case "alimentacao":
                    if (loja instanceof Alimentacao) quantidadeLojas++;
                    break;
                case "vestuario":
                    if (loja instanceof Vestuario) quantidadeLojas++;
                    break;
                case "bijuteria":
                    if (loja instanceof Bijuteria) quantidadeLojas++;
                    break;
                case "cosmético":
                    if (loja instanceof Cosmetico) quantidadeLojas++;
                    break;
                case "informática":
                    if (loja instanceof Informatica) quantidadeLojas++;
                    break;
                default:
                    return -1;
            }
        }

        return quantidadeLojas;
    }

    public Informatica lojaSeguroMaisCaro () {
        Informatica lojaMaisCara = null;
        double maiorSeguro = 0;
        boolean encontrou = false;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica informatica) {
                encontrou = true;
                if (informatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = informatica.getSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }
        return encontrou ? lojaMaisCara : null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome).append("\n");
        sb.append("Endereço: ").append(endereco).append("\n");
        sb.append("Lojas:\n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja).append("\n");
            }
        }
        return sb.toString();
    }
}
