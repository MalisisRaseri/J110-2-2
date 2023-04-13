package File;

public class StatImageFile extends File{
    String format;
    int width;
    int height;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if(format.equals(null)) throw new IllegalArgumentException();
        this.format = format;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if( width <= 0) throw new IllegalArgumentException("File width can't be null");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height <= 0) throw new IllegalArgumentException("File height can't be null");
        this.height = height;
    }

    public StatImageFile(String name, int size, String format, int width, int height) {
        super(name, size);
        setFormat(format);
        setWidth(width);
        setHeight(height);
    }


}
