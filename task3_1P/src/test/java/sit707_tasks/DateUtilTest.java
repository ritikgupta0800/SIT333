
package sit707_tasks;

import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

public class DateUtilTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "224234399";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "Ritik Gupta";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testMaxJanuary31ShouldIncrementToFebruary1() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
    }

    @Test
    public void testMaxJanuary31ShouldDecrementToJanuary30() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
    }

    @Test
    public void testNominalJanuary() {
        int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        date.increment();
    }

    @Test
    public void testMinJanuary1ShouldIncrementToJanuary2() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }

    @Test
    public void testMinJanuary1ShouldDecrementToDecember31() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }

    
    @Test
    public void testIncrementFromEndOfJanuary() {
        DateUtil date = new DateUtil(31, 1, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfFebruary() {
        DateUtil date = new DateUtil(29, 2, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfMarch() {
        DateUtil date = new DateUtil(31, 3, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfApril() {
        DateUtil date = new DateUtil(30, 4, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfMay() {
        DateUtil date = new DateUtil(31, 5, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfJune() {
        DateUtil date = new DateUtil(30, 6, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfJuly() {
        DateUtil date = new DateUtil(31, 7, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfAugust() {
        DateUtil date = new DateUtil(31, 8, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(9, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfSeptember() {
        DateUtil date = new DateUtil(30, 9, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(10, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfOctober() {
        DateUtil date = new DateUtil(31, 10, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfNovember() {
        DateUtil date = new DateUtil(30, 11, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testIncrementFromEndOfDecember() {
        DateUtil date = new DateUtil(31, 12, 2024);
        date.increment();
        Assert.assertEquals(1, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2025, date.getYear());
    }
    

    
    @Test
    public void testDecrementFromStartOfJanuary() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        Assert.assertEquals(2023, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfFebruary() {
        DateUtil date = new DateUtil(1, 2, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfMarch() {
        DateUtil date = new DateUtil(1, 3, 2024);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfApril() {
        DateUtil date = new DateUtil(1, 4, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfMay() {
        DateUtil date = new DateUtil(1, 5, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfJune() {
        DateUtil date = new DateUtil(1, 6, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(5, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfJuly() {
        DateUtil date = new DateUtil(1, 7, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(6, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfAugust() {
        DateUtil date = new DateUtil(1, 8, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(7, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfSeptember() {
        DateUtil date = new DateUtil(1, 9, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(8, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfOctober() {
        DateUtil date = new DateUtil(1, 10, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(9, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfNovember() {
        DateUtil date = new DateUtil(1, 11, 2024);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(10, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
    @Test
    public void testDecrementFromStartOfDecember() {
        DateUtil date = new DateUtil(1, 12, 2024);
        date.decrement();
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(11, date.getMonth());
        Assert.assertEquals(2024, date.getYear());
    }
    
}
