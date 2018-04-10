package be.dumbo.switchfully.parkshark.domain.division;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="DIVISION")
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
