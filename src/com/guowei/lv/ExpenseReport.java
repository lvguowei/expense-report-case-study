package com.guowei.lv;

import java.util.ArrayList;
import java.util.List;

class ExpenseReport {

    private List<Expense> expenses = new ArrayList<>();

    void printReport(ReportPrinter printer) {
        int total = 0;
        int mealExpenses = 0;

        printer.print("Expenses " + getDate() + "\n");

        for (Expense expense : expenses) {
            if (expense.isMeal())
                mealExpenses += expense.getAmount();

            String name = "TILT";
            if (expense instanceof DinnerExpense) {
                name = "Dinner";
            } else if (expense instanceof BreakfastExpense) {
                name = "Breakfast";
            } else if (expense instanceof CarRentalExpense) {
                name = "Car Rental";
            }

            printer.print(String.format("%s\t%s\t$%.02f\n",
                    expense.isOverage() ? "X" : " ",
                    name, expense.getAmount() / 100.0));

            total += expense.getAmount();
        }

        printer.print(String.format("\nMeal expenses $%.02f", mealExpenses / 100.0));
        printer.print(String.format("\nTotal $%.02f", total / 100.0));
    }

    void addExpense(Expense expense) {
        expenses.add(expense);
    }

    private String getDate() {
        return "9/12/2002";
    }

}