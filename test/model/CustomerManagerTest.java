
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
public class CustomerManagerTest {

    public CustomerManagerTest() {
    }

    /**
     * Test of addCustomer method, of class CustomerManager.
     * @throws java.text.ParseException
     */
    @Test
    public void testAddCustomer() throws ParseException {
        System.out.println("addCustomer");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String title = "mr";
        String firstName = "james";
        String surname = "chalmers";
        String mobileNo = "07552605450";
        String homePhoneNumber = "01343547869";
        String emailAddress = "james.chalmers184@gmail.com";
        String loginName = "jc184";
        String loginPassword = "1Acheilidh1";
        Date dateOfBirth = sdf.parse("1966-04-03");
        CustomerManager instance = new CustomerManager();
        //instance.addCustomer(title, firstName, surname, mobileNo, homePhoneNumber, emailAddress, loginName, loginPassword, dateOfBirth);
        Customer expResult = new Customer(32, "mr", "james", "chalmers", "07552605450", "01343547869", "james.chalmers184@gmail.com", "jc184", "1Acheilidh1", sdf.parse("1966-04-03"));
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

    /**
     * Test of validateCustomer method, of class CustomerManager.
     */
    @Test
    public void testValidateCustomer() {
        System.out.println("validateCustomer");
        String loginName = "john123";
        String loginPassword = "password";
        String emailAddress = "john.smith123@gmail.com";
        CustomerManager instance = new CustomerManager();
        boolean expResult = false;
        boolean result = instance.validateCustomer(loginName, loginPassword, emailAddress);
        assertEquals(expResult, result);
    }

}
