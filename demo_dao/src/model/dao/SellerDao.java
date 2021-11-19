package model.dao;

import enditities.Departament;
import enditities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void uptade(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
