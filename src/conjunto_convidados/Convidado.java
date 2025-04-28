package conjunto_convidados;

public class Convidado implements Comparable<Convidado>{
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public int compareTo(Convidado convidado) {
        return Integer.compare(this.codigoConvite, convidado.codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado: " + this.nome + " -- Código de convite: " + this.codigoConvite;
    }
}
