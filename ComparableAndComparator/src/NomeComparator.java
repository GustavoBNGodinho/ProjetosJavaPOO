import java.util.Comparator;

public class NomeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa, Pessoa t1) {
        return pessoa.nome.compareTo(t1.nome);
    }
}


