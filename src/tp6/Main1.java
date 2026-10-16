package tp6;

public class Main1 {
	
	public static void main(String[] args) {
        MediaLibrary lib = new MediaLibrary();

        lib.add(new Audio("Podcast Java", 1800));
        lib.add(new Video("Tutoriel UML", 500, "1080p"));
        lib.add(new LiveStream("Concert en direct",
                               "http://live.exemple.com"));
        lib.add(new Audio("Musique Classique", 1400));

        lib.playAll();
        System.out.println();
        System.out.println("Durée totale (sec) : "
            + lib.totalDuration());
    }

}
