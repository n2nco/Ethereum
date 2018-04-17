import java.io.FileReader;


class Test {
 
  
  static int swap(int x, int y) {
    int temp = x * y;
    return temp;
  }
  public static void fun(String x) {
    
  }
  
  public static void main(String args[]) {
    String hey = (String)
    fun((String)3);
     /* File file = new File("E://file.txt");
      FileReader fr = new FileReader(file); */
      
    String str = "" + swap(4,6);
    System.out.println(str);
    Object type = str.getClass().getName();
    System.out.println(type);
    Integer i = null;
    //try{
    System.out.println(i.toString());
   // } 
    /*catch (NullPointerException e){
      System.out.println("Caught ze null"); */
    }
  }
