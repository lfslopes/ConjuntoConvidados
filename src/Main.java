import conjunto_convidados.ConjuntoConvidados;
import conjunto_convidados.Convidado;

public class Main {
    public static void main(String[] args) {
        Convidado convidado = new Convidado("Jorge", 1);
        Convidado convidado2 = new Convidado("Matheus", 4);
        Convidado convidado3 = new Convidado("Maria", 2);
        Convidado convidado4 = new Convidado("Sérgio", 3);

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(convidado, convidado2, convidado3);
        conjuntoConvidados.adicionarConvidado(convidado4);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1);

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();
    }
}
