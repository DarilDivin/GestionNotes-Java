/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnotes;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "promotion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Promotion.findAll", query = "SELECT p FROM Promotion p"),
    @NamedQuery(name = "Promotion.findByIdPromotion", query = "SELECT p FROM Promotion p WHERE p.idPromotion = :idPromotion"),
    @NamedQuery(name = "Promotion.findByAnnee", query = "SELECT p FROM Promotion p WHERE p.annee = :annee")})
public class Promotion implements Serializable {

    @Column(name = "Annee")
    private String annee;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdPromotion")
    private Integer idPromotion;
    @OneToMany(mappedBy = "promotionId")
    private Collection<Etudiant> etudiantCollection;

    public Promotion() {
    }

    public Promotion(Integer idPromotion) {
        this.idPromotion = idPromotion;
    }

    public Integer getIdPromotion() {
        return idPromotion;
    }

    public void setIdPromotion(Integer idPromotion) {
        this.idPromotion = idPromotion;
    }


    @XmlTransient
    public Collection<Etudiant> getEtudiantCollection() {
        return etudiantCollection;
    }

    public void setEtudiantCollection(Collection<Etudiant> etudiantCollection) {
        this.etudiantCollection = etudiantCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPromotion != null ? idPromotion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Promotion)) {
            return false;
        }
        Promotion other = (Promotion) object;
        if ((this.idPromotion == null && other.idPromotion != null) || (this.idPromotion != null && !this.idPromotion.equals(other.idPromotion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestionnotes.Promotion[ idPromotion=" + idPromotion + " ]";
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }
    
}
