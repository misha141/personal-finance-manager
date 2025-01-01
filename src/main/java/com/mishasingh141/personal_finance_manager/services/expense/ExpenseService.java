package com.mishasingh141.personal_finance_manager.services.expense;

import com.mishasingh141.personal_finance_manager.dto.ExpenseDTO;
import com.mishasingh141.personal_finance_manager.entity.Expense;

public interface ExpenseService {
    Expense postExpense(ExpenseDTO expenseDTO);
}
