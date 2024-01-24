package com.myblog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name="Posts")
@Entity
@Data

public class Post {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String content;
}
