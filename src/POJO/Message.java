package POJO;

import java.io.Serializable;
import java.util.Map;

public class Message implements Serializable{
    private static final long serialVersionUID = 1L;
    private Order order;
    private Nodification nodification;
    private boolean isAvailable;
    private Object other;

    public Message(Order order, Nodification nodification, boolean isAvailable, Object other) {
        this.order = order;
        this.nodification = nodification;
        this.isAvailable = isAvailable;
        this.other = other;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Object getOther() {
        return other;
    }

    public void setOther(Object other) {
        this.other = other;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Nodification getNodification() {
        return nodification;
    }

    public void setNodification(Nodification nodification) {
        this.nodification = nodification;
    }
}
