public class SubUser extends User {
    private int age;

    public SubUser() {
    }

    public SubUser(Long id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + " -- SubUser [age=" + age + "]";
    }
}
