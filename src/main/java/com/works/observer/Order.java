package com.works.observer;

import lombok.Data;

public class Order {

    private int oid;
    private int amount;

    public Order(int oid, int amount) {
        this.oid = oid;
        this.amount = amount;
    }

    public int getOid() {
        return oid;
    }

    public int getAmount() {
        return amount;
    }
}
