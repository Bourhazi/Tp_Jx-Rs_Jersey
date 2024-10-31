package com.emsi.Jersy_Spring.entities;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;

@XmlRootElement
public class ComptesWrapper {
    private List<Compte> comptes;

    public ComptesWrapper() {}

    public ComptesWrapper(List<Compte> comptes) {
        this.comptes = comptes;
    }

    @XmlElement
    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
