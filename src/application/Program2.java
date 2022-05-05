package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {
    
    public static void main(String[] args){

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Teste 1: Department Insert ===");
        Department newDepartment = new Department(null, "Teste");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New ID = "+newDepartment.getId());
        
        System.out.println("=== Teste 2: Department Delete ===");
        System.out.println("Digite um ID para ser removido: ");
        int id = sc.nextInt();
        departmentDao.deletedbyId(id);
        System.out.println("Deleted!");

        
    }

}
