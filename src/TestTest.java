import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by Robertas Juškėnas on 2017.01.26.
 */
public class TestTest {
    @org.junit.Test
    public void testOperationNumbersPlus(){
        Test test = new Test();
        int res = test.operationNumbers(Test.OperationType.PLUS,1,2);
        Assert.assertEquals(4, res);
    }
    @org.junit.Test
    public void testOperationNumbersMinus(){
        Test test = new Test();
        int res = test.operationNumbers(Test.OperationType.MINUS,1,2);
        Assert.assertEquals(-1, res);
    }
    @org.junit.Test
    public void testOperationNumbersDivision(){
        int res = 0;
        Test test = new Test();
        res = test.operationNumbers(Test.OperationType.DIVISION,6,2);
        Assert.assertEquals(3, res);

        res = test.operationNumbers(Test.OperationType.DIVISION,6,0);
        Assert.assertEquals(0, res);
    }
    @org.junit.Test
    public void testOperationNumbersMultiplication(){
        Test test = new Test();
        int res = test.operationNumbers(Test.OperationType.MULTIPLICATION,6,2);
        Assert.assertEquals(12, res);
    }
    @org.junit.Test
    public void testOperationNumbersNonExixtant(){
        Test test = new Test();
        int res = test.operationNumbers(null,6,2);
        Assert.assertEquals(0, res);
    }



}