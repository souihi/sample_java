package org.example;

import java.time.LocalDate;

public class Dates {

    public Dates(){}
    public static boolean isDateValid(String date) {
        // Vérifier si le nombre de tirets est égal à 2
        if (countOccurrences(date, '-') != 2)
            return false;

        // Diviser la chaîne en sous-chaînes par le tiret
        String[] parts = date.split("-");

        // Vérifier que chaque élément entre les tirets est numérique
        for (String part : parts) {
            if (!part.matches("\\d+"))
                return false;
        }

        // Convertir les parties de la date en entiers
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Vérifier si le mois est compris entre 1 et 12
        if (month < 1 || month > 12)
            return false;

        // Vérifier si l'année est comprise entre 2000 et l'année actuelle
        int currentYear = LocalDate.now().getYear();
        if (year < 2000 || year > currentYear)
            return false;

        // Vérifier si le jour est valide pour le mois donné
        try {
            LocalDate.of(year, month, day);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    // Méthode utilitaire pour compter le nombre d'occurrences d'un caractère dans une chaîne
    private static int countOccurrences(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }
}
