package ies.tierno.org.models;

public class Program<T extends File> {
    private String name;
    private T[] files;

    public Program(String name, T[] files) {
        this.name = name;
        this.files = files;
    }

    public void execute(String outputPath) {
        System.out.println("Ejecutando: " + name);

        for (T file : files) {
            System.out.println("Procesando...");
            file.open();
            file.move(outputPath);
        }

        System.out.println("Listo");
    }

    public String getName() {
        return name;
    }

    public T[] getFiles() {
        return files;
    }
}