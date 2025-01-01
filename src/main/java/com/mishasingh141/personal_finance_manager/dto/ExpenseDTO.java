package com.mishasingh141.personal_finance_manager.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseDTO {

    private Long id;
    private String title;
    private String description;
    private String category;
    private LocalDate date;
    private Integer amount;

}
