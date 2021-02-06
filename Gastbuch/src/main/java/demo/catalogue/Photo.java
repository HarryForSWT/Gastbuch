package demo.catalogue;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Photo  {
    private String name;
    private String place;
    private String main_person;
    private @Id @GeneratedValue long id;
    public Photo(String name,String main_person,String place){
        this.place=place;
        this.name=name;
        this.main_person= main_person;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getMain_person() {
        return main_person;
    }

    public void setMain_person(String main_person) {
        this.main_person = main_person;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getId() {
        return id;
    }
}
