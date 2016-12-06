package com.guowei.lv;

class Expense {

    enum Type {DINNER, BREAKFAST, CAR_RENTAL}

    Type type;
    int amount;

    Expense(Type type, int amount) {
        this.type = type;
        this.amount = amount;
    }
}
