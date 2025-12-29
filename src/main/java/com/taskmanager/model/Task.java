package com.taskmanager.model;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import com.taskmanager.model.enums.StatusEnum;

public class Task {
    @Getter
    private Long id;

    @Getter @Setter
    private String title;

    @Getter @Setter
    private String description;

    @Getter @Setter
    private LocalDate dueDate;

    @Getter @Setter
    private StatusEnum status;

    // Construtor SEM o parâmetro id
    public Task(String title, String description, LocalDate dueDate, StatusEnum status) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = StatusEnum.TO_DO;  
    }

    // Método para setar o ID (será chamado pelo TaskManager)
    public void setId(Long id) {
        if (this.id == null) {
            this.id = id;
        }
    }
}
