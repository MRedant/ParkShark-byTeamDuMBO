package be.dumbo.switchfully.parkshark.domain.division;

import javax.persistence.*;

@Entity
@Table(name="DIVISION")
public class Division {

    @Id
    @Column(name="ID")
    @SequenceGenerator(name="divisions_seq", sequenceName = "DIVISIONS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "divisions_seq")
    private Integer id;
    @Column(name="NAME")
    private String name;
    @Column(name="ORIGINALNAME")
    private String originalName;
    @Column(name="DIRECTOR")
    private String director;
    @Column(name="PARENTDIVISION")
    private Integer parentDivision;

    private Division() {
    }

    public Division(String name, String originalName, String director, Integer parentDivision) {
        this.name = name;
        this.originalName = originalName;
        this.director = director;
        this.parentDivision = parentDivision;
    }

    public Division(String name, String originalName, String director) {
        this.name = name;
        this.originalName = originalName;
        this.director = director;
    }


    public Integer getId() {
        return id;

    }
}
