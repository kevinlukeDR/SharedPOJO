package POJO;

import java.io.Serializable;

public class Nodification implements Serializable {
    public enum Status{
        SUBMIT("Submitting"),
        RECEIVE("Receiving"),
        PREPARE("Preparing"),
        PACKAGE("Packaging"),
        NOTAVAILABLE("NotAvailable"),
        PARTIAL("PartiallyAvailable"),
        DELIVERY("Delivery to front cashier");
        private String status;
        private Status(String status){
            this.status = status;
        }

        public String getStatus() {
            return status;
        }
    }

    private String nodification;

    public Nodification(String nodification) {
        this.nodification = nodification;
    }

    public String getNodification() {
        return nodification;
    }

    public void setNodification(String nodification) {
        this.nodification = nodification;
    }
}
