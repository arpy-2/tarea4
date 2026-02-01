package ies.tierno.org.readers;

import ies.tierno.org.models.File;
import ies.tierno.org.models.Text;

import java.util.Scanner;

public class TextReader implements FileReader {
    private Scanner scanner;

    public TextReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public File readFile() {
        System.out.println("Creando archivo de texto");
        System.out.print("Tamaño (bytes): ");
        int size = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ruta: ");
        String path = scanner.nextLine();

        System.out.print("Texto contenido: ");
        String text = scanner.nextLine();

        return new Text(size, path, text);
    }
}