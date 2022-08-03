package Package;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private float avg;
    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setAge (int age) {
        this.age=age;
    }
    public int getAge() {
        return age;
    }
    public void setAvg(float avg) {
        this.avg = avg;
    }
    public float getAvg() {
        return avg;
    }
}

