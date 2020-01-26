package serie;

public class numero {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public numero(int numero) {
        this.numero = numero;
    }

    

    @Override
    public String toString() {
        return "numero{" + "numero=" + numero + '}';
    }
    
    public int calcular(){
        int result=1;
        for (int i = 1; i <= numero; i++) {
            result=result*2;
        }
        return result;
    }
}
