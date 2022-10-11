package com.example.solid;

import com.example.solid.interfaces.NonvegRestaurantInterface;
import com.example.solid.interfaces.RestaurantInterface;
import com.example.solid.interfaces.VegRestaurantInterface;

class DhakaVegRestaurant implements RestaurantInterface {

    @Override
    public void prepareVegItems() {
        System.out.println("Prepare Veg Items.");
    }

    @Override
    public void prepareNonvegItems() {
        System.out.println("Prepare Non Veg Items.");
    }
}

//class DhakaVegRestaurantUpdate implements VegRestaurantInterface {
//
//    @Override
//    public void prepareVegItems() {
//        System.out.println("Prepare Veg Items.");
//    }
//}


//class DhakaRestaurant implements VegRestaurantInterface, NonvegRestaurantInterface {
//
//    @Override
//    public void prepareVegItems() {
//        System.out.println("Prepare Veg Items.");
//    }
//
//    @Override
//    public void prepareNonvegItems() {
//        System.out.println("Prepare Non Veg Items.");
//    }
//}


public class InterfaceSegregation {

    public static void main(String[] args) {
        DhakaVegRestaurant dhakaVegRestaurant = new DhakaVegRestaurant();
        dhakaVegRestaurant.prepareNonvegItems();
        dhakaVegRestaurant.prepareVegItems();
    }
}
