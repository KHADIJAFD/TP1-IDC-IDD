package dao;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("version base de donnee");
        double temp=Math.random()*40;
        return temp;
    }
}
