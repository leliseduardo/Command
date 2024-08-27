package command;

public class Music {

    private String name;
    private String artist;
    private boolean isFavorite;

    public Music(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public boolean isFavorite() {
        return this.isFavorite;
    }

    public void favorite() {
        this.isFavorite = true;
    }

    public void unfavorite() {
        this.isFavorite = false;
    }
}
