package com.mishasingh141.personal_finance_manager.repository;

import com.mishasingh141.personal_finance_manager.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
