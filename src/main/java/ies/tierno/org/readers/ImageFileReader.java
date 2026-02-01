package ies.tierno.org.readers;

import ies.tierno.org.models.File;
import ies.tierno.org.models.ImageFile;
import java.util.Scanner;

public class ImageFileReader implements FileReader {
    private Scanner scanner;

    public ImageFileReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public File readFile() {
        System.out.println("Creando archivo imagen");
        System.out.print("Tamaño (bytes): ");
        int size = scanner.nextInt();

        System.out.print("Altura (px): ");
        int height = scanner.nextInt();

        System.out.print("Anchura (px): ");
        int width = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ruta: ");
        String path = scanner.nextLine();

        return new ImageFile(size, path, height, width);
    }
}