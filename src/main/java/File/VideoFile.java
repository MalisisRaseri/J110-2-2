package File;

public class VideoFile extends MultimediaFile{

    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) throw new IllegalArgumentException("File width can't be null");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0) throw new IllegalArgumentException("File height can't be null");
        this.height = height;
    }

    public VideoFile(String name, int size, String format, String description, int duration, int width, int height) {
        super(name, size, format, description, duration);
        setWidth(width);
        setHeight(height);
    }

    @Override
    public String toString() {
        return name + "  " +  size + "    " + format + ", " + description + ", " + getDurationToString() + " " +  width + "x" + height;
    }

    public void print(){
        System.out.println(toString());
    }

}

