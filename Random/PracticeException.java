public class PracticeException {
  public static void main(String[] args) {
    try { 
      foo(); 
    }
    catch (Exception ee) {
      System.err.println("second defence");
    }
    /*catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Caught II");
    }
    catch (Exception ee) {
      System.out.println("second defence");
    } */
    finally {
      System.out.println("ROunding Up here");
      try {
        foo();
      }
      catch (Exception e) {
        System.out.println("nexted catch");
      }
    }
  }
  public static void foo() {
    //try {
      int[] a = {1, 2, 3};
      a[4] = 5;
      
      
   // }
    /*finally {
      System.out.println("we've caught one");
    } */
   // catch (ArrayIndexOutOfBoundsException e) {  ///NOTE: the immediate block takes precedence when catching errors. 
     // System.out.println("Caught I");}
  }
}