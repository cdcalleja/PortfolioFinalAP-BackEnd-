package tech.getarrays.ProyectoFinalAP.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Skills implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String progress;
    @Column(nullable = false, updatable = false)
    private String skillsCode;

    public Skills () {}
    public Skills (String name, String progress, String skillsCode) {
        this.name = name;
        this.progress = progress;
        this.skillsCode = skillsCode;
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

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getSkillsCode() {
        return skillsCode;
    }

    public void setSkillsCode(String skillsCode) {
        this.skillsCode = skillsCode;
    }

    @Override
    public String toString () {
        return "Experiencia{" +
                "id='" + id +
                ", name='" + name + '\'' +
                ", name='" + progress + '\'' +
                "}";
    }
}
