import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {

    @Test
    public void addItem_toShoppingCart_returnItem(){

        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("item1");

        cart.add(item);
       // Assert.assertNotNull(onCart);
        Assert.assertEquals("item1", item.getName());
        Assert.assertTrue(cart.items.size() == 1);
        Assert.assertFalse(cart.items.isEmpty());
        Assert.assertEquals("item1", cart.items.get(0).getName());
    }

    @Test
    public void givenPattern_returnIndex(){

        String custNAme = "Steve Smith";
        Assert.assertTrue(custNAme.indexOf(" ") == 5);
    }

    @Test
    public void givenFullName_returnFirstName(){
        String customName = "Steve Smith";
        String name = StringUtils.substring(customName, 0, customName.indexOf(" "));
        Assert.assertEquals("Steve", name);
    }

    @Test
    public void givenFullName_rebuildIt_StringBuilder(){
        String firstName = "Steve Smith";
        String name = firstName.substring(0, firstName.indexOf(" "));
        StringBuilder sb = new StringBuilder(name);
        StringBuilder total = sb.append(" ").append("Smith");
        Assert.assertEquals("Steve Smith", total.toString());
    }
}
