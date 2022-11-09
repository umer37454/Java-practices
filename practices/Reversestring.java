package practices.practices;

class string{
    String s ;

    public string(String s) {
        this.s = s;
    }

    void reversingstring(String c){
        int size = c.length();
        System.out.println("The length of your string is: " + size);

        System.out.print("Reverse string is: ");
        for (int i = 1; i <= size; i++){
            System.out.print(c.charAt(size - i));
        }
    }
}

public class Reversestring {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter string: ");
        String a = input.nextLine();

        string obj = new string(a);
        obj.reversingstring(a);

    }
}
