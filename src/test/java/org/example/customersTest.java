package org.example;

import junit.framework.TestCase;

public class customersTest extends TestCase {

    public void testTestProduct() {

            products prod = new customers();
         assertEquals("egg",prod.name);
         assertEquals("₦23.00",prod.price);

    }
}