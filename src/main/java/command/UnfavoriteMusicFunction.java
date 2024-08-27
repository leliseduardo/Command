package command;

public class UnfavoriteMusicFunction implements Function {

    private Music music;

    public UnfavoriteMusicFunction(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        this.music.unfavorite();
    }

    @Override
    public void cancel() {
        this.music.favorite();
    }
}
