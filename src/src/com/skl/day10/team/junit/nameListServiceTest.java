package src.com.skl.day10.team.junit;

import org.junit.Test;
import src.com.skl.day10.team.domain.Employee;
import src.com.skl.day10.team.service.NameListService;
import src.com.skl.day10.team.service.TeamException;

/**
 * @program: case_skills_practice
 * @ClassName: nameListServiceTest
 * @author: skl
 * @create: 2024-07-02 16:08
 */
public class nameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee() throws TeamException {
        NameListService service = new NameListService();
        try {
            Employee employee = service.getEmployee(3);
            System.out.println(employee);
        } catch (TeamException t){
            System.out.println(t.getMessage());
        }
    }

}
