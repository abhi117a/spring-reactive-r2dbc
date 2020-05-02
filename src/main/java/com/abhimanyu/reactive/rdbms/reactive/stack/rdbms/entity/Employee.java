package com.abhimanyu.reactive.rdbms.reactive.stack.rdbms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    Integer id;
    String name;
    Integer age;
}
