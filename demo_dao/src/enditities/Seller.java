package enditities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {
    private Integer id;
    private String name ,email;
    private Date birthdata;
    private Double salary;
    private Departament departament;
    public Seller(){

    }

    public Seller(Integer id, String name, String email, Date birthdata, Double salary, Departament departament) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthdata = birthdata;
        this.salary = salary;
        this.departament = departament;

    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthdata=" + birthdata +
                ", salary=" + salary +
                ", departament=" + departament +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seller)) return false;
        Seller seller = (Seller) o;
        return getId().equals(seller.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdata() {
        return birthdata;
    }

    public void setBirthdata(Date birthdata) {
        this.birthdata = birthdata;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

}
