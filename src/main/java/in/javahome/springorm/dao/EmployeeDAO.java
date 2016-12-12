package in.javahome.springorm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import in.javahome.springorm.entity.Employee;
@Component
public class EmployeeDAO {
	@Autowired
	private HibernateTemplate template;
	@Transactional
	public void addEmployee(Employee emp){
		template.save(emp);
	}
	@Transactional
	public void deleteEmployee(Integer empId){
		Employee emp = template.get(Employee.class, empId);
		template.delete(emp);
	}
}
