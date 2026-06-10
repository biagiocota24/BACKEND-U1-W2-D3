import datiFissi.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Order {
    private static final LocalDate today = LocalDate.now();
    private static final AtomicLong counter = new AtomicLong(100);
    private long id;
    private OrderStatus status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;


    public Order(OrderStatus status, Customer customer) {
        this.id = counter.getAndIncrement();
        this.status = status;
        this.orderDate = today;
        this.deliveryDate = today.plusDays(5);
        this.products = new ArrayList<>();
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status=" + status +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
