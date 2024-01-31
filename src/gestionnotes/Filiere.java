/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnotes;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "filiere")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Filiere.findAll", query = "SELECT f FROM Filiere f"),
    @NamedQuery(name = "Filiere.findByIdFiliere", query = "SELECT f FROM Filiere f WHERE f.idFiliere = :idFiliere"),
    @NamedQuery(name = "Filiere.findByNomFiliere", query = "SELECT f FROM Filiere f WHERE f.nomFiliere = :nomFiliere")})
public class Filiere implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fili\u00e8reId")
    private Collection<Specialite> specialiteCollection;
    @OneToMany(mappedBy = "filiereId")
    private Collection<Etudiant> etudiantCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdFiliere")
    private Integer idFiliere;
    @Basic(optional = false)
    @Column(name = "NomFiliere")
    private String nomFiliere;
    @JoinColumn(name = "IdDepart", referencedColumnName = "IdDepartement")
    @ManyToOne
    private Departement idDepart;

    public Filiere() {
    }

    public Filiere(Integer idFiliere) {
        this.idFiliere = idFiliere;
    }

    public Filiere(Integer idFiliere, String nomFiliere) {
        this.idFiliere = idFiliere;
        this.nomFiliere = nomFiliere;
    }

    public Integer getIdFiliere() {
        return idFiliere;
    }

    public void setIdFiliere(Integer idFiliere) {
        this.idFiliere = idFiliere;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public Departement getIdDepart() {
        return idDepart;
    }

    public void setIdDepart(Departement idDepart) {
        this.idDepart = idDepart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFiliere != null ? idFiliere.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Filiere)) {
            return false;
        }
        Filiere other = (Filiere) object;
        if ((this.idFiliere == null && other.idFiliere != null) || (this.idFiliere != null && !this.idFiliere.equals(other.idFiliere))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestionnotes.Filiere[ idFiliere=" + idFiliere + " ]";
    }

    @XmlTransient
    public Collection<Specialite> getSpecialiteCollection() {
        return specialiteCollection;
    }

    public void setSpecialiteCollection(Collection<Specialite> specialiteCollection) {
        this.specialiteCollection = specialiteCollection;
    }

    @XmlTransient
    public Collection<Etudiant> getEtudiantCollection() {
        return etudiantCollection;
    }

    public void setEtudiantCollection(Collection<Etudiant> etudiantCollection) {
        this.etudiantCollection = etudiantCollection;
    }
    
}
