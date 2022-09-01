import model.Pessoa;
import ouvintes.ChangeOuvinte;

public class TestaPessoasProprietis {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        ChangeOuvinte ouvinte = new ChangeOuvinte();

        pessoa.addPropertyChangelistener(ouvinte);

        pessoa.setNome("Thiago");
        pessoa.setNome("Thiago Arthur");
        pessoa.setNome("Thiago Arthur Lourenco Lima");
    }

}
