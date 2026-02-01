package ies.tierno.org.readers;

import ies.tierno.org.models.AudioFile;
import ies.tierno.org.models.File;

import java.util.Scanner;

public class AudioFileReader implements FileReader {
    private Scanner scanner;

    public AudioFileReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public File readFile() {
        System.out.println("Creando archivo audio");
        System.out.print("Tamaño (bytes): ");

        int size = scanner.nextInt();

        System.out.print("Duración (segundos): ");
        int duration = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ruta: ");
        String path = scanner.nextLine();

        return new AudioFile(size, path, duration);
    }
}