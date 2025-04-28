package conjunto_convidados;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new TreeSet<>();
    }
    public ConjuntoConvidados(Set<Convidado> convidados) {
        this.convidados = convidados;
    }
    public ConjuntoConvidados(Convidado...convidado) {
        this.convidados = new TreeSet<>();
        this.convidados.addAll(Arrays.asList(convidado));
    }

    public void adicionarConvidado(Convidado convidado) {
        this.convidados.add(convidado);
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        for (Convidado convidado : this.convidados) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                this.convidados.remove(convidado);
                return;
            }
        }
        System.out.println("Código de convite não encontrado");
    }
    public int contarConvidados() {
        return this.convidados.size();
    }
    public void exibirConvidados() {
        this.convidados.forEach(System.out::println);
    }
    
}
