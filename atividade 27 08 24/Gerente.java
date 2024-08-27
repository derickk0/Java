public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento, bonificacao);
    }
    @Override
    public double GetSalarioFinal() {
        double salarioBonificacao = 0;
        salarioBonificacao = super.salario * Bonificacao.GERENTE.valor;
        double salarioFinal = salarioBonificacao + salario;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "\nGerente: " +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nRG: " + rg + super.endereco +
                "\nSetor: " + setor +
                "\nSexo: " + sexo +
                "\nSalário: " + this.GetSalarioFinal() +
                "\nData de nascimento: " + dataNascimento;
    }
}
