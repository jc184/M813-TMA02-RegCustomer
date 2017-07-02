/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.CustomerDataStore;
import java.util.Date;

/**
 *
 * @author james
 */
public class CustomerManager {

    CustomerDataStore customerStore;

    public CustomerManager() {
        customerStore = new CustomerDataStore();
    }

    /* 
     *
     */
    public void addCustomer(String title, String firstName, String surname, String mobileNo, String homePhoneNumber, String emailAddress, String loginName, String loginPassword, Date dateOfBirth) {
        for (int newId = 1; newId < Integer.MAX_VALUE; newId++) {
            if (customerStore.getRecord(newId) == null) {
                Customer customer = new Customer(newId, title, firstName, surname, mobileNo, homePhoneNumber, emailAddress, loginName, loginPassword, dateOfBirth);
                customerStore.createRecord(customer);
                return;
            }
        }
    }

    public int getCustomerIdByAdd(String loginName, String loginPassword) {
        int customerId = 0;
        for (Customer customer : customerStore.getAllRecords()) {
            if (customer.getLoginName().equals(loginName) && (customer.getLoginPassword().equals(loginPassword))) {
                customerId = customer.getCustomerId();
            }
        }
        return customerId;
    }

}
