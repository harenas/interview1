import java.util.Collections;
import java.util.List;

public class SorterInteger implements Sorter<Integer>{
    @Override
    public List<Integer> sort(List<Integer> arr) {
        Collections.sort(arr);
        return arr;
    }
}
