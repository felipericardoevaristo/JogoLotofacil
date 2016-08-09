/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogolotofacil;

import java.util.Comparator;

/**
 *
 * @author felipe ricardo
 */
public class OrdenaNumeroFrequencia implements Comparator<Numero>{

    @Override
    public int compare(Numero t, Numero t1) {
       if(t.getFrequencia() > t1.getFrequencia()){
            return -1;
        }else if(t1.getFrequencia() > t.getFrequencia()){
            return 1;
        }
        else return 0;
    }
    
}
