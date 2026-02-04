class Product implements Cloneable{
    int id;
    String name;
    Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Must override clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloneTest{
    public static void main(String[] args) throws Exception{
        Product p1 = new Product(101, "Laptop");
        Product p2 = (Product) p1.clone();
        System.out.println("Original: " + p1.name);
        System.out.println("Cloned: " + p2.name);
    }
}
