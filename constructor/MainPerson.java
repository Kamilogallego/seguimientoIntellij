package constructor;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person("antonio", 29);
        person.setName("carlos");
        System.out.println(person.getName());
    }
}
