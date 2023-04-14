package File;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public abstract class File {

    String name;
    int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(null)) throw new IllegalArgumentException();
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <= 0) throw new IllegalArgumentException();
        this.size = size;
    }

    public abstract void print();

    static void printAll(File... files) {
        System.out.println(" File name           | Size       | Details");
        System.out.println("--------------------+------------+---------");
        for (File file : files) {
            file.print();
        }

    }
}
