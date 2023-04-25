import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void read() {
        System.out.printf("\n================File: %s====================\n",filePath);
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            onLineRead("END.");
        }
    }


    void onLineRead(String line) {
        System.out.println(line);
        if(line.equals("END.")){
            System.out.println("========Summary========");
        }
        notifySubscribers(line);

    }
    private final List<Subscriber> subscribers = new ArrayList<>();
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(String line){
        for (Subscriber subscriber : subscribers) {
            subscriber.onLineEvent(line);
        }

    }

}
