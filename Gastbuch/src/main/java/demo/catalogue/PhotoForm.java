package demo.catalogue;

import javax.validation.constraints.NotBlank;

public class PhotoForm {
    private @NotBlank String main_person;
    private @NotBlank String place;
    private @NotBlank String name;
    public PhotoForm(String name,String main_person,String place){
        this.name= name;
        this.main_person=main_person;
        this.place= place;
    }

    public String getName() {
        return name;
    }

    public String getMain_person() {
        return main_person;
    }

    public String getPlace() {
        return place;
    }
}
