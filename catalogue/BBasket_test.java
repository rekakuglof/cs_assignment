package catalogue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

    public class BBasket_test extends BetterBasket {

        @Test
        public void addTest() {
            Product productOne = new Product("0001",
                    "Watch", 89.0, 4);
            Product productTwo = new Product("0001",
                    "Watch", 89.0, 4);

//        BetterBasket betterBasket = new BetterBasket();

            if (productOne.getProductNum().equals(productTwo.getProductNum())) {
                productOne.setQuantity(productOne.getQuantity() + 1);
            }

            assertEquals(5, productOne.getQuantity());
        }

        @Test
        public void sortingTest() {
            Product productThree = new Product("0003",
                    "Phone", 249.0, 1);
            Product productTwo = new Product("0002",
                    "Tablet", 149.0, 3);
            Product productOne = new Product("0001",
                    "PlayStation", 199.0, 2);
            List<Product> expectedList = new ArrayList<>();
            expectedList.add(productOne);
            expectedList.add(productTwo);
            expectedList.add(productThree);

            List<Product> prTest = new ArrayList<>();
            prTest.add(productThree);
            prTest.add(productTwo);
            prTest.add(productOne);

            Collections.sort(prTest, ShopInterface::sortByProduct);

            assertEquals(prTest, expectedList);
        }
    }


