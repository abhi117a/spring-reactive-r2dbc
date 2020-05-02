package com.abhimanyu.reactive.rdbms.reactive.stack.rdbms.repository;

import com.abhimanyu.reactive.rdbms.reactive.stack.rdbms.entity.Employee;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {

    @Query("select id, name, age from player where name = $1")
    Flux<Employee> findAllByName(String name);

    @Query("select * from player where age = $1")
    Flux<Employee> findByAge(int age);

}
