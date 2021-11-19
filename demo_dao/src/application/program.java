package application;

import enditities.Departament;
import enditities.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        Departament obj = new Departament(1,"books");
        Seller seller = new Seller(21,"bob","bob@gmail.com",new Date(),3000.0,obj);
        SellerDao sellerDao =  DaoFactory.createSellerDao();
        System.out.println(seller);
    }
}
