package de.gothaer.firstmove.FirstMove;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class FirstMove
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String birth_date;
    private String name;
    private String address;
    private String wish_city;

    @Override
    public String toString() {
        return "FirstMove{" +
                "id=" + id +
                ", birthday ='" + birth_date + '\''+
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", Wunschstadt='" + wish_city + '\'' +
                '}';
    }

    public FirstMove(){}

    public FirstMove(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public FirstMove(String birth_date, String name, String address, String wish_city)
    {
        this.birth_date = birth_date;
        this.name = name;
        this.address = address;
        this.wish_city = wish_city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirth_date(String birth_date) {this.birth_date = birth_date;}

    public String getBirth_date() { return birth_date; }

    public String getWish_city() { return wish_city; }

    public void setWish_city(String wish_city) {this.wish_city = wish_city; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstMove firstMove = (FirstMove) o;
        return id == firstMove.id &&
                name.equals(firstMove.name) &&
                address.equals(firstMove.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
