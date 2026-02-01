package ies.tierno.org.readers;

import ies.tierno.org.models.Text;
import ies.tierno.org.models.Program;
import java.util.Scanner;

public class ProgramReader {
    private Scanner scanner;

    public ProgramReader() {
        this.scanner = new Scanner(System.in);
    }

    public Program<Text> readProgram() {
        System.out.println("Creando programa...");

        System.out.print("Nombre para el programa: ");
        String programName = scanner.nextLine();

        System.out.print("¿Cuántos archivos de texto tendrá? ");
        int numFiles = scanner.nextInt();
        scanner.nextLine();

        Text[] textFiles = new Text[numFiles];
        TextReader textFileReader = new TextReader();

        for (int i = 0; i < numFiles; i++) {
            System.out.println("Archivo " + (i + 1) + ":");
            textFiles[i] = (Text) textFileReader.readFile();
        }

        return new Program<>(programName, textFiles);
    }
}