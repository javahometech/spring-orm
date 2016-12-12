package in.javahome.springorm;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.javahome.springorm.dao.EmployeeDAO;
import in.javahome.springorm.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-orm.xml");
		EmployeeDAO employeeDAO = cxt.getBean(EmployeeDAO.class);
//		Employee emp = new Employee();
//		emp.setEmpName("Raghu");
//		emp.setPhone("999999999");
		employeeDAO.deleteEmployee(3);
	}
}
