package thetestingacadmy.ex_25_july_2024;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class L286 {
    @Test
    public void testDemo(){

     // Random User or Password

     Faker faker = new Faker();
     String username = faker.name().username();
     String phoneNumber = faker.phoneNumber().phoneNumber();
     System.out.println(username);
     System.out.println(phoneNumber);

    }


}
