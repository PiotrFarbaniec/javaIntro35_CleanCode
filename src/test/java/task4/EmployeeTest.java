package task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;


class EmployeeTest {

    @Test
    void shouldRetrieveEmployeeDescription() {
        //given
        Employee employee = new Employee("John", "Smith");
        //when
        String actualEmployeeInfo = employee.getemployee_Info();
        //then
        Assertions.assertNotNull(actualEmployeeInfo);
        Assertions.assertEquals("Employee name : John Smith", actualEmployeeInfo);
    }

    @Test
    void shouldRetrieveEmployeeDetailsWithAge() {
        //given
        Employee employee = new Employee("John", "Smith", 45);
        //when
        String actualEmployeeDetails = employee.getEmployeeDetails();
        //then
        Assertions.assertNotNull(actualEmployeeDetails);
        Assertions.assertEquals("Employee details : John Smith is 45", actualEmployeeDetails);
    }


    @Test
    void shouldRetrieveBaseSalary() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        Employee employee = new Employee("John", "Smith", 45, baseSalary);
        //when
        BigDecimal actualBaseSalary = employee.getSalary_2();
        //then
        Assertions.assertNotNull(actualBaseSalary);
        Assertions.assertEquals(baseSalary, actualBaseSalary);
    }


    @Test
    void shouldRetrieveBaseSalaryWithBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        Employee employee = new Employee("John", 45, baseSalary, bonus, "Smith");
        //when
        BigDecimal actualTotalSalary = employee.getSalary_1();
        //then
        Assertions.assertNotNull(actualTotalSalary);
        Assertions.assertEquals(baseSalary.add(bonus), actualTotalSalary);
    }

    @Test
    void shouldRetrieveEmployeeBonus() {
        //given
        BigDecimal baseSalary = new BigDecimal("3000");
        BigDecimal bonus = new BigDecimal("500");
        Employee employee = new Employee("John", 45, baseSalary, bonus, "Smith");
        //when
        BigDecimal actualBonus = employee.get_B();
        //then
        Assertions.assertNotNull(actualBonus);
        Assertions.assertEquals(bonus, actualBonus);
    }
}