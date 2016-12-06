package com.guowei.lv;

class CarRentalExpense extends Expense {

    CarRentalExpense(int amount) {
        super(amount);
    }

    @Override
    boolean isOverage() {
        return false;
    }

    @Override
    boolean isMeal() {
        return false;
    }
}
