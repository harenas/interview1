public class UserFactory implements MyFactory<User> {
    @Override
    public Sorter<User> createSorter() {
        return null;
    }

    @Override
    public DataSource<User> createDataSource() {
        return new DataSourceUser() {
        };
    }
}
