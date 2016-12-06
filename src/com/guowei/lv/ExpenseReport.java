package com.guowei.lv;

import java.util.ArrayList;
import java.util.List;

class ExpenseReport {

    private List<Expense> expenses = new ArrayList<>();
    private int total;
    private int mealExpenses;

    ExpenseReport() {
        this.total = 0;
        this.mealExpenses = 0;
    }

    void totalUpExpenses() {
        for (Expense expense : expenses) {
            if (expense.isMeal()) {
                mealExpenses += expense.getAmount();
            }
            total += expense.getAmount();
        }
    }

    void addExpense(Expense expense) {
        expenses.add(expense);
    }

    List<Expense> getExpenses() {
        return expenses;
    }

    int getMealExpenses() {
        return mealExpenses;
    }

    int getTotal() {
        return total;
    }
}