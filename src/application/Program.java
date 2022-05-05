package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 1: Seller findByID ===");

        Seller seller = sellerDao.findeByID(3);

        System.out.println(seller);

        System.out.println("=== Teste 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== Teste 3: Seller findAll ===");
        list = sellerDao.findAll();

        for (Seller obj : list){
            System.out.println(obj);
        }


        System.out.println("=== Teste 4: Seller Insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New ID = "+newSeller.getId());

        System.out.println("=== Teste 5: Seller Update ===");
        seller = sellerDao.findeByID(1);
        seller.setName("Marta Waine");
        sellerDao.update(seller);
        System.out.println("Update Completed!");


        System.out.println("=== Teste 6: Seller Delete ===");
        System.out.println("Enter id to delete: ");
        int id = sc.nextInt();
        sellerDao.deletedbyId(id);
        System.out.println("Deleted completed!");

        sc.close();

    }

}
