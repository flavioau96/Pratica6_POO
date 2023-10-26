
public class Pessoa {

    private String nome;
    private double email;
    private double telefone;


    public Pessoa(String nome, double email, double telefone) {

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

    }

    public String getInfo() {
        return this.nome + " " + this.email + " " + this.telefone;
    }





}