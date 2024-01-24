package com.myblog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Posts")
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Data


public class post {
    @Id
    @GeneratedValue(strategy = GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id ;
    private  String title;
    private String description;
    private String Content
}
