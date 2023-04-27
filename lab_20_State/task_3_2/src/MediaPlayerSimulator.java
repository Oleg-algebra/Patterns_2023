import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
Медіаплеєр має наступні особливості роботи:

-- при переключенні музики(prev/next) в режимі Play або Pause наступний/попередній трек відтворюється автоматично;
-- в режимі Stop медіаплеєр ігнорує команди, а реагує лише на команду play;
-- команда Stop припиняє роботу плеєра;
-- пісні зациклені, тобто після останньої пісні йде перша і навпаки;
-- при зупинці плеєра(команда stop) номер треку встановлюється на значення 0 (на початок);
-- решта команд працює без особливостей.

 */
public class MediaPlayerSimulator {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.addTrack("track1");
        mediaPlayer.addTrack("track2");
        mediaPlayer.addTrack("track3");
        mediaPlayer.addTrack("track4");
        mediaPlayer.addTrack("track5");
        mediaPlayer.addTrack("track6");

        Random random = new Random();

        ScheduledExecutorService executor  = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(() ->{
            int operation_type = random.nextInt(5);
            switch (operation_type) {
                case 0 -> mediaPlayer.play();
                case 1 -> mediaPlayer.next();
                case 2 -> mediaPlayer.prev();
                case 3 -> mediaPlayer.pause();
                case 4 -> mediaPlayer.stop();
            }
        },0,1, TimeUnit.SECONDS);

    }
}
