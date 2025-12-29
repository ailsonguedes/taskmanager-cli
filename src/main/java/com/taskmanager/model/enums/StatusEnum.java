package com.taskmanager.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusEnum {
    TO_DO("To Do"),
    WIP("Work In Progress"),
    DONE("Done"),
    CANCELLED("Cancelled");

    private final String currentStatus;
}
