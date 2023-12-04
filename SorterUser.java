import java.util.*;

public class SorterUser implements Sorter<User> {
    @Override
    public List<User> sort(List<User> arr) {
        Map<Long, User> hashMap = new HashMap<Long, User>();
        List<Long> idx = new ArrayList<Long>();
        arr.stream().forEach(user -> {
            idx.add(user.getId());
            hashMap.put(user.getId(), user);
        });
        Collections.sort(idx);
        arr.clear();
        idx.stream().forEach(id->{
            arr.add(hashMap.get(id));
        });
        return arr;
    }
}
