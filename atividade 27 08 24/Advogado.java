public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, String oab) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public double GetSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Advogado: " + "\n" +
                "OAB: " + oab + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "RG: " + rg + "\n" +
                "Endereço: " + endereco + "\n" +
                "Setor: " + setor + "\n" +
                "Sexo: " + sexo + "\n" +
                "Salário: " + salario + "\n" +
                "Data de nascimento: " + dataNascimento;
    }
}
