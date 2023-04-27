import java.util.ArrayList;
import java.util.List;
/*
Медіаплеєр має наступні особливості роботи:

-- при переключенні музики(prev/next) в режимі Play або Pause наступний/попередній трек відтворюється автоматично;
-- в режимі Stop медіаплеєр ігнорує команди, а реагує лише на команду play;
-- команда Stop припиняє роботу плеєра;
-- пісні зациклені, тобто після останньої пісні йде перша і навпаки;
-- при зупинці плеєра(команда stop) номер треку встановлюється на значення 0 (на початок);
-- решта команд працює без особливостей.

 */
public class MediaPlayer {

    final private List<String> tracks = new ArrayList<>();
    private State state = new StopState();
    private int currentTrackNum = 0;


    public String getCurrentTrack() {
        return tracks.get(currentTrackNum);
    }

    public void setTrackNum(int trackNum) {
        if (trackNum < 0){
            currentTrackNum = tracks.size() - 1;
        } else if (trackNum >= tracks.size()) {
            currentTrackNum = 0;
        }else{
            currentTrackNum = trackNum;
        }
    }

    public int getCurrentTrackNum() {
        return currentTrackNum;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }

    public void stop() {
        state.stop(this);
    }

}
