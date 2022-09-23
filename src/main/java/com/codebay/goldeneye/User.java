package com.codebay.goldeneye;

/**
 * Class User.
 * Contains attributes and methods to create a User object and generate the email string.
 *  */
public class User {
    private String name;
    private String surname;
    private String office;
    private String department;

    /**
     * Gets the name string attribute
     * @return name string
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name string atribute
     * @param name string
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the surname string attribute
     * @return surname string
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname string atribute
     * @param surname string
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Gets the office string attribute
     * @return office string
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the office string atribute
     * @param office string
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * Gets the department string attribute
     * @return department string
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department string atribute
     * @param department string
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets the final email string using the "name", "surname", "office" and "department" attributes. New code can be implemented here to manipulate the final email string.
     * @return email string
     */
    public String getEmail() {
        String email = this.name.replaceAll("\\s", "").toLowerCase().charAt(0) + this.surname.replaceAll("\\s", "").toLowerCase() + "." + this.department.replaceAll("\\s", "").toLowerCase()+ "@" + this.office.replaceAll("\\s", "").toLowerCase() + "." + "goldeneye.com";
        
        return email;
    }


}
