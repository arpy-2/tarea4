package ies.tierno.org.models;

public class TextFile extends File {
    private String text;

    public TextFile(int size, String path, String text) {
        super(size, path);
        this.text = text;
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Tipo: Archivo texto");
        System.out.println("Contenido: " + text);
        System.out.println("Número generado: " + getRandomNumber(100));
    }

    public String getText() {
        return text;
    }
}