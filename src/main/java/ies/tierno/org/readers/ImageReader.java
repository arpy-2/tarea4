package ies.tierno.org.readers;

import ies.tierno.org.models.File;
import ies.tierno.org.models.Image;
import java.util.Scanner;

public class ImageReader implements FileReader {
    private Scanner scanner;

    public ImageReader() {
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

        return new Image(size, path, height, width);
    }
}