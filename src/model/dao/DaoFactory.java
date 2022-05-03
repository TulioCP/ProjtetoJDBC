package model.dao;

import model.dao.IMPL.SellerDaoJDBC;

public class DaoFactory {
    
    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }

}
