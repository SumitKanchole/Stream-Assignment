
import java.io.*;
import java.util.Scanner;

public class Assign5 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        File f = new File("document.txt");
        PrintWriter pw = new PrintWriter("input.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the words for search ");
        String check = sc.nextLine();
        pw.print("my name is pankaj rathore");
        pw.close();

        FileReader fr = new FileReader("input.txt");
        BufferedReader bw = new BufferedReader(fr);
        // System.out.println("Character "+f.length());
        String str = bw.readLine();
        int count = 0;
        while(str != null) {
            String[] arr = str.split(check+" ");
            count += arr.length;
            str = bw.readLine();
        }
        System.out.println("Words : "+(count-1));
    }
}
