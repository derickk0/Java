public enum UnidadeFederativa {
    BAHIA("Bahia, BA"),
    SAO_PAULO("São Paulo, SP"),
    RIO_DE_JANEIRO("Rio de Janeiro, RJ");

    String texto;

    UnidadeFederativa(String texto) {
        this.texto = texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
