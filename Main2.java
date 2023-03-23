import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import FinalAssignment.Member;
import FinalAssignment.MemberList;
import java.io.File;
import java.io.FileNotFoundException;

public class Main2 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        // ArrayList<Member> memberList = new ArrayList<>();
        MemberList memberList = new MemberList();
        ArrayList<Member> members = new ArrayList<>();
        int choice;
        String fileName = "member.csv";
        File file = new File(fileName);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        CSVReaderUser csvReaderUser = new CSVReaderUser();                                

        csvReaderUser.readerCSV();
        ArrayList<String[]> dataRows = csvReaderUser.getDataRows();
      for (String[] dataRow : dataRows) {
          for (String data : dataRow) {
          System.out.print(data + "\t");
          }
        }
    }
}