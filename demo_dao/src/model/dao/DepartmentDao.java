package model.dao;

import enditities.Departament;

import java.util.List;

public interface DepartmentDao {
    void insert(Departament obj);
    void uptade(Departament obj);
    void deleteById(Integer id);
    Departament findById(Integer id);
    List<Departament> findAll();
}
