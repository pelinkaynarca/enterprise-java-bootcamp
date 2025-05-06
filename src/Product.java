public class Product {

    private String name;
    private double price;
    private int stock;

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("Price cannot be negative");
            return;
        }
        this.price = price + 2000;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setName(String name){
        this.name = name;
    }


}
