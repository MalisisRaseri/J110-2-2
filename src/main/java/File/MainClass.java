package File;

import static File.File.printAll;

public class MainClass {
    public static void main(String[] args) {

        File fileDoc = new DocFile("j110-lab2-hiers.docx", 23212, "docx", 2);
        File map = new StatImageFile("spb-map.png", 1703527, "image", 1024,3072 );
        File multimedia = new MultimediaFile("06-PrettyGirl.mp3", 7893454,"audio", "Eric Clapton. Pretty Girl", 328);
        File video = new VideoFile("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985", 6488 ,  640, 352);


       File[] files = {fileDoc, map, multimedia, video};

       printAll(files);
       printAll(fileDoc);
       printAll(video);


        /*
        File name           | Size     | Details
        --------------------+----------+---------
        j110-lab2-hiers.docx| 23212    |docx, 2 pages
        spb-map.png         | 1703527  |image, 1024x3072
        06-PrettyGirl.mp3   | 7893454  |audio, Eric Clapton, Pretty Girl, 05:28
        BackToTheFuture1.avi|1470984192|video, Back to the future I, 1985, 01:48:08, 640x352
         */
    }


}
