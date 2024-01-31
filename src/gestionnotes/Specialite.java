/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnotes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "specialite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Specialite.findAll", query = "SELECT s FROM Specialite s"),
    @NamedQuery(name = "Specialite.findByIdSpecialite", query = "SELECT s FROM Specialite s WHERE s.idSpecialite = :idSpecialite"),
    @NamedQuery(name = "Specialite.findByNomSpecialite", query = "SELECT s FROM Specialite s WHERE s.nomSpecialite = :nomSpecialite")})
public class Specialite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdSpecialite")
    private Integer idSpecialite;
    @Basic(optional = false)
    @Column(name = "NomSpecialite")
    private String nomSpecialite;
    @JoinColumn(name = "Fili\u00e8reId", referencedColumnName = "IdFiliere")
    @ManyToOne(optional = false)
    private Filiere filièreId;

    public Specialite() {
    }

    public Specialite(Integer idSpecialite) {
        this.idSpecialite = idSpecialite;
    }

    public Specialite(Integer idSpecialite, String nomSpecialite) {
        this.idSpecialite = idSpecialite;
        this.nomSpecialite = nomSpecialite;
    }

    public Integer getIdSpecialite() {
        return idSpecialite;
    }

    public void setIdSpecialite(Integer idSpecialite) {
        this.idSpecialite = idSpecialite;
    }

    public String getNomSpecialite() {
        return nomSpecialite;
    }

    public void setNomSpecialite(String nomSpecialite) {
        this.nomSpecialite = nomSpecialite;
    }

    public Filiere getFiliereId() {
        return filièreId;
    }

    public void setFiliereId(Filiere filièreId) {
        this.filièreId = filièreId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSpecialite != null ? idSpecialite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specialite)) {
            return false;
        }
        Specialite other = (Specialite) object;
        if ((this.idSpecialite == null && other.idSpecialite != null) || (this.idSpecialite != null && !this.idSpecialite.equals(other.idSpecialite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gestionnotes.Specialite[ idSpecialite=" + idSpecialite + " ]";
    }
    
}
