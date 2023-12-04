import java.util.List;

import static java.util.Arrays.asList;

public class DataSourceInteger implements DataSource<Integer> {
    public List<Integer> read() {
        return asList(1, 5, 3, 4, 2);
    }


    public void write(List<Integer> data) {
        data.stream().forEach(x -> {
            System.out.println(x);
        });
    };


}
