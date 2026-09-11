package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("=== TEST 1:  findById ====");
		
		Department department = departmentDao.findbyId(3);
		
		System.out.println(department);
		
	
	
		
		System.out.println("\n=== TEST 2:  findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department obj: list) {
			System.out.println(obj);
			
		}
		
		System.out.println("\n=== TEST 3:  Insert ====");
		Department newDepartment = new Department(null, "carro");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4:  Update ====");
		
		Department dep = departmentDao.findbyId(1);
		dep.setName("LeroLero");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		System.out.println(departmentDao.findbyId(1));
		System.out.println("\n=== TEST 6: Department delete ====");
		System.out.println("Enter id for delete test:");
		
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		
		System.out.println("Delete completed!");
		
		
		sc.close();
		

		
	}

}
