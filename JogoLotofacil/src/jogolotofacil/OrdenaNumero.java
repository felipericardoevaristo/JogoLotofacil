package jogolotofacil;

import java.util.Comparator;

/**
 *
 * @author felipe ricardo
 */
public class OrdenaNumero  implements Comparator<Numero>{

    @Override
    public int compare(Numero t, Numero t1) {
        if(t.getNumero() > t1.getNumero()){
            return 1;
        }else if(t1.getNumero() > t.getNumero()){
            return -1;
        }
        else return 0;
    }
    
}
