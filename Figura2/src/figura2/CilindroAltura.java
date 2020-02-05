package figura2;

public class CilindroAltura extends Circulo{
    private int altura;

    public CilindroAltura() {
    }

    public CilindroAltura(int altura) {
        this.altura = altura;
    }

    public CilindroAltura(int altura, int radio) {
        super(radio);
        this.altura = altura;
    }

    public CilindroAltura(int altura, int radio, int x, int y) {
        super(radio, x, y);
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
}
