package tech.getarrays.ProyectoFinalAP.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String school;
    private String title;
    private String start;
    private String end;
    @Column(nullable = false, updatable = false)
    private String educacionCode;

    public Educacion () {}
    public Educacion (String school, String title, String start, String end, String educacionCode) {
        this.school = school;
        this.title = title;
        this.start = start;
        this.end = end;
        this.educacionCode = educacionCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getEducacionCode() {
        return educacionCode;
    }

    public void setEducacionCode(String educacionCode) {
        this.educacionCode = educacionCode;
    }

    @Override
    public String toString () {
        return "Educacion{" +
                "id='" + id +
                ", school='" + school + '\'' +
                ", tittle='" + title + '\'' +
                ", start='" + start +'\'' +
                ", end='" + end + '\'' +
                "}";
    }

}
