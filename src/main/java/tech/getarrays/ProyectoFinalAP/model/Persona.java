package tech.getarrays.ProyectoFinalAP.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String personaCode;

    public Persona () {}
    public Persona (String name, String email, String jobTitle, String phone, String imageUrl, String personaCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.personaCode = personaCode;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getEmail () {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    public String getJobTitle () {
        return jobTitle;
    }
    public void setJobTitle (String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPersonaCode() {
        return personaCode;
    }

    public void setPersonaCode(String personaCode) {
        this.personaCode = personaCode;
    }

    @Override
    public String toString () {
        return "Persona{" +
                "id='" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle +'\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                "}";
    }
}
