public class Motorista extends Funcionario{
    private String carteiraDeHabilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double GetSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Motorista: " + "\n" +
                "Carteira de Habilitaco: " + carteiraDeHabilitacao + '\'' +
                "Nome: '" + nome + '\'' +
                "CPF: '" + cpf + '\'' +
                "RG: '" + rg + '\'' +
                "Endereço: " + endereco +
                "Setor: " + setor +
                "Sexo: " + sexo +
                "Salário: " + salario +
                "Data de nascimento: " + dataNascimento;
    }
}
