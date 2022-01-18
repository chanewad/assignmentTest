package com.example.assignment;

import com.example.assignment.entity.Employee;
import com.example.assignment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class SearchController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/")
    public List<Employee> getEmployees(){
        return service.getEmployees();
    }

    @GetMapping("/autosuggestion")
    public List<Employee> getAutoSuggestionForWord(@RequestParam String searchTerm){
        return service.findBySearchTerm(searchTerm);
    }

    @GetMapping("/keywordsearch")
    public List<Employee> getKeywordSearch(@RequestParam String searchTerm){
        List<Employee> list = service.findBySearchTerm(searchTerm);

        return list;
    }

    @GetMapping("/searchwithlocation")
    public List<Employee> getKeywordSearchWithLocation(@RequestParam String searchTerm){
        return service.findBySearchTerm(searchTerm);
    }

    //highlight search result

    @GetMapping("/employeesbycountry")
    public Map<String, Integer> getEmployeesByCountry(){
        return service.findEmployeesByCountry();
    }
}
