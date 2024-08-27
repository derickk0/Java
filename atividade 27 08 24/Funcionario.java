public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Setor setor;
    protected Sexo sexo;
    protected double salario;
    protected String dataNascimento;

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.sexo = sexo;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public abstract double GetSalarioFinal();
}
