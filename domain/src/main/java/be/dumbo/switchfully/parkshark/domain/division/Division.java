package be.dumbo.switchfully.parkshark.domain.division;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="DIVISIONS")
public class Division {

    @Id
    @Column(name="ID")
    @SequenceGenerator(name="division_seq", sequenceName = "DIVISIONS_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "division_seq")
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

    public String getName() {
        return name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public String getDirector() {
        return director;
    }

    public Integer getParentDivision() {
        return parentDivision;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Division division = (Division) o;
        return Objects.equals(id, division.id) &&
                Objects.equals(name, division.name) &&
                Objects.equals(originalName, division.originalName) &&
                Objects.equals(director, division.director) &&
                Objects.equals(parentDivision, division.parentDivision);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, originalName, director, parentDivision);
    }
}
