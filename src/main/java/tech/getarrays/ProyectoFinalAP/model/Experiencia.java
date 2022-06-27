package tech.getarrays.ProyectoFinalAP.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Experiencia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String position;
    private String company;
    private String mode;
    private String start;
    private String end;
    private String timeElapsed;
    private String place;
    @Column(nullable = false, updatable = false)
    private String experienciaCode;

    public Experiencia() {}
    public Experiencia (String position, String company, String mode, String start, String end, String timeElapsed, String place, String experienciaCode) {
        this.position = position;
        this.company = company;
        this.mode = mode;
        this.start = start;
        this.end = end;
        this.timeElapsed = timeElapsed;
        this.place = place;
        this.experienciaCode = experienciaCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
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

    public String getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(String timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getExperienciaCode() {
        return experienciaCode;
    }

    public void setExperienciaCode(String experienciaCode) {
        this.experienciaCode = experienciaCode;
    }

    @Override
    public String toString () {
        return "Experiencia{" +
                "id='" + id +
                ", position='" + position + '\'' +
                ", company='" + company + '\'' +
                ", mode='" + mode +'\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", time elapsed" + timeElapsed + '\'' +
                ", place" + place + '\'' +
                "}";
    }
}
