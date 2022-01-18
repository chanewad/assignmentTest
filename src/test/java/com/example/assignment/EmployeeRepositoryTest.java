package com.example.assignment;


import com.example.assignment.entity.Employee;
import com.example.assignment.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class EmployeeRepositoryTest {
    @Autowired
    private EmployeeRepository repository;

    @Test
    public void testListAll(){
        Iterable<Employee> employees  = repository.findAll();

        int i = 0;
        for(Employee employee : employees){
            i++;
            System.out.println(employee.toString());
            if(i > 15){
                break;
            }
        }
    }
}
