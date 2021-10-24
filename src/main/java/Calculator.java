public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "a=" + a +
                ", b=" + b +'\n';
    }

    public int add()
    {
        return a+b;
    }
    public int sub()
    {
        return a-b;
    }
    public int div()
    {
        if(b !=0)
        {
            return a/b;
        }
        else
        {
            return 0;
        }
    }
    public int mul()
    {
        return a*b;
    }

}
