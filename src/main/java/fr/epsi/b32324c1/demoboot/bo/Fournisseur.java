package fr.epsi.b32324c1.demoboot.bo;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOM")
    private String raisonSociale;

    public Fournisseur() {}

    public Fournisseur(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fournisseur{");
        sb.append("id=").append(id);
        sb.append(", raisonSociale='").append(raisonSociale).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
