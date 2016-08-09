package jogolotofacil;

import java.util.LinkedList;


/**
 *
 * @author felipe ricardo
 */
public class Jogo {
    private LinkedList<Integer> bolas;
    private String data;
    
    public Jogo(){
        bolas = new LinkedList<>();
    }

    public void addBola(int bola){
        bolas.add(bola);
    }
    
    public LinkedList<Integer> getBolas() {
        return bolas;
    }

    public void setBolas(LinkedList<Integer> bolas) {
        this.bolas = bolas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String exibeJogo(){
        String b="";
        for(int i=0; i<bolas.size(); i++){
            b += bolas.get(i)+" ";
        }
        return b;
    }
    
}
