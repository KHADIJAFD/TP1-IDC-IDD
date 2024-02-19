package metier;

import dao.IDao;
import metier.IMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
   @Autowired
   @Qualifier("dao")
   private IDao dao;//couplage faible

    public MetierImpl (IDao dao){
        this.dao=dao;
    }
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    /*injecter dans la variable dao un objet
    d'une classe qui implimente dao.IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
