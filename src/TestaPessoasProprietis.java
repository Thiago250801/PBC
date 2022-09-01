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

        pessoa.setIdade(18);
        pessoa.setIdade(19);
        pessoa.setIdade(20);

        pessoa.setEmail("thiago@gmail.com");
        pessoa.setEmail("thagoArthur@gmail.com");
        pessoa.setEmail("Thlimabsgim@gmail.com");
    }

}
