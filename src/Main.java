//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println(256*654);
//
//        int birinciSayi = 25;
//        System.out.println(birinciSayi);
//
//        // string referans tiptir. adresleri stackte değerleri heapte tutulur. string pool diye bir alan açılır string için.
//        // string normalda immutable. tekrar değer atasak bile önceki değeri hala heapte tutuyor.
//        // new ile oluşturursak string poolda değil direkt heap içinde tutar.
//
//        String name = "Pelin";
//        System.out.println(name);
//
//        int number1 = 25;
//        int number2 = 45;
//        int toplam = number1+number2;
//        System.out.println(toplam);
//
//        String a = "Java";
//        String b = " Spring Boot";
//        System.out.println(a+b);
//
//        System.out.println("Sonuç:"+toplam);
//
//        String productName = "Elbise";
//        double price = 3100;
//        int adet = 3;
//
//        if (price > 3000) {
//            double discountRate = 0.20;
//            double discountAmount = price*discountRate;
//            double reducedPrice = price - discountAmount;
//
//            System.out.println("İndirimsiz Fiyat: " + price);
//            System.out.println("İndirimli fiyat: " + reducedPrice);
//            System.out.println("İndirim Miktarı: " + discountAmount);
//            System.out.println("İndirim Oranı: " + discountRate);
//        }
//
//        if(price >= 1500 && price <= 3000) {
//            double discountRate2 = 0.10;
//            double reducedPrice2 = price*discountRate2;
//            System.out.println("İndirimli Fiyat: " + reducedPrice2);
//        }
//        System.out.println(permutasyon(5,2));
//        System.out.println(); //ürün adı, kdv'siz fiyatı, kdv'li fiyatı ve indirimli tutar
//    }
        // SECOND DAY
        // iterative

//    public static void dongu(){
//        for(int i = 1; i<=5; i++){
//            System.out.println(i);
//        }
//    }
//
//    public static int faktoriyel(int n){
//        int sonuc = 1; //iterative
//
//        for(int i=1;i<=n;i++){
//            sonuc = sonuc*i;
//        }
//        return sonuc;
//        if(n<=1){
//            return 1;
//        }
//        return n*n-1;
//    }
//
//    public static int permutasyon(int n, int r){
//        int diff = n-r;
//        return faktoriyel(n) / faktoriyel(diff);
//    }
//
//    public static int kombinasyon(int n, int r){
//        return permutasyon(n,r)/faktoriyel(r);
//    }
//
//    // ürün değeri, adet sayısı, adını aldıktan sonra %20 kdv eklenmesi gerekmektedir. ürünün kdvli fiyatı 5000'den fazla ise %10'luk indirim uygulayınız.
//    // ekran çıktısı: ürün adı, kdv'siz fiyatı, kdv'li fiyatı ve indirimli tutar
//
//    static String productName = "Ayakkabı";
//    static int productPrice = 3005;
//    static double KDVRate = 0.20;
//    static double discountRate = 0.10;
//    static int productQuantity = 2;
//    static double orderedProductPriceWithKDV = priceWithKDVCalculation(KDVRate, productQuantity, productPrice);
//    static double productPriceAfterDiscount = applyDiscount(discountRate);
//
//
//    public static int orderPriceCalculation(int productQuantity, int productPrice){
//        return productPrice * productQuantity;
//    }
//    public static double priceWithKDVCalculation(double KDVRate, int productQuantity, int productPrice){
//        return orderPriceCalculation(productQuantity, productPrice)+(orderPriceCalculation(productQuantity, productPrice)*KDVRate);
//    }
//    public static boolean discountCheck(){
//        return orderedProductPriceWithKDV > 5000;
//    }
//    public static double applyDiscount(double discountRate){
//        if(discountCheck()){
//            return orderedProductPriceWithKDV-(orderedProductPriceWithKDV * discountRate);
//        }
//        return orderedProductPriceWithKDV;
//    }

        // OOP

//        User user = new User();
//        user.name = "Pelin";
//        user.email = "fsdlklsdf@gmail.com";
//
//        User newUser = new User();
//        newUser.name = "Yeni isim";
//        newUser.email = "yenimail@gmail.com";
//
//        UserManager userManager = new UserManager();
//        userManager.validation(user);
//        User updatedUser = userManager.update(user, newUser);
//        System.out.println("Kullanıcı güncellendi: "+ newUser);

//        User user2 = new User("User2","Soyad","user2@gmail.com","12345");
//        System.out.println(user2);

        UserRecord userRecord = new UserRecord("Pelin","Kaynarca","kdfjdf@gmail.com","123456");
        UserRecord userRecord1 = new UserRecord("Pelin","Kaynarca","kdfjdf@gmail.com","123456");
        System.out.println(userRecord.equals(userRecord1));
        System.out.println(userRecord == userRecord1); // referans karşılaştırıyor
    }

}