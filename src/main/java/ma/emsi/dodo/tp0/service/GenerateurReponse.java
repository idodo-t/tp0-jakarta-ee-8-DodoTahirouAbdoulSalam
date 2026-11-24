package ma.emsi.dodo.tp0.service;

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;
import java.util.Locale;

/**
 * Classe de service pour les modificateurs de question.
 * Un modificateur de question prend en entrée une question et retourne
 * la question modifiée.
 */
@Dependent // Portée CDI pour rendre la classe injectable par CDI dans les autres classes.
// Portée Dependent : l'instance sera supprimée quand la classe qui l'a injectée sera supprimée.
public class GenerateurReponse implements Serializable { // Serializable car CDI peut mettre l'instance en mémoire secondaire.
    private boolean roleSystemeAffiche = false;

    /**
     * Génère une réponse à une question.
     * @param question La question à modifier.
     * @param roleSysteme Le rôle système à utiliser pour la modification de la question.
     * @return La question modifiée : le rôle système en majuscule au début de la question, s'il n'est pas null,
     * suivi d'un saut de ligne,
     * puis la question en minuscule, le tout entouré de "||".
     */
    public String genererReponse(String question, String roleSysteme) {
        StringBuilder resultat = new StringBuilder();
        if (!this.roleSystemeAffiche && roleSysteme != null) {
            resultat.append(roleSysteme.toUpperCase(Locale.FRENCH)).append("\n");
            this.roleSystemeAffiche = true;
        }
        String[] mots = question.strip().split("\\s+");
        resultat.append("Nombre de mots : ").append(mots.length).append("\n");
        resultat.append("Longueur de chaque mot : ");
        for (String mot : mots) {
            resultat.append(mot.length()).append(" ");
        }
        return resultat.toString().strip();
    }
}