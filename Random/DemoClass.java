/******************************************************************/
/* Author: CS307 Course Staff                                     */
/* Date: February 14, 2005                                        */
/* Description: Demos constructors, static vs instance methods,   */
/*              and method overloading.                           */
/******************************************************************/
public class DemoClass
{
    private int x;
    private int[][] array;

    public DemoClass()
    {
        // assign default value
        x = 0;
    }

    public DemoClass(int x)
    {
        // use this.x to refer to the instance variable x
        // use x to refer to a local variable x (more specifically,
        // method parameter x)
        this.x = x;
    }

    public DemoClass(DemoClass otherDemo)
    {
        // copy the value from the otherDemo
        this.x = otherDemo.x;
    }
    public DemoClass(DemoClass otherDemo1, DemoClass otherDemo2)
    {
        // copy the value from the otherDemo
      if (otherDemo1.x > otherDemo2.x) {
        
        this.array[0][0] = otherDemo1.x;
        this.array[0][1] = otherDemo2.x;
        this.array[0][1] = otherDemo2.x;
        
    }
    }
    
      
      public int[][] initializeArray(int rows, int columns) {
        
        System.out.println("\n \n creating an array and printing as I go: " );
        this.array = new int[rows][columns];
        
        for (int i=0; i<this.array.length; i++){
          for (int j=0; j<this.array[0].length; j++) {
            this.array[i][j] = i + j;
          System.out.println(this.array[i][j]);
                                        }
        }
        return this.array;
      }
        
    // static method (aka class method)
    public static void s1() {
      
      
        return;
    }
    // instance method
    public void i1() {
      System.out.println("What's required to use a non void method is: \n objectname.method()");
      
        return;
    }

    // static calling static OK
    // static calling instance is a compile-time error
    public static void s2() {
//        i1(); 
      
// compile-time error
      System.out.println("Running a static method");
        s1();       // DemoClass.s1
        return;
    }

    // instance calling static OK
    // instance calling instance OK
    public void i2() {
        s1();       // DemoClass.s1();
        i1();       // this.i1();
        return;
    }

    // call various versions of overload() based on their 
    // list of parameters (aka function signatures)
    public void overloadTester() {
        System.out.println("overloadTester:\n");

        overload((byte)1);
        overload((short)1);
        overload(1);
        overload(1L);
        overload(1.0f);
        overload(1.0);
        overload('1');
        overload(true);
    }
    
    public void overload(byte b) {
        System.out.println("byte");
    }    
    public void overload(short s) {
        System.out.println("short");
    }    
    public void overload(int i) {
        System.out.println("int");
    }
    public void overload(long l) {
        System.out.println("long");
    }
    public void overload(float f) {
        System.out.println("float");
    }
    public void overload(double d) {
        System.out.println("double");
    }    
    public void overload(char c) {
        System.out.println("char");
    }    
    public void overload(boolean b) {
        System.out.println("boolean");
    }    

    public static void main(String[] args) {
        DemoClass masterobject = new DemoClass();
        DemoClass dc2 = new DemoClass(23);
        DemoClass dc3 = new DemoClass(masterobject);
        
        dc2.overloadTester();
        s2();
        int[][] arr = dc3.initializeArray(3,4);
        System.out.println(" Printing Arrrrr " + arr[1][1]);
        
        masterobject.i1();
        
        System.out.println(masterobject.x);
        System.out.println(dc2.x);
        System.out.println(dc3.x);
    }
}

// end of DemoClass.java
