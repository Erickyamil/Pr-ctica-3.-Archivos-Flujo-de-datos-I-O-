/* PROBLEMA 1.  Escribe un programa que elimina todas las apariciones 
de una cadena especificada de un archivo de texto. */

import java.io.*;

public class DeleteString {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Uso: java DeleteString cadena archivo");
            System.exit(1);
        }

        String stringToRemove = args[0];
        File inputFile = new File(args[1]);

        if (!inputFile.exists()) {
            System.out.println("El archivo " + inputFile + "no existe.");
            System.exit(1);
        }

        try {
            FileTools.replace(inputFile, stringToRemove); //Llama al método replace de la clase FileTools
        } catch (IOException Leny) {
            System.out.println("Error al procesar el archivo: " + Leny.getMessage());
        }
    }
}
