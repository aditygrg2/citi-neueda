package com.glzd.expenseTrackerApp.business.exceptions;

public class ExpenseTypeAlreadyExistsException extends Exception {
    public ExpenseTypeAlreadyExistsException(String message) {
        super(message);
    }
}
