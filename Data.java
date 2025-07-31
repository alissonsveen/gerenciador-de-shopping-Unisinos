public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (ehDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Atribuindo data padrão 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean ehDataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) return false;

        int diasNoMes;
        switch (mes) {
            case 2:
                diasNoMes = (ehAnoBissexto(ano)) ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                diasNoMes = 30;
                break;
            default:
                diasNoMes = 31;
        }

        return dia >= 1 && dia <= diasNoMes;
    }

    public boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public boolean verificaAnoBissexto() {
        return ehAnoBissexto(this.ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
