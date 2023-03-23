
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CSVReaderUser {
    private String line = "";
    private String csvSplitBy = ",";
    String fileName = "member.csv";
    File file = new File(fileName);
    private ArrayList<String[]> dataRows = new ArrayList<String[]>();
    public ArrayList<String[]> getDataRows() {
        return dataRows;
    }

    public void setDataRows(ArrayList<String[]> dataRows) {
        this.dataRows = dataRows;
    }

    public String[] getHeaders() {
        return headers;
    }

    public void setHeaders(String[] headers) {
        this.headers = headers;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    private String[] headers = {"ID","성별","이름","나이","생년월일","가입일자","연락처","주소"};
    
    public void readerCSV() {
            
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("member.csv"), "UTF-8"))) {
                headers = br.readLine().split(csvSplitBy);
    
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(csvSplitBy);
                    dataRows.add(data);
                }
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}