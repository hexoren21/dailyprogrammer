import java.util.Scanner;

public class Liczby {
   void disp(){
       System.out.println("Podaj liczbe");
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       System.out.printf("najmniejsza suma dzielników iczby %d wynoso %d", a, wykonaj(a));
   }
   int wykonaj(int a) {
       int zakres = a / 2, x=0, y=0;
       int suma1= a+1, suma2;
       for (int i=2; i <= zakres; i++) {
           if(a%i == 0) {
               suma2 = a/i + i;
               if(suma1>suma2) {
                   suma1 = suma2;
                   x = i;
                   y = a/i;
               }
           }
       }
       System.out.printf("x = %d i y = %d\n", x, y);
       return suma1;
   }
}

