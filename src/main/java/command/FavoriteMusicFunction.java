package command;

public class FavoriteMusicFunction implements Function {

    private Music music;

    public FavoriteMusicFunction(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        this.music.favorite();
    }

    @Override
    public void cancel() {
        this.music.unfavorite();
    }
}
