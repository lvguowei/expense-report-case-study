package com.guowei.lv;

class BreakfastExpense extends Expense {


    BreakfastExpense(int amount) {
        super(amount);
    }

    @Override
    boolean isOverage() {
        return getAmount() > 1000;
    }

    @Override
    boolean isMeal() {
        return true;
    }
}
