package JavaApply;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class main {
    public static void main(String[] args) {

        // 연습 문제 2-2
        Person personHong = new Person("홍길동");
        Person personHan = new Person("한석봉");


        ArrayList<Person> peopleList = new ArrayList();

        // ArrayList 요소 삽입 add
        peopleList.add(personHan);
        peopleList.add(personHong);

        // ArrayList 요소 탐색 1
        for (Person person : peopleList) {
            System.out.println(person.getName());
        }
        // ArrayList 요소 탐색 2
        for (int i = 0; i < peopleList.size(); i++) {
            System.out.println(peopleList.get(i).getName());
        }
    }

        // 연습 문제 2-3

        // Map 요소 삽입 put
//        Person personHong = new Person("홍길동",20);
//        Person personHan = new Person("한석봉",25);
//        
//        ArrayList<Person> ageList = new ArrayList();
//        
//        ageList.add(personHong.getAge());
//        ageList.add(personHan.getAge());
//        
//        
//        Map<String, Integer> peopleMap = new HashMap();
//
//        
//        for (int i = 0; i < ageList.size(); i++) {
//            System.out.println(peopleList.get(i).getName() + ageList.get(i).getAge());
//            
        

//        for (String key : peopleMap.keySet()) {
//            int value = peopleMap.get(key);
//            System.out.println(key + "의 나이는 " + value + "살");
//        }
        
    
    
    }
