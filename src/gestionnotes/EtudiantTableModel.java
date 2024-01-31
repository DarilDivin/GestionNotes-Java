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
public class EtudiantTableModel extends DefaultTableModel {
    private final List<Etudiant> etudiants;

    // Constructeur
    public EtudiantTableModel(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
        // Ajoutez les colonnes de la table (adaptées à votre modèle Etudiant)
        addColumn("Id");
        addColumn("Nom ");
	addColumn("Prenom ");
	addColumn("Email ");
	addColumn("Sexe ");
	addColumn("Age ");

        // ... Ajoutez d'autres colonnes selon les propriétés de votre classe Etudiant
        loadData();  // Chargez les données initiales dans le modèle
    }

    // Méthode pour charger les données dans le modèle
    private void loadData() {
        for (Etudiant etudiant : etudiants) {
            Object[] rowData = {etudiant.getIdEtudiant(), etudiant.getNomEtudiant(), etudiant.getPrenomEtudiant(), etudiant.getEmailEtudiant(), etudiant.getSexeEtudiant(), etudiant.getAgeEtudiant()};
            // ... Ajoutez d'autres propriétés selon les colonnes que vous avez ajoutées
            addRow(rowData);
        }
    }

    // Méthode pour ajouter un étudiant au modèle
    public void addEtudiant(Etudiant etudiant) {
        Object[] rowData = {etudiant.getIdEtudiant(), etudiant.getNomEtudiant()};
        // ... Ajoutez d'autres propriétés selon les colonnes que vous avez ajoutées
        addRow(rowData);
    }
}