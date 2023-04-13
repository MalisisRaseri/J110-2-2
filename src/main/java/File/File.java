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
        if(name.equals(null)) throw new IllegalArgumentException();
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if(size <= 0) throw new IllegalArgumentException();
        this.size = size;
    }

    static void printAll(File... files) {
        int maxFileNameLen = 0;
        int sizeFileLen = 0;
        ArrayList<ArrayList<String>> result = new ArrayList<>();

        for(File file : files) {
            if (file instanceof DocFile) {
                ArrayList<String> docFile = new ArrayList<>();
                docFile.add(file.getName());
                int size = file.getSize();
                docFile.add(Integer.toString(size));
                docFile.add(((DocFile) file).getFormat() + ", " + ((DocFile) file).getNumberOfPages() + " pages");
                result.add(docFile);
            } else if (file instanceof  StatImageFile) {
                ArrayList<String> statImageFile = new ArrayList<>();
                statImageFile.add(file.getName());
                int size = file.getSize();
                statImageFile.add(Integer.toString(size));
                statImageFile.add(((StatImageFile) file).getFormat() + ", " + ((StatImageFile) file).getWidth() + "x" + ((StatImageFile) file).getHeight());
                result.add(statImageFile);

            } else if (file instanceof  VideoFile) {
                ArrayList<String> videoFile = new ArrayList<>();
                videoFile.add(file.getName());
                int size = file.getSize();
                videoFile.add(Integer.toString(size));
                videoFile.add(((VideoFile) file).getFormat() + ", " + ((VideoFile) file).getDescription() + ", " + ((VideoFile) file).getDurationToString() + ", " + ((VideoFile) file).getWidth() + "x" + ((VideoFile) file).getHeight());
                result.add(videoFile);

            }   else if (file instanceof MultimediaFile) {
                ArrayList<String> multimediaFile = new ArrayList<>();
                multimediaFile.add(file.getName());
                int size = file.getSize();
                multimediaFile.add(Integer.toString(size));
                multimediaFile.add(((MultimediaFile) file).getFormat() + ", " + ((MultimediaFile) file).getDescription() + ", " + ((MultimediaFile) file).getDurationToString());
                result.add(multimediaFile);
            }
            maxFileNameLen = Math.max(maxFileNameLen, file.getName().length());
            sizeFileLen =  Math.max(sizeFileLen, Integer.toString(file.getSize()).length());
        }
        StringBuilder stringBuilder = new StringBuilder();

        //File name           | Size     | Details
        stringBuilder.append("File name").append(" ".repeat(maxFileNameLen - "File name".length())).append("| Size").append(" ".repeat(sizeFileLen - "Size".length())).append("| Details");
        stringBuilder.append("\r\n");

        //--------------------+----------+---------
        stringBuilder.append("-".repeat("File name".length())).append("-".repeat(maxFileNameLen - "File name".length())).append("+-").append("-".repeat("Size".length())).append("-".repeat(sizeFileLen - "Size".length())).append("+-").append("-".repeat("Details".length()));
        stringBuilder.append("\r\n");

        for (ArrayList<String> info : result) {
            stringBuilder.append(info.get(0)).append(" ".repeat(maxFileNameLen - info.get(0).length())).append("| ").append(info.get(1)).append(" ".repeat(sizeFileLen - info.get(1).length())).append("| ").append(info.get(2));
            stringBuilder.append("\r\n");
        }
        System.out.println(stringBuilder);
    }

}
