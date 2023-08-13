package crud.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "User_Table")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    @Column
    String name;
    @Column
    String address;

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Model(Long id, String name, String address) {
        Id = id;
        this.name = name;
        this.address = address;
    }

    public Model() {
    }
}
