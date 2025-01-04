package com.mishasingh141.personal_finance_manager.services.expense;

import com.mishasingh141.personal_finance_manager.dto.ExpenseDTO;
import com.mishasingh141.personal_finance_manager.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense postExpense(ExpenseDTO expenseDTO);
    public List<Expense> getAllExpenses();
}
