package ies.tierno.org.models;

public class Audio extends File {
    private int duration;

    public Audio(int size, String path, int duration) {
        super(size, path);
        this.duration = duration;
    }

    @Override
    public void open() {
        super.open();
        System.out.println("Tipo: Archivo audio");
        System.out.println("Duración: " + duration + " segundos"); // Quité (seg)
        System.out.println("Número generado: " + getRandomNumber(300));
    }

    public int getDuration() {
        return duration;
    }
}