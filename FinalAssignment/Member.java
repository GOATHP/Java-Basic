package FinalAssignment;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Member {
    private String name;
    public String gender;
    private LocalDate joinDate; 
    private LocalDate birthDay;
    private String address;
    private int age; //생일 기반
    private String contact;
    private int id;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Member(int id, String name, String gender, LocalDate birthDay, LocalDate joinDate, String contact, String address) {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        LocalDate birthDayy = LocalDate.parse(birthDay, formatter);
//        Period period = Period.between(birthDayy, LocalDate.now());
//        
        this.id = id++;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birthDay = birthDay;
        this.contact = contact;
        this.joinDate = joinDate;
        this.address = address;
        
    }
    


    @Override
    public String toString() {
        return "User(name=" + name + ", joinDate=" + joinDate + ", id=" + id + ", gender=" + gender + ", contact=" + contact  + ", address=" + address + ")";
         
    }
    
    public int getAge() {
        LocalDate now = LocalDate.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Period period = Period.between(birthDay, now);
        return period.getYears();
    }

    
    public static void main(String[] args) {
        
        String dataOfBirth = "2020-02-01";
        LocalDate date = LocalDate.parse(dataOfBirth);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        LocalDate birthDay = LocalDate.parse(date,formatter);
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

    }
}
