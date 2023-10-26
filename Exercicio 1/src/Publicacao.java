public class Publicacao {
    private String dataPublicacao;
    private String textoPubliicacao;
    private String linkMidia;

    public static double contadorPublicacao;

    public Publicacao(String dataPublicacao, String textoPubliicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPubliicacao = textoPubliicacao;
        this.linkMidia = linkMidia;

        contadorPublicacao ++;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPubliicacao() {
        return textoPubliicacao;
    }

    public void setTextoPubliicacao(String textoPubliicacao) {
        this.textoPubliicacao = textoPubliicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }

    public static void setContadorPublicacao(double contadorPublicacao) {
        Publicacao.contadorPublicacao = contadorPublicacao;
    }
}
