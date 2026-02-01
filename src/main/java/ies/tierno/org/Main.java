package ies.tierno.org;

import ies.tierno.org.models.TextFile;
import ies.tierno.org.models.Program;
import ies.tierno.org.readers.ProgramReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de programas instalados y gestion");

        ProgramReader programReader = new ProgramReader();

        Program<TextFile> program = programReader.readProgram();

        System.out.print("Introduce el path de salida: ");
        String outputPath = scanner.nextLine();

        program.execute(outputPath);

        System.out.println("Fin");
    }
}