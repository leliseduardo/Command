package command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    Player musicPlayer;
    Music music;

    @BeforeEach
    void setUp() {
        musicPlayer = new Player();
        music = new Music("Stairway to Heaven", "Led Zeppelin");
    }

    @Test
    void shouldFavoriteMusic() {
        Function favorite = new FavoriteMusicFunction(music);
        musicPlayer.executeFunction(favorite);
        assertTrue(music.isFavorite());
    }

    @Test
    void shouldUnfavoriteMusic() {
        Function unfavorite = new UnfavoriteMusicFunction(music);
        musicPlayer.executeFunction(unfavorite);
        assertFalse(music.isFavorite());
    }

    @Test
    void shouldCancelUnfavoriteMusic() {
        Function favoriteMusic = new FavoriteMusicFunction(music);
        Function unfavoriteMusic = new UnfavoriteMusicFunction(music);

        musicPlayer.executeFunction(favoriteMusic);
        musicPlayer.executeFunction(unfavoriteMusic);

        musicPlayer.cancelLastFunction();

        assertTrue(music.isFavorite());
    }
}
