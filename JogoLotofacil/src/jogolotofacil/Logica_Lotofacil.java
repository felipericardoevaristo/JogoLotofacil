package jogolotofacil;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe ricardo
 */
public class Logica_Lotofacil {
    private LinkedList<Jogo> jogos;
    
    public Logica_Lotofacil(LinkedList<Jogo> jogos){
        this.jogos = jogos;
    }
    
    public int quantidadeJogos(){
        return jogos.size();
    }
    
    public LinkedList<Numero> listaQtd(){
        LinkedList<Numero> numeros = new LinkedList<>();
        int num[] = new int[25];
        for(int i=0; i<num.length;i++){
            num[i]=0;
        }
        for(Jogo j : jogos){
            for(Integer i : j.getBolas()){
                if(i==1)
                    num[0]++;
                if(i==2)
                    num[1]++;
                if(i==3)
                    num[2]++;
                if(i==4)
                    num[3]++;
                if(i==5)
                    num[4]++;
                if(i==6)
                    num[5]++;
                if(i==7)
                    num[6]++;
                if(i==8)
                    num[7]++;
                if(i==9)
                    num[8]++;
                if(i==10)
                    num[9]++;
                if(i==11)
                    num[10]++;
                if(i==12)
                    num[11]++;
                if(i==13)
                    num[12]++;
                if(i==14)
                    num[13]++;
                if(i==15)
                    num[14]++;
                if(i==16)
                    num[15]++;
                if(i==17)
                    num[16]++;
                if(i==18)
                    num[17]++;
                if(i==19)
                    num[18]++;
                if(i==20)
                    num[19]++;
                if(i==21)
                    num[20]++;
                if(i==22)
                    num[21]++;
                if(i==23)
                    num[22]++;
                if(i==24)
                    num[23]++;
                if(i==25)
                    num[24]++;
            }
        }
        for(int i=0;i<num.length;i++){
            numeros.add(new Numero((i+1), num[i]));
        }
        return numeros;
    }
    
    public void exibeNumeros(LinkedList<Numero> numeros){
        for(Numero n: numeros){
            System.out.println(n.exibeDadosNumero());
        }
    }

    public LinkedList<Numero> lista15MaisFrequentes(LinkedList<Numero> numeros){
        LinkedList<Numero> quinzeNumerosMaisFrequentes = new LinkedList<>();
        
        Collections.sort(numeros, new OrdenaNumeroFrequencia());
        
        for(int i=0; i<15; i++){
            quinzeNumerosMaisFrequentes.add(numeros.get(i));
        }
        
        //Collections.sort(quinzeNumerosMaisFrequentes, new OrdenaNumero());
        return quinzeNumerosMaisFrequentes;
    }

    public LinkedList<Numero> lista15MenosFrequentes(LinkedList<Numero> numeros){
        LinkedList<Numero> quinzeNumerosMenosFrequentes = new LinkedList<>();
        
        Collections.sort(numeros, new OrdenaNumeroFrequencia());
        
        for(int i=24; i>=10; i--){
            quinzeNumerosMenosFrequentes.add(numeros.get(i));
        }
        
        //Collections.sort(quinzeNumerosMenosFrequentes, new OrdenaNumero());
        return quinzeNumerosMenosFrequentes;
    }
    
    public LinkedList<Numero> misto15Mais_E_MenosFrequentes(LinkedList<Numero> maisFrequentes, LinkedList<Numero> menosFrequentes){
        LinkedList<Numero> mais_E_Menos_Frequentes = new LinkedList<>();
        for(Numero n : maisFrequentes){
            if(!numeroEncontrado(mais_E_Menos_Frequentes, n))
               mais_E_Menos_Frequentes.add(n);
        }
        for(Numero n : menosFrequentes){
            if(!numeroEncontrado(mais_E_Menos_Frequentes, n))
               mais_E_Menos_Frequentes.add(n);
        }
        
        Collections.sort(mais_E_Menos_Frequentes, new OrdenaNumero());
        return mais_E_Menos_Frequentes;
    }
    
    public boolean numeroEncontrado(LinkedList<Numero> numeros, Numero num){
        for(int i=0;i<numeros.size();i++){
            if(numeros.get(i).getNumero() == num.getNumero())
                return true;
        }
        return false;
    }
    
    /*
    * retorna lista com todas as sequencias obtidas por um numero
    */
    public LinkedList<Integer> maiorFrequenciaNumero(LinkedList<Jogo> jogos, int num){
        LinkedList<Integer> frequencias = new LinkedList<>();
        int mf = 0;
        boolean achouNumeroNoJogo=false;
        for(Jogo j : jogos){
            for(Integer n  : j.getBolas()){
                if(num == n)achouNumeroNoJogo=true;
            }
            if(achouNumeroNoJogo){
                achouNumeroNoJogo=false;
                mf++;
            }else{
                frequencias.add(mf);
                mf=0;
            } 
        }
        return frequencias;
    }
    
    /*
    * retorna a maior sequencia obtida por um numero
    */
    public int RetornaMaiorFrequencia(LinkedList<Integer> numeros){
        Collections.sort(numeros);
        return numeros.getLast();
    }
    
    
    /*
    * armazena a soma de todos os numeros em uma lista de inteiros
    */
    public LinkedList<Integer> somaDeTodosNumerosCadaJogo(LinkedList<Jogo> jogo){
        LinkedList<Integer> somaJogos = new LinkedList<>();
        for(Jogo j : jogo){
            somaJogos.add(somaNumerosJogo(j));
        }
        return somaJogos;
    }
    
    /*
    * retorna a soma de todos os numeros de um jogo
    */
    public int somaNumerosJogo(Jogo jogo){
        int soma = 0;
        for(Integer n  : jogo.getBolas()){
            soma += n;
        }
        return soma;
    }
    
    public int maiorSoma(LinkedList<Integer> num){
        Collections.sort(num);
        return num.getLast();
    }
    
    public int menorSoma(LinkedList<Integer> num){
        Collections.sort(num);
        return num.getFirst();
    }
    
    public void exibeValoresInteiros(LinkedList<Integer> num){
        for(Integer i : num){
            System.out.println(i);
        }
    }
    
    
    
}


