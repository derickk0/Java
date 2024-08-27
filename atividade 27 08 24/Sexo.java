public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
