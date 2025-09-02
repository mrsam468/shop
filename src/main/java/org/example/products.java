package org.example;

import java.text.NumberFormat;


public interface products {
    String name = "egg";
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String  price = currency.format(23);

}
