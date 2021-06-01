package Test;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    public Customer c = new Customer("mrk", "123");
    String expectedResult;
    String actualResult;

    @org.junit.jupiter.api.Test
    void getUserName() {
        expectedResult = "mrk";
        actualResult = c.getUserName();
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @org.junit.jupiter.api.Test
    void getPassword() {
        expectedResult = "123";
        actualResult = c.getPassword();
        Assertions.assertEquals(expectedResult,actualResult);
    }
}