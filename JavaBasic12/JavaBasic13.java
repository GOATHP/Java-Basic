package JavaBasic12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaBasic13 {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("이동학");
        strs.add("박경덕");
        strs.add("강태근");
        strs.add("최유림");
        
        Collections.sort(strs);
        System.out.println(strs);
        
        List<Integer> nums = new ArrayList<>();
        
        nums.add(5);
        nums.add(1);
        nums.add(8);
        nums.add(2);
        Collections.sort(nums);
        System.out.println(nums);
        
        
    }
}
