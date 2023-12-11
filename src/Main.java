import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("3 tane sayi girin");
        System.out.println("1.sayiyi girin: ");
        a= sc.nextInt();
        System.out.println("2.sayiyi girin: ");
        b= sc.nextInt();
        System.out.println("3.sayiyi girin: ");
        c= sc.nextInt();
        System.out.println(a+b*c-b);

    }
}