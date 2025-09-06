abstract class CartItem {
    abstract double calculateTotalPrice();
}

interface Discountable {
    void applyDiscount(double percentage);
}


class Product implements Discountable {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { 
		return productId; 
	}
    public String getName() { 
		return name; 
	}
    public double getPrice() { 
		return price; 
	}
    public void setPrice(double price) { 
		this.price = price; 
	}

    @Override
    public void applyDiscount(double percentage) {
        double discountedPrice = price - (price * percentage / 100);
        System.out.println("Applying " + percentage + "% discount to " + name);
        this.price = discountedPrice;
    }
}

class Cart extends CartItem {
    private Product[] products; 
    private int count;           

    public Cart(int capacity) {
        products = new Product[capacity];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < products.length) {
            products[count] = p;
            count++;
        } else {
            System.out.println("Cart is full, cannot add more products!");
        }
    }

    @Override
    double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
}

public class OnlineShoppingCartSystem {
    public static void main(String[] args) {
        Product laptop = new Product(1, "Laptop", 50000);
        Product mouse = new Product(2, "Mouse", 500);
        Product keyboard = new Product(3, "Keyboard", 1200);

        Cart cart = new Cart(5);
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        laptop.applyDiscount(10);

        System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
    }
}
