import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSourceUser implements DataSource <User>{
    @Override
    public List<User> read() {
        List<User> result = new ArrayList<User>();
        User user1 = new User(1L, "name1");
        User user2 = new User(2L, "name2");
        User user3 = new User(3L, "name3");
        User user4 = new User(4L, "name4");
        User user5 = new User(5L, "name5");

        result.add(user1);
        result.add(user2);
        result.add(user3);
        result.add(user4);
        result.add(user5);
        return result;
    }

    @Override
    public void write(List<User> data) {
        data.stream().forEach(x -> {
            System.out.println(x.getId() + " " + x.getName());
        });
    }
}
