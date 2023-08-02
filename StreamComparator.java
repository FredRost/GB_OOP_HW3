package Task3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream stream1, Stream stream2) {
        return Integer.compare(getGroupCount(stream1), getGroupCount(stream2));
    }
    
    @SuppressWarnings("unused")
    private int getGroupCount(Stream stream) {
        int count = 0;
        for (EducationalGroup group : stream) {
            count++;
        }
        return count;
    }
}
