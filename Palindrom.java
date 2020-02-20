import java.util.Scanner;

public class Palindrom {
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String string = scan.nextLine();

        scan.close();

        int start = 0, end = string.length()-1;
        boolean result = true;
        do {
            if (string.charAt(start) != string.charAt(end)) result = false;
            start++;
            end--;
        } while (start <= end);

        String res = result ? "Palindrom!" : "Not Palindrom !";
        System.out.println(res);
    }
}
