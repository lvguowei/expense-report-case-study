package com.guowei.lv;

class DinnerExpense extends Expense {

    DinnerExpense(int amount) {
        super(amount);
    }

    @Override
    boolean isOverage() {
        return getAmount() > 5000;
    }

    @Override
    boolean isMeal() {
        return true;
    }
}
