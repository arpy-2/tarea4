package ies.tierno.org.readers;

import ies.tierno.org.models.TextFile;
import ies.tierno.org.models.Program;
import java.util.Scanner;

public class ProgramReader {
    private Scanner scanner;

    public ProgramReader() {
        this.scanner = new Scanner(System.in);
    }

    public Program<TextFile> readProgram() {
        System.out.println("Creando programa...");

        System.out.print("Introduce el nombre del programa: ");
        String programName = scanner.nextLine();

        System.out.print("¿Cuántos archivos de texto tendrá? "); // Más claro
        int numFiles = scanner.nextInt();
        scanner.nextLine();

        TextFile[] textFiles = new TextFile[numFiles];
        TextFileReader textReader = new TextFileReader();

        for (int i = 0; i < numFiles; i++) {
            System.out.println("Archivo " + (i + 1) + ":");
            textFiles[i] = (TextFile) textReader.readFile();
        }

        return new Program<>(programName, textFiles);
    }
}