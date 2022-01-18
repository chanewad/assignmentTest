package com.example.assignment.entity;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Employee.findBySearchTerm" ,query = "SELECT e FROM Employee e WHERE LOWER(e.description) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String name;

    @Column
    private String website;

    @Column
    private String address;

    @Column
    private String country;

    @Column
    private int currentEmployee;

    @Column
    private String description;

    @Column
    private String domain;

    @Column
    private Integer foundedYear;

    @Column
    private String industry;

    @Column
    private String logoUrl;

    @Column()
    private Integer totalEmployee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", currentEmployee=" + currentEmployee +
                ", description='" + description + '\'' +
                ", domain='" + domain + '\'' +
                ", foundedYear=" + foundedYear +
                ", industry='" + industry + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", totalEmployee=" + totalEmployee +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCurrentEmployee() {
        return currentEmployee;
    }

    public void setCurrentEmployee(int currentEmployee) {
        this.currentEmployee = currentEmployee;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Integer getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(Integer foundedYear) {
        this.foundedYear = foundedYear;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Integer getTotalEmployee() {
        return totalEmployee;
    }

    public void setTotalEmployee(Integer totalEmployee) {
        this.totalEmployee = totalEmployee;
    }
}
