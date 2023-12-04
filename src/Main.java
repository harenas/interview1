import java.util.List;

public class Main {

        public static void main(String[] args) {
            //MyFactory<?> factory = createUserFactory();
            MyFactory<?> factory = createFileFactory();
            run(factory);
        }

        private static <T> void run(MyFactory<T> factory) {
            DataSource<T> ds = factory.createDataSource();
            List<T> ints = ds.read();
            Sorter<T> s = factory.createSorter();
            s.sort(ints);
            ds.write(ints);
        }

        private static MyFactory<? extends User> createUserFactory() {
            return new UserFactory();
        }

        private static MyFactory<? extends Integer> createFileFactory() {
            return new IntegerFactory();
        }

}