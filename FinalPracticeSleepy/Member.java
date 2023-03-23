package FinalPracticeSleepy;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Member {
    private String joinDate;
    private String name;
    private String address;
    private String phoneNumber;
    private String birthday;
    private int age;
    
    public Member(String joinDate, String name, String address, String phoneNumber, String birthday) {
        this.joinDate = joinDate;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.age = calculateAge(birthday);
    }

    // Getter and Setter methods
    
    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Private method for age calculation

    private int calculateAge(String birthday) {
        // Date format: yyyy/MM/dd
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date birthDate = null;
        try {
            birthDate = sdf.parse(birthday);
        } catch (ParseException e) {
            System.out.println("Error parsing birthday string: " + e.getMessage());
            return -1;
        }
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(birthDate);
        Calendar nowCal = Calendar.getInstance();
        int age = nowCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
        if (nowCal.get(Calendar.DAY_OF_YEAR) < birthCal.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
}
