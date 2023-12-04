public interface MyFactory<T> {

    public Sorter<T> createSorter();

    public DataSource<T> createDataSource();
}