package com.mishasingh141.personal_finance_manager.services.expense;

import com.mishasingh141.personal_finance_manager.dto.ExpenseDTO;
import com.mishasingh141.personal_finance_manager.entity.Expense;
import com.mishasingh141.personal_finance_manager.repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService{

    private final ExpenseRepository expenseRepository;

    public Expense postExpense(ExpenseDTO expenseDTO){
        return saveOrUpdateExpense(new Expense(),expenseDTO);
    }

    private Expense saveOrUpdateExpense(Expense expense, ExpenseDTO expenseDTO){
        expense.setTitle(expenseDTO.getTitle());
        expense.setDate(expenseDTO.getDate());
        expense.setAmount(expenseDTO.getAmount());
        expense.setCategory(expenseDTO.getCategory());
        expense.setDescription(expenseDTO.getDescription());

        return expenseRepository.save(expense);
    }

}
