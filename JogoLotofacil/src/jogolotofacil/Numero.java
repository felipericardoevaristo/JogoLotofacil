package jogolotofacil;

/**
 *
 * @author felipe ricardo
 */
public class Numero {
    private int numero;
    private int frequencia;
    private int maiorSequencia;
    private int menorSequencia;

    public Numero(){}
    
    public Numero(int numero, int frequencia){
        this.numero=numero;
        this.frequencia=frequencia;
    }
    
    public int getMaiorSequencia() {
        return maiorSequencia;
    }

    public void setMaiorSequencia(int maiorSequencia) {
        this.maiorSequencia = maiorSequencia;
    }

    public int getMenorSequencia() {
        return menorSequencia;
    }

    public void setMenorSequencia(int menorSequencia) {
        this.menorSequencia = menorSequencia;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
    
    public String exibeDadosNumero(){
        return "numero "+numero+" frequencia "+frequencia;
    }
    
}
