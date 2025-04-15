//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(256*654);

        int birinciSayi = 25;
        System.out.println(birinciSayi);

        // string referans tiptir. adresleri stackte değerleri heapte tutulur. string pool diye bir alan açılır string için.
        // string normalda immutable. tekrar değer atasak bile önceki değeri hala heapte tutuyor.
        // new ile oluşturursak string poolda değil direkt heap içinde tutar.

        String name = "Pelin";
        System.out.println(name);

        int number1 = 25;
        int number2 = 45;
        int toplam = number1+number2;
        System.out.println(toplam);

        String a = "Java";
        String b = " Spring Boot";
        System.out.println(a+b);

        System.out.println("Sonuç:"+toplam);
    }
}