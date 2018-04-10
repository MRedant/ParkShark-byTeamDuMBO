package be.dumbo.switchfully.parkshark.domain.division;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Division {

    @Id
    private Integer id;
    private String name;
    private String originalName;
    private String director;
    private Integer parentDivision;

    private Division() {
    }

    public Division(String name, String originalName, String director, Integer parentDivision) {
        this.name = name;
        this.originalName = originalName;
        this.director = director;
        this.parentDivision = parentDivision;
    }



}
