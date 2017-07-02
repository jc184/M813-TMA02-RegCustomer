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
public class CustomerTest {
    
    public CustomerTest() {
    }

    /**
     * Test of getCustomerId method, of class Customer.
     */
    @Test
    public void testGetCustomerId() {
        System.out.println("getCustomerId");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        Integer expResult = 4;
        Integer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }


    /**
     * Test of getTitle method, of class Customer.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        String expResult = "mr";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }


    /**
     * Test of getFirstName method, of class Customer.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        String expResult = "james";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }


    /**
     * Test of getSurname method, of class Customer.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        String expResult = "chalmers";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }


    /**
     * Test of getMobileNo method, of class Customer.
     */
    @Test
    public void testGetMobileNo() {
        System.out.println("getMobileNo");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        String expResult = "07552605450";
        String result = instance.getMobileNo();
        assertEquals(expResult, result);
    }


    /**
     * Test of getHomePhoneNumber method, of class Customer.
     */
    @Test
    public void testGetHomePhoneNumber() {
        System.out.println("getHomePhoneNumber");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        String expResult = "01343547869";
        String result = instance.getHomePhoneNumber();
        assertEquals(expResult, result);
    }


    /**
     * Test of getEmailAddress method, of class Customer.
     */
    @Test
    public void testGetEmailAddress() {
        System.out.println("getEmailAddress");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        String expResult = "james.chalmers184@gmail.com";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }


    /**
     * Test of getLoginName method, of class Customer.
     */
    @Test
    public void testGetLoginName() {
        System.out.println("getLoginName");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        String expResult = "jc184";
        String result = instance.getLoginName();
        assertEquals(expResult, result);
    }


    /**
     * Test of getLoginPassword method, of class Customer.
     */
    @Test
    public void testGetLoginPassword() {
        System.out.println("getLoginPassword");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        String expResult = "1Acheilidh1";
        String result = instance.getLoginPassword();
        assertEquals(expResult, result);
    }


    /**
     * Test of getDateOfBirth method, of class Customer.
     */
    @Test
    public void testGetDateOfBirth() {
        System.out.println("getDateOfBirth");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", null);
        Date expResult = null;
        Date result = instance.getDateOfBirth();
        assertEquals(expResult, result);
    }
  
}
