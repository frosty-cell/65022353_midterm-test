public class devicetest {
    public static void main(String[] args) {
        Product c1=new Product();
        c1.setName("chair");
        c1.setPrice(500.0);
        c1.displayProduct();

        System.out.println("******************************");

        Electronics et1=new Electronics();
        et1.setName("Television");
        et1.setPrice(20000.0);
        et1.setBrand("Samsung");
        et1.setModel("Neo QLED");
        et1.displayProduct();
        et1.displayDevice();

        Book b1=new Book();
        b1.setName("OOP Programming");
        b1.setPrice(250.0);
        b1.setAuther("John Doe");
        b1.setPages(300);
        b1.displayProduct();
        b1.displayBook();

        Smartphone smp1=new Smartphone();
        smp1.setName("Iphone");
        smp1.setPrice(40000.0);
        smp1.setBrand("Apple");
        smp1.setModel("Iphone 99");
        smp1.setOperatingSystem("ios");
        smp1.displayProduct();
        smp1.displayDevice();
        
    }
}

class Product {
    private String name;
    private double price;

    Product() {
        name = "No name";
        price = 0.0;
    }

    Product(String NewName, int NewPrice) {
        this.name = NewName;
        this.price = NewPrice;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
    public double getPrice() {
        return price;
    }

    public void displayProduct(){
        System.out.println("Product Name : "+this.name);
        System.out.println("Product Price : "+this.price);
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void displayDevice(){
        System.out.println("Brand : "+this.brand);
        System.out.println("Model : "+this.model);
    }

}

class Smartphone extends Electronics{
    private String operatingsystem;

    public void setOperatingSystem(String brand) {
        this.operatingsystem = operatingsystem;
    }
    public void displayOperatingSystem(){
        System.out.println("OperatingSystem : "+this.operatingsystem);

    }
}

class Book extends Product{
    private String auther;
    private int pages;
    
    public void setAuther(String auther) {
        this.auther = auther;
    }
    public String getAuther() {
        return auther;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public void displayBook(){
        System.out.println("Auther : "+this.auther);
        System.out.println("Number of Pages : "+this.pages);
    }
}
