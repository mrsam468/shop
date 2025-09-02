package org.example;

import junit.framework.TestCase;

public class cashierTest extends TestCase {

    public void testProduct() {
        products prod =  new cashier();
        assertEquals("egg",prod.name);
        assertEquals("₦23.00",prod.price);

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