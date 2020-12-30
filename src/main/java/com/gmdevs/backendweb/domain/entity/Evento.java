package com.gmdevs.backendweb.domain.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    //private Date date;
    private String fecha;
    private String hora;
    /*@ElementCollection // 1
    @CollectionTable(name = "my_list", joinColumns = @JoinColumn(name = "id")) // 2
    @Column(name = "list") // 3
    private List<String> actividadesList;*/

    public Evento() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    /*public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }*/

    /*public List<String> getActividadesList() {
        return actividadesList;
    }

    public void setActividadesList(List<String> actividadesList) {
        this.actividadesList = actividadesList;
    }*/


    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
