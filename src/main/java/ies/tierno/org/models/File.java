package ies.tierno.org.models;

import java.util.Random;

public class File {
    protected int size;
    protected String path;
    private Random random;

    public File(int size, String path) {
        this.size = size;
        this.path = path;
        this.random = new Random();
    }

    public void open() {
        System.out.println("Archivo en: " + path);
        System.out.println("Tamaño: " + size + " bytes");
    }

    public void move(String newPath) {
        if (newPath.equals(this.path)) {
            System.out.println("No hay cambios");
        } else {
            this.path = newPath;
            System.out.println("El fichero se ha movido a " + newPath);
        }
    }

    public int getSize() {
        return size;
    }

    public String getPath() {
        return path;
    }

    public int getRandomNumber(int max) {
        return random.nextInt(max) + 1;
    }
}