package org.example;

import junit.framework.TestCase;

public class cashierTest extends TestCase {

    public void testProduct() {
        products prod =  new cashier();
        assertEquals("you paid $53 and here is the yam",prod.product("yam" , 53));
    }

    public void testResume() {
        Staff resume = new cashier();
        String res = resume.resume();
        assertEquals("i will be resuming work everyday" , res);
    }

    public void testReceipt() {
        cashier receipt = new cashier();

        assertEquals("here is your receipt", receipt.receipt());
    }
}