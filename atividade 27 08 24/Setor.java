public enum Setor {
    ENGENHARIA("Engenharia"),
    JURIDICO("Jurídico"),
    RECURSOS_HUMANOS("RH"),
    MARKETING("Marketing"),
    OPERACOES("Operações");

    String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
