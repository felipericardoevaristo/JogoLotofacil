package jogolotofacil;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author felipe ricardo
 */
public class Padrao_LotoFacil {

    public static void main(String[] args) throws FileNotFoundException {
        LinkedList<Jogo> jogos=null;
        
        try{
            FileInputStream stream = new FileInputStream("resultadosLotofacil.txt");
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader br = new BufferedReader(reader);
            String linha;
            Jogo jogo = null;
            jogos = new LinkedList<>();
            while((linha = br.readLine()) != null) {
                if(!(linha.contains("Resultado") || linha.contains("Mais"))){
                    String tokens[] = linha.split(" ");
                    jogo = new Jogo();
                    for(int i=0; i<tokens.length; i++){
                        jogo.addBola(Integer.parseInt(tokens[i]));
                    }    
                    jogos.add(jogo);
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro na leitura de arquivo");
        }
        
        Logica_Lotofacil l = new Logica_Lotofacil(jogos);
        System.out.println(l.quantidadeJogos()+" jogos");
        LinkedList<Numero> frequenciaNumeros = l.listaQtd();
        l.exibeNumeros(frequenciaNumeros);
        
        System.out.println("#################\n");
        
        System.out.println("15 mais frequentes");
        LinkedList<Numero> maisFrequentes = l.lista15MaisFrequentes(frequenciaNumeros);
        l.exibeNumeros(maisFrequentes);
        
        System.out.println("#################\n");
        
        System.out.println("15 menos frequentes");
        LinkedList<Numero> menosFrequentes = l.lista15MenosFrequentes(frequenciaNumeros);
        l.exibeNumeros(menosFrequentes);
        
        System.out.println("#################\n");
        
        System.out.println("numeros mais e menos frequentes");
        LinkedList<Numero> misto = l.misto15Mais_E_MenosFrequentes(maisFrequentes, menosFrequentes);
        l.exibeNumeros(misto);
    
        System.out.println("#################\nMaiores Sequencias");
        
        for(int i=1;i<26;i++){
            System.out.println("numero "+i+" = "+l.RetornaMaiorFrequencia(l.maiorFrequenciaNumero(jogos, i)));
        }
        
        LinkedList<Integer> somaJogos = l.somaDeTodosNumerosCadaJogo(jogos);
   //     for(Integer i : somaJogos){
   //         System.out.println(i);
    //    }
        System.out.println("maior soma "+l.maiorSoma(somaJogos));
        System.out.println("menor soma "+l.menorSoma(somaJogos));
     
        
    }
}
