import java.util.List;

public interface DataSource <T> {
    public List<T> read();

    public void write(List<T> data);
}
