


public class EmpresaB {

    public static int cont = 0;

    private String nome;
    private String cnpj;
    private int qtd_vagas=0;
    private Funcionario func;

    private Funcionario[] funcionarios;



    public EmpresaB(String nome, String cnpj, int qtd_vagas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtd_vagas = qtd_vagas;
        funcionarios = new Funcionario[qtd_vagas];
    }


    public EmpresaB(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtd_vagas = 100;
        funcionarios = new Funcionario[100];
    }

    public void contratar(Funcionario newFunc) {
        funcionarios[cont] = newFunc;
        this.func.setContratado(true);
        cont++;
    }

    public void demitir(Funcionario oldFunc) {

        oldFunc.setContratado(false);
        cont--;

    }

    public int numDeFunc() {
        return this.qtd_vagas;
    }
}