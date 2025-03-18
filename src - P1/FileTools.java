import java.io.*;

public class FileTools {

    public static void replace (File inputFile, String stringToRemove) throws Exception {
        File tempFile = new File("temp.txt"); //Guarda el contenido del archivo original (InputFile) 
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String linea;
        while ((linea = reader.readLine()) != null) {
            String nuevaLinea = linea.replace(stringToRemove, "");//Reemplaza la cadena
            writer.write(nuevaLinea); //Escribe la nueva línea en el archivo temporal (tempFile)
            writer.newLine(); 
        }
        reader.close();
        writer.close();

        if (inputFile.delete()) { //Elimina el archivo original
            tempFile.renameTo(inputFile);//Renombra el archivo temporal al nombre del archivo original
            System.out.println("Se han eliminado todas las apariciones de la cadena en el archivo.");
        } else {
            System.out.println("Error al procesar el archivo.");
        }
    }
}
