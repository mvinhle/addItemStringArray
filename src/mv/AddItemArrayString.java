package mv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class AddItemArrayString {
    public static void main(String[] args) {
        readFile("D:\\Download\\a.txt");
    }
    
    private static void readFile(String linkFile){
        try {
            File fileDir = new File(linkFile);
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "UTF8"));
            String str;
            while ((str = in.readLine()) != null) {
                if(!str.trim().equals("")){
                    System.out.println("<item>"+str.trim()+"</item>");
                }
                else System.out.println();
            }
            in.close();
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
