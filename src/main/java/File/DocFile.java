package File;

import org.w3c.dom.ls.LSOutput;

public class DocFile extends File {

    String format;
    int numberOfPages;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if(format.equals(null)) throw new IllegalArgumentException("Format can't be null");
        this.format = format;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages <= 0) throw new IllegalArgumentException("Number can't be null");
        this.numberOfPages = numberOfPages;
    }

    public DocFile(String name, int size, String format, int numberOfPages) {
        super(name, size);
        setFormat(format);
        setNumberOfPages(numberOfPages);

    }

    @Override
    public String toString() {
        return name + "     " +  size + "      " + format + ", " + numberOfPages + " " + "pages";
    }

    public void print(){
        System.out.println(toString());
    }

}
