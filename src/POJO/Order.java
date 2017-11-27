package POJO;

import java.io.Serializable;
import java.util.Map;

public class Order implements Serializable {
    private static final long serialVersionUID = 1231241L;
    private int orderId;
    private int customerId;
    private String customerName;
    private Map<String, Integer> foods;

    public Order(int orderId, int customerId, String customerName, Map<String, Integer> foods) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.customerName = customerName;
        this.foods = foods;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Map<String, Integer> getFoods() {
        return foods;
    }

    public void setFoods(Map<String, Integer> foods) {
        this.foods = foods;
    }
}
