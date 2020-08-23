/**
 * this class represent a order with date of order. every order belongs to a customer
 */

import java.time.LocalDate;

public class Order {

    private int id;
    private int cus_id;
    private LocalDate date;

    public Order(int id, int cus_id, LocalDate date) {
        this.id = id;
        this.cus_id = cus_id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getCus_id() {
        return cus_id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
