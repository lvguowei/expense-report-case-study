package com.guowei.lv;

import java.util.ArrayList;
import java.util.List;

import static com.guowei.lv.Expense.Type.BREAKFAST;
import static com.guowei.lv.Expense.Type.DINNER;


class ExpenseReport {

    private List<Expense> expenses = new ArrayList<>();

    void printReport(ReportPrinter printer) {
        int total = 0;
        int mealExpenses = 0;

        printer.print("Expenses " + getDate() + "\n");

        for (Expense expense : expenses) {
            if (isMeal(expense))
                mealExpenses += expense.amount;

            String name = "TILT";
            switch (expense.type) {
                case DINNER:
                    name = "Dinner";
                    break;
                case BREAKFAST:
                    name = "Breakfast";
                    break;
                case CAR_RENTAL:
                    name = "Car Rental";
                    break;
            }
            printer.print(String.format("%s\t%s\t$%.02f\n",
                    isOverage(expense) ? "X" : " ",
                    name, expense.amount / 100.0));

            total += expense.amount;
        }

        printer.print(String.format("\nMeal expenses $%.02f", mealExpenses / 100.0));
        printer.print(String.format("\nTotal $%.02f", total / 100.0));
    }

    private boolean isOverage(Expense expense) {
        return (expense.type == DINNER && expense.amount > 5000)
                || (expense.type == BREAKFAST && expense.amount > 1000);
    }

    private boolean isMeal(Expense expense) {
        return expense.type == BREAKFAST || expense.type == DINNER;
    }

    void addExpense(Expense expense) {
        expenses.add(expense);
    }

    private String getDate() {
        return "9/12/2002";
    }

}