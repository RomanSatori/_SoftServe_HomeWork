package HW3;

public class PR4 {
    public static class Product{
        String name;
        double price;
        int quantity;

        public Product(String name, int price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }


        void displayInfo(){
            System.out.printf("Name: %s \t price: %s \t quantity: %d\n", name, price, quantity);
        }
    }

    public static void main (String[] args){
        Product product1 = new Product("Cup", 20, 3);
        product1.displayInfo();
        Product product2 = new Product("Pan", 80, 6);
        product2.displayInfo();
        Product product3 = new Product("kettle", 30, 30);
        product3.displayInfo();
        Product product4 = new Product("pencil", 10, 20);
        product4.displayInfo();

        if (product1.price > product2.price && product1.price > product3.price && product1.price > product4.price){
            System.out.println("Product "+product1.name+" is most expensive item. Quantity: "+product1.quantity);
        }
        else if (product2.price > product1.price && product2.price > product3.price && product2.price > product4.price){
            System.out.println("Product "+product2.name+" is most expensive item. Quantity: "+product2.quantity);
        }
        else if (product3.price > product1.price && product3.price > product2.price && product3.price > product4.price){
            System.out.println("Product "+product3.name+" is most expensive item. Quantity: "+product3.quantity);
        }
        else {
            System.out.println("Product "+product4.name+" is most expensive item. Quantity: "+product4.quantity);
        }


        if (product1.quantity > product2.quantity && product1.quantity > product3.quantity && product1.quantity > product4.quantity){
            System.out.println("Product "+product1.name+" is most quantity");
        }
        else if (product2.quantity > product1.quantity && product2.quantity > product3.quantity && product2.quantity > product4.quantity){
            System.out.println("Product "+product2.name+" is most quantity");
        }
        else if (product3.quantity > product1.quantity && product3.quantity > product2.quantity && product3.quantity > product4.quantity){
            System.out.println("Product "+product3.name+" is most quantity");
        }
        else {
            System.out.println("Product "+product4.name+" is most quantity");
        }
    }
}
