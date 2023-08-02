package Task3;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private StreamService streamService;
    private List<Stream> streams;

    public Controller() {
        streamService = new StreamService();
        streams = new ArrayList<>();
    }

    public void addStream(Stream stream) {
        streams.add(stream);
    }

    public void removeStream(Stream stream) {
        streams.remove(stream);
    }

    public void sortStreams() {
        streamService.sortStreams(streams);
    }
}
