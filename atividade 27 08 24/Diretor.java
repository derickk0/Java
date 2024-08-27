public class Diretor extends CargoDeConfianca {
    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento, bonificacao);
    }

    @Override
    public double GetSalarioFinal() {
        double salarioBonificacao = 0;
        salarioBonificacao = super.salario * Bonificacao.DIRETOR.valor;
        double salarioPremio = super.salario * 0.5;
        double salarioFinal = (salarioBonificacao + salario) + salarioPremio;
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "\nDiretor: " +
                "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nRG: " + rg + super.endereco +
                "\nSetor: " + super.setor +
                "\nSexo: " + super.sexo +
                "\nSalário: " + this.GetSalarioFinal() +
                "\nData de Nascimento: " + dataNascimento;
    }
}
