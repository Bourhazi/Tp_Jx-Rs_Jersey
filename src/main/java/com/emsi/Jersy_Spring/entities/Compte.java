package com.emsi.Jersy_Spring.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double solde;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Enumerated(EnumType.STRING)
    private TypeCompte type;
    @XmlElement
    public Long getId() {
        return id;
    }

    @XmlElement
    public double getSolde() {
        return solde;
    }

    @XmlElement
    public Date getDateCreation() {
        return dateCreation;
    }

    @XmlElement
    public TypeCompte getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }
}
