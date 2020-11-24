package assignment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;

//import java.io.*;


public class Tests {


   @Test
   public void code(){
       App.main(null);

       assertEquals(false, App.greaterThan(2, 5), "method greaterThan() failed");
       assertEquals(true, App.greaterThan(5, 2), "method greaterThan() failed");
       assertEquals(false, App.greaterThan(5, 5), "method greaterThan() failed");

       assertEquals(true, App.lessThan(2, 5), "method lessThan() failed");
       assertEquals(false, App.lessThan(5, 2), "method lessThan() failed");
       assertEquals(false, App.lessThan(5, 5), "method lessThan() failed");

       assertEquals(false, App.equalTo(2, 5), "method equalTo() failed");
       assertEquals(true, App.equalTo(2, 2), "method equalTo() failed");
       assertEquals(false, App.equalTo(5, 2), "method equalTo() failed");

       assertEquals(false, App.greaterOrEqual(2, 5), "method greaterOrEqual() failed");
       assertEquals(true, App.greaterOrEqual(7, 5), "method greaterOrEqual() failed");
       assertEquals(true, App.greaterOrEqual(7, 7), "method greaterOrEqual() failed");

       assertEquals(true, App.lessOrEqual(2, 5), "method lessOrEqual() failed");
       assertEquals(false, App.lessOrEqual(7, 5), "method lessOrEqual() failed");
       assertEquals(true, App.lessOrEqual(7, 7), "method lessOrEqual() failed");
   }

   @Test
    public void late() {
        App.main(null);
        assertTrue(DueDate.onTime(2021, 1, 6), "Submitted Late");
    }


}
