package word_count;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String fichier = "texte/Fichier test pour exercice nombre de mots.txt";
        File file = new File(fichier);

        int nbrMots = 0;

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                String[] mots = ligne.split(" ");
                nbrMots += mots.length;
            }

            scanner.close();

            System.out.println("Nombre total de mots : " + nbrMots);

        } catch (FileNotFoundException e) {
            System.err.println("Fichier non trouvé : " + e.getMessage());
        }
    }
}
