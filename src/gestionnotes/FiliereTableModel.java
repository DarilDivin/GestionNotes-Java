/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionnotes;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FiliereTableModel extends DefaultTableModel {
    private final List<Filiere> filieres;

    // Constructeur
    public FiliereTableModel(List<Filiere> filieres) {
        this.filieres = filieres;
        // Ajoutez les colonnes de la table (adaptées à votre modèle Etudiant)
        addColumn("ID");
        addColumn("Nom de Filiere");

        // ... Ajoutez d'autres colonnes selon les propriétés de votre classe Etudiant
        loadData();  // Chargez les données initiales dans le modèle
    }

    // Méthode pour charger les données dans le modèle
    private void loadData() {
        for (Filiere filiere : filieres) {
            Object[] rowData = {filiere.getIdFiliere(), filiere.getNomFiliere()};
            // ... Ajoutez d'autres propriétés selon les colonnes que vous avez ajoutées
            addRow(rowData);
        }
    }

    // Méthode pour ajouter un étudiant au modèle
    public void addFiliere(Filiere filiere) {
        Object[] rowData = {filiere.getIdFiliere(), filiere.getNomFiliere()};
        // ... Ajoutez d'autres propriétés selon les colonnes que vous avez ajoutées
        addRow(rowData);
    }
}
