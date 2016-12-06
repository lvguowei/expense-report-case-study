package com.guowei.lv;

import static com.guowei.lv.Expense.Type.BREAKFAST;
import static com.guowei.lv.Expense.Type.DINNER;

class Expense {

    enum Type {DINNER, BREAKFAST, CAR_RENTAL}

    Type type;
    int amount;

    Expense(Type type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    boolean isOverage() {
        return (type == DINNER && amount > 5000)
                || (type == BREAKFAST && amount > 1000);
    }

    boolean isMeal() {
        return type == BREAKFAST || type == DINNER;
    }
}
