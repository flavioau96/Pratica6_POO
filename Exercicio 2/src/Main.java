
public class Main {

    public static void main(String[] args) {


        Empresa Flavio = new Empresa("Paulo0", "Lolzin");

        Funcionario Flavioo = new Funcionario("Flavio Augusto", "Pedreiro", 3000, "Maio", "121191");
        Funcionario Marta = new Funcionario("Marta ", "Chefia", 40000, "agosto", "3107");
        Funcionario Joaquina = new Funcionario("Joaquina", "Dev", 2500, "Dezembro", "520364");

        Flavio.contratar(Flavioo);
        Flavio.contratar(Marta);
        Flavio.contratar(Joaquina);

        System.out.println("Total de funcionarios pos contratação: "+Flavio.numDeFunc());

        Flavio.demitir(Flavioo);
        Flavio.demitir(Joaquina);

        System.out.println("Total de funcionarios depois da Demissão: "+Flavio.numDeFunc());

    }

}