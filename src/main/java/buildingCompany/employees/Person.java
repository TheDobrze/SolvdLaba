package buildingCompany.employees;

import java.util.Date;

abstract class Person {

    public int id;
    public String Name;
    public String LastName;
    public Date joined;

    public Person(int id, String name, String lastName, Date joined) {
        this.id = id;
        Name = name;
        LastName = lastName;
        this.joined = joined;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", joined=" + joined +
                '}';
    }
}
