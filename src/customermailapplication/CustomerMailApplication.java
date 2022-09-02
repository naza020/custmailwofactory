/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private Customer customer;
//    public void getCustomerTypeFromUser(String customerType) {
//        switch(customerType) {
//            case "Regular":
//                customer = new RegularCustomer();
//                break;
//            case "Mountain":
//                customer = new MountainCustomer();
//                break;
//            case "Delinquent":
//                customer = new DelinquentCustomer();
//                break;
//        }
//    }
//    public String generateMail() {
//        return customer.createMail();
//    }
    
    public static void main(String[] args) {
       
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        String stringType ="";
        switch(type) {
            case 1:
                stringType="Regular";
                break;
            case 2:
                stringType="Mountain";
                break;
            case 3:
                stringType="Delinquent";
                break;
        }
        Customer app = CustomerFactory.createCustomer(stringType);
        if (app==null){
            System.out.println("Error : Input is wrong. Please try again.");
        }else{
             System.out.println(app.createMail());     
        }
          
    }
}
