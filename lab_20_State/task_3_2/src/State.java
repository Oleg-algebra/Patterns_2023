public interface State {
    void play(MediaPlayer mediaPlayer);
    void pause(MediaPlayer mediaPlayer);
    void next(MediaPlayer mediaPlayer);
    void prev(MediaPlayer mediaPlayer);
    void stop(MediaPlayer mediaPlayer);
}
