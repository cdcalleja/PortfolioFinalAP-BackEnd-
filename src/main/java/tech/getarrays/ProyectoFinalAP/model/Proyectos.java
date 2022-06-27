package tech.getarrays.ProyectoFinalAP.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Proyectos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (nullable = false, updatable = false)
    private Long id;
    private String name;
    private String start;
    private String end;
    private String description;
    private String url;
    @Column (nullable = false, updatable = false)
    private String proyectosCode;

    public Proyectos () {}
    public Proyectos (String name, String start, String end, String description, String url, String proyectosCode) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.description = description;
        this.url = url;
        this.proyectosCode = proyectosCode;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getProyectosCode() {
        return proyectosCode;
    }

    public void setProyectosCode(String proyectosCode) {
        this.proyectosCode = proyectosCode;
    }

    @Override
    public String toString () {
        return "Experiencia{" +
                "id='" + id +
                ", name='" + name + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end +'\'' +
                ", description" + description + '\'' +
                ", url" + url + '\'' +
                "}";
    }
}
