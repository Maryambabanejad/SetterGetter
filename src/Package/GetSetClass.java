package Package;

public class GetSetClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Maryam");
        person1.setLastname("BabanejadSarabi");
        person1.setAge(44);
        person1.setAvg(14.72f);
        System.out.println(person1.getName());
        System.out.println(person1.getLastname());
        System.out.println(person1.getAge());
        System.out.println(person1.getAvg());

        Person person2 = new Person();
        person2.setName("Malihe");
        person2.setLastname("BabanejadSarabi");
        person2.setAge(33);
        person2.setAvg(15.25f);
        System.out.println(person2.getName());
        System.out.println(person2.getLastname());
        System.out.println(person2.getAge());
        System.out.println(person2.getAvg());
    }
}
