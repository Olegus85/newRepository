import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOfPersons {
    static List<Person> toKindergartenList = new ArrayList<>();
    static List<Person> toSchoolList = new ArrayList<>();
    static List<Person> toWorkList = new ArrayList<>();

    static void showList(List<Person> list){
        for (Person person: list)
            System.out.println(person);
    }

    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(3,65);
        Person person1 =new Person("Алёна", random.nextInt(3,65));
        Person person2 =new Person("Женя", random.nextInt(3,65));
        Person person3 =new Person("Таня", random.nextInt(3,65));
        Person person4 =new Person("Костя", random.nextInt(3,65));
        Person person5 =new Person("Евгений", random.nextInt(3,65));
        Person person6 = new Person();
        person6.setName("Вася");
        person6.setAge(60);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);

        for(Person person: personList){
            if(person.getAge()<7)
                toKindergartenList.add(person);
            else if(person.getAge()>=7&&person.getAge()<19)
                toSchoolList.add(person);
            else toWorkList.add(person);
        }

        showList(toWorkList);

    }

}
class Person{
    private String name;
    private int age;

    Person(){}
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>0)
            this.age = age;
        else System.out.println("Возраст не может быть отрицательным!!");
    }

    @Override
    public String toString(){
        return getName()+" "+getAge()+" лет";
    }
}
