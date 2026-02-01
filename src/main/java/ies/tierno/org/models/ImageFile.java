package ies.tierno.org.models;

public class ImageFile extends File {
    private int height;
    private int width;

    public ImageFile(int size, String path, int height, int width) {
        super(size, path);
        this.height = height;
        this.width = width;
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Tipo: Archivo imagen"); // Quité (png, jpg...)
        System.out.println("Altura: " + height + " px");
        System.out.println("Anchura: " + width + " px");
        System.out.println("Número generado: " + getRandomNumber(200));
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}