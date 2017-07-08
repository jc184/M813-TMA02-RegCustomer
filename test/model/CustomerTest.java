
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Alba Airways application M813-TMA02-RegisterCustomer
 * https://github.com/jc184/M813-TMA02-RegCustomer
 * @author james chalmers Open University F6418079
 * Test Case TC1
 */
public class CustomerTest {
    
    public CustomerTest() {
    }

    /**
     * Test of getCustomerId method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetCustomerId() throws ParseException {
        System.out.println("getCustomerId");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        Integer expResult = 4;
        Integer result = instance.getCustomerId();
        assertEquals(expResult, result);
    }


    /**
     * Test of getTitle method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetTitle() throws ParseException {
        System.out.println("getTitle");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        String expResult = "mr";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }


    /**
     * Test of getFirstName method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetFirstName() throws ParseException {
        System.out.println("getFirstName");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        String expResult = "james";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }


    /**
     * Test of getSurname method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetSurname() throws ParseException {
        System.out.println("getSurname");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        String expResult = "chalmers";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }


    /**
     * Test of getMobileNo method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetMobileNo() throws ParseException {
        System.out.println("getMobileNo");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        String expResult = "07552605450";
        String result = instance.getMobileNo();
        assertEquals(expResult, result);
    }


    /**
     * Test of getHomePhoneNumber method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetHomePhoneNumber() throws ParseException {
        System.out.println("getHomePhoneNumber");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        String expResult = "01343547869";
        String result = instance.getHomePhoneNumber();
        assertEquals(expResult, result);
    }


    /**
     * Test of getEmailAddress method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetEmailAddress() throws ParseException {
        System.out.println("getEmailAddress");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        String expResult = "james.chalmers184@gmail.com";
        String result = instance.getEmailAddress();
        assertEquals(expResult, result);
    }


    /**
     * Test of getLoginName method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetLoginName() throws ParseException {
        System.out.println("getLoginName");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        String expResult = "jc184";
        String result = instance.getLoginName();
        assertEquals(expResult, result);
    }


    /**
     * Test of getLoginPassword method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetLoginPassword() throws ParseException {
        System.out.println("getLoginPassword");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        String expResult = "1Acheilidh1";
        String result = instance.getLoginPassword();
        assertEquals(expResult, result);
    }


    /**
     * Test of getDateOfBirth method, of class Customer.
     * @throws java.text.ParseException
     */
    @Test
    public void testGetDateOfBirth() throws ParseException {
        System.out.println("getDateOfBirth");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Customer instance = new Customer(4, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
        Date expResult = sdf.parse("1966-04-03");
        Date result = instance.getDateOfBirth();
        assertEquals(expResult, result);
    }
  
}
