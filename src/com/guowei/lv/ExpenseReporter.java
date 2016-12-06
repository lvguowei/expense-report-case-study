package com.guowei.lv;

public class ExpenseReporter {
    private ReportPrinter printer;
    private ExpenseReport report;
    private ExpenseNamer namer = new ExpenseReportNamer();

    public ExpenseReporter(ExpenseReport expenseReport) {
        this.report = expenseReport;
    }

    public void printReport(ReportPrinter printer) {
        this.printer = printer;
        report.totalUpExpenses();
        printExpensesAndTotals();
    }

    private void printExpensesAndTotals() {
        printHeader();
        printExpenses();
        printTotals();
    }

    private void printTotals() {
        printer.print(String.format("\nMeal expenses $%.02f", penniesToDollars(report.getMealExpenses())));
        printer.print(String.format("\nTotal $%.02f", penniesToDollars(report.getTotal())));
    }

    private void printExpenses() {
        report.getExpenses().forEach(this::printExpense);
    }

    private void printExpense(Expense expense) {
        printer.print(String.format("%s\t%s\t$%.02f\n",
                expense.isOverage() ? "X" : " ",
                namer.getName(expense), penniesToDollars(expense.getAmount())));
    }

    private double penniesToDollars(int pennies) {
        return pennies / 100.0;
    }

    private void printHeader() {
        printer.print("Expenses " + getDate() + "\n");
    }

    private String getDate() {
        return "9/12/2002";
    }
}
