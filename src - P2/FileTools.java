import java.io.*;

public class FileTools {

    public static void count(File file) {
        try (BufferedReader input = new BufferedReader(new FileReader(file))) {
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;
            while ((line = input.readLine()) != null) {
                lineCount++; //cada vez que se lee una línea se incrementa el contador
                charCount += line.length(); //se suma la longitud de la línea anterior el contador 
                String[] words = line.trim().split("\\s+"); //se dividen las palabras de la línea
                if (!line.trim().isEmpty()) {  //si la línea no está vacía
                    wordCount += words.length; //se incrementa el contador de palabras
                }
            }

            System.out.println("\nEl archivo tiene:");
            System.out.println(charCount + " caracteres");
            System.out.println(wordCount + " palabras");
            System.out.println(lineCount + " líneas");

        } catch (IOException Leny) {
            System.out.println("Error al procesar el archivo: " + Leny.getMessage());
        }
    }
}
