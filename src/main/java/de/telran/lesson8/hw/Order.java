package de.telran.lesson8.hw;

import java.util.Objects;

public class Order {
    Integer tableNum;
    String nameWaiter;

    public Order(Integer tableNum, String nameWaiter) {
        this.tableNum = tableNum;
        this.nameWaiter = nameWaiter;
    }

    public Integer getTableNum() {
        return tableNum;
    }

    public void setTableNum(Integer tableNum) {
        this.tableNum = tableNum;
    }

    public String getNameWaiter() {
        return nameWaiter;
    }

    public void setNameWaiter(String nameWaiter) {
        this.nameWaiter = nameWaiter;
    }

    @Override
    public String toString() {
        return "Order{" +
                "tableNum=" + tableNum +
                ", nameWaiter='" + nameWaiter + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(tableNum, order.tableNum) && Objects.equals(nameWaiter, order.nameWaiter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableNum, nameWaiter);
    }
}
