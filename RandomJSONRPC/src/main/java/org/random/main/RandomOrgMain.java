package org.random.main;

import org.random.api.RandomOrgClient;
import java.util.Arrays;

public class RandomOrgMain {


    public static void main(String[] args) {

        final String API_KEY = "f9999047-5bf5-4083-8219-57025c410274";

        RandomOrgClient roc = RandomOrgClient.getRandomOrgClient(API_KEY);
        try {
            int[] randoms = roc.generateIntegers(10, 1, 6);
            System.out.println("Results: " + Arrays.toString(randoms));
            System.out.println("Requests Left: " + roc.getRequestsLeft());
            System.out.println("Bits Left: " + roc.getBitsLeft());
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }


    }

}
