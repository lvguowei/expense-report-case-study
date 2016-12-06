package com.guowei.lv;


abstract class Expense {

    private int amount;

    Expense(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    abstract boolean isOverage();

    abstract boolean isMeal();
}
