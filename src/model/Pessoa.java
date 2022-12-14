package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangelistener(PropertyChangeListener ouvinte){
        changeSupport.addPropertyChangeListener(ouvinte);
    }
    public void removePropertyChangeListener(PropertyChangeListener ouvinte){
        changeSupport.removePropertyChangeListener(ouvinte);
    }
    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        String oldValue = this.nome;
        this.nome = nome;

        changeSupport.firePropertyChange("nome", oldValue, this.nome);


    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {

        int oldValue = this.idade;
        this.idade = idade;

        changeSupport.firePropertyChange("idade", oldValue, this.idade);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        String oldValue = this.email;
        this.email = email;

        changeSupport.firePropertyChange("email", oldValue, this.email);
    }

}
