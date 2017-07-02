/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author james
 */
public class CustomerManagerTest {
    
    public CustomerManagerTest() {
    }

    /**
     * Test of addCustomer method, of class CustomerManager.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        String title = "mr";
        String firstName = "james";
        String surname = "chalmers";
        String mobileNo = "07552605450";
        String homePhoneNumber = "01343547869";
        String emailAddress = "james.chalmers184@gmail.com";
        String loginName = "jc184";
        String loginPassword = "1Acheilidh1";
        Date dateOfBirth = null;
        CustomerManager instance = new CustomerManager();
        //instance.addCustomer(title, firstName, surname, mobileNo, homePhoneNumber, emailAddress, loginName, loginPassword, dateOfBirth);
        Customer expResult  = new Customer(32, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        Customer result = new Customer(Integer.SIZE, title, firstName, surname, mobileNo, homePhoneNumber, emailAddress, loginName, loginPassword, dateOfBirth);
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomerIdByAdd method, of class CustomerManager.
     */
    @Test
    public void testGetCustomerIdByAdd() {
        System.out.println("getCustomerIdByAdd");
        String loginName = "jc184";
        String loginPassword = "1Acheilidh1";
        CustomerManager instance = new CustomerManager();
        int expResult = 1;
        int result = instance.getCustomerIdByAdd(loginName, loginPassword);
        assertEquals(expResult, result);
    }
    
}
