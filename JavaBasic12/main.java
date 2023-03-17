package JavaBasic12;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class main {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(" 4649 ", 1592);
        System.out.println(a); 
        BankAccount b = new BankAccount("1234", 5000);
        System.out.println(a.equals(b)); 
        
        b.setAccountNumber("4649");
        System.out.println(a.equals(b));
//                Date todayDate = new Date();
//        
//        
//        
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(todayDate);
//        
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//        calendar.set(Calendar.DAY_OF_MONTH, day + 100);
//        
//        Date resultDate = calendar.getTime();
//        
//        SimpleDateFormat sdf = new SimpleDateFormat("서기 yyyy년 MM월 dd일");
//        String result = sdf.format(resultDate);
//        System.out.println(result);
//    
        }
}
