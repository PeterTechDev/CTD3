public class Arvore {
    private int altura;
    private int largura;
    private String cor;
    public static int contador;

    public Arvore(int altura, int largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        contador++;
        System.out.println("Nº de árvores criadas: " + contador);

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Arvore.contador = contador;
    }
}
