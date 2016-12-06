package com.guowei.lv;

class ExpenseReportNamer implements ExpenseNamer {

    @Override
    public String getName(Expense expense) {
        String name;
        if (expense instanceof DinnerExpense) {
            name = "Dinner";
        } else if (expense instanceof BreakfastExpense) {
            name = "Breakfast";
        } else if (expense instanceof CarRentalExpense) {
            name = "Car Rental";
        } else {
            name = "TILT";
        }
        return name;
    }
}
