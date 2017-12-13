import ex9.Customer;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void instanciateCustomerWithNumber(){
        Customer customer = new Customer("Tiago");
        Assert.assertEquals("Tiago", customer.getName());


    }


}
