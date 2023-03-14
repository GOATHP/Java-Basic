package JavaPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        int age = 20;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Map<String, Person> personMap = new HashMap();
        personMap.put("홍길동", new Person("홍길동", 20));
        personMap.put("한석봉", new Person("한석봉", 25));
        
        for (String name : personMap.keySet()) {
            Person person = personMap.get(name);
            System.out.println(name + "의 나이는 " + person.getAge() + "살");
        }
    }
}
