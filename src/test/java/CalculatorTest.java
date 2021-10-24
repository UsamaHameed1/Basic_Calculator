import org.junit.Assert;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator object;
    @org.junit.Before
    public void setUp() throws Exception {
        object=new Calculator(5,5);
    }

    @org.junit.Test
    public void getA() {
        Assert.assertEquals(5,object.getA());
    }

    @org.junit.Test
    public void getB() {
        Assert.assertEquals(5,object.getB());
    }

    @org.junit.Test
    public void setA() {
        object.setA(10);
        Assert.assertEquals(10,object.getA());
    }

    @org.junit.Test
    public void setB() {
        object.setB(10);
        Assert.assertEquals(10,object.getB());
    }


    @org.junit.Test
    public void add() {
        Assert.assertEquals(10,object.add());
    }

    @org.junit.Test
    public void sub() {
        Assert.assertEquals(0,object.sub());
    }

    @org.junit.Test
    public void div() {
        Assert.assertEquals(1,object.div());
    }

    @org.junit.Test
    public void divNegative() {
        object.setB(0);
        Assert.assertEquals(0,object.div());
    }


    @org.junit.Test
    public void mul() {
        Assert.assertEquals(25,object.mul());
    }
}