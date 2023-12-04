public class IntegerFactory implements MyFactory<Integer> {

    @Override
    public Sorter<Integer> createSorter() {
        return new SorterInteger();
    }

    @Override
    public DataSource<Integer> createDataSource() {
        return new DataSourceInteger();
    }
}
