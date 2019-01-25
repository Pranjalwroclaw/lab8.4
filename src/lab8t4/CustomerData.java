package lab8t4;

import java.util.ArrayList;
import java.util.List;

public class CustomerData {
    List<Customer> customers;
    
    public CustomerData() {
        customers = new ArrayList<Customer>();
        
        for(int i = 1 ; i <20 ; i++){
        customers.add(new Customer (i, "Name: " + i, "Surname: "+i , (double) (i * 2500)));
        }
    }

    public Customer getCustomerById(int id) {
        Customer customer = null;
        for (int i = 0 ; i < customers.size(); i++) {
            if(customers.get(i).getId() == id) {
                customer = customers.get(i);
                break;
            }
        }
        return customer;
    }
 
}