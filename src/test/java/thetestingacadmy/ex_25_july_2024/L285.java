package thetestingacadmy.ex_25_july_2024;

import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class L285 {

 // But we will not use it frequently
//    @DataProvider
//    public Object [][] getData(){
//        return new Object[][]{
//                new Object[]{"admin","admin"},
//                new Object[]{"admin","password"},
//                new Object[]{"admin","password123"}
//        };
//    }

    @DataProvider
    public Object [][] getData(){

        Faker faker = new Faker();

        String name = faker.name().firstName();
        String password = faker.internet().password();

        return new Object[][]{
               new Object[]{name,password},
               new Object[]{"admin","password"},
               new Object[]{"admin","password123"}
        };

    }

    public Object [][] GetDataFromExcel(){

        //ApachePOI CODE
        //read  a excel file which contain the data and give to the getData
        return null;
    }




    @Test(dataProvider = "getData")
    public void testAuthToGetToken(String username, String password){
        System.out.println(username);
        System.out.println(password);


        // Rest Assured Login

        // Rest Given  -> when  -> then  -> 200 OK or Response
    }

}
