import java.io.*;

public class CountContent {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java CountContent archivo");
            System.exit(1);
        }

        File inputFile = new File(args[0]);
        if (!inputFile.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        FileTools.count(inputFile);
    }
}
