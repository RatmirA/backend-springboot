package com.example.tasklist.backendspringboot.entity;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Date;

@Entity
@NoArgsConstructor
@Setter
@EqualsAndHashCode
@Table(name = "task", schema = "public", catalog = "postgres")
public class Task {
    private Integer id;
    private String title;
    private Integer completed;
    private Date date;
    private Long priorityId;
    private Long categoryId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Basic
    @Column(name = "completed")
    public Integer getCompleted() {
        return completed;
    }

    @Basic
    @Column(name = "date")
    public Date getDate() {
        return date;
    }

    @Basic
    @Column(name = "priority_id")
    public Long getPriorityId() {
        return priorityId;
    }

    @Basic
    @Column(name = "category_id")
    public Long getCategoryId() {
        return categoryId;
    }
}
