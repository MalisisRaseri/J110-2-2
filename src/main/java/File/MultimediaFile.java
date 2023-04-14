package File;

import static File.Duration.timeToString;

public class MultimediaFile extends File{
    String format;
    String description;
    int duration;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if(format.equals(null)) throw new IllegalArgumentException("The format can't be null");
        this.format = format;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description.equals(null)) throw new IllegalArgumentException();
        this.description = description;
    }

    public int getDuration() {
        return duration ;
    }

    public void setDuration(int duration) {
        if(duration <= 0) throw new IllegalArgumentException("The duration can't be null");

        this.duration = duration;
    }

    public MultimediaFile(String name, int size, String format, String description, int secs) {
        super(name, size);
        setFormat(format);
        setDescription(description);
        setDuration(secs);
    }


    public String getDurationToString() {
        return timeToString (getDuration());
    }


    @Override
    public String toString() {
        return name + "      " +  size + "      " + format + ", " + description + ", " + getDurationToString();

    }

    public void print(){
        System.out.println(toString());
    }


}
