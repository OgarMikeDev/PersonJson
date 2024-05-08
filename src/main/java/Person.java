import java.util.List;

public class Person {
    private String name;
    private int age;
    private boolean isMarried;
    public static List<String> hobbies;
    private List<String> children;
    private Car car;
    private Job job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getChildren() {
        return children;
    }

    public void setChildren(List<String> children) {
        this.children = children;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Name \"" + name + "\"" +
                "\nAge \"" + age + "\"" +
                "\nisMarried \"" + isMarried + "\"" +
                "\nHobbies \"" + hobbies + "\"" +
                "\nChildren \"" + children + "\"" +
                "\nCar: " + car +
                "\nJob: " + job;
    }
}
