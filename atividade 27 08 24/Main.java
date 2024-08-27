//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("sla","5","nao tem","666","japao",UnidadeFederativa.RIO_DE_JANEIRO);
        Endereco endereco2 = new Endereco("sla tbm","3","tem tbm n","cep4","t",UnidadeFederativa.SAO_PAULO);
        Gerente gerente = new Gerente("nome", "cpf", "rg", endereco,Setor.ENGENHARIA,Sexo.MASCULINO,5000,"2020",Bonificacao.GERENTE);
        Diretor diretor = new Diretor("zé","cpf2","rg2",endereco2,Setor.JURIDICO,Sexo.FEMININO,10000,"2021",Bonificacao.DIRETOR);

        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
    }
}