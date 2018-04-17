import java.util.ArrayList;

class Bar2 {
  String name = "Yoda";
  static int classint = 1;
  static String staticname = "Yoda";
  final int jj;
  final static int bx = 5;
  //bxx = 4;
  
  Bar2(String name, int jjjj) { //constructor
    this.name = name;
    //this.bxx = bxx;
    //final int jj = 4;
     this.jj = jjjj;
   
  }
  public static void main(String[] args) {
    String ssss = null;
    try{
    ssss.length();
    System.out.println("TRY CONTINUED!");
    }
    catch (Exception e) {
      
    }
    
    //int[] yt = null;
    //System.out.println(yt[1]);
    
    int[] aaa = {1,2,3};
    int[] bbb = aaa;
    bbb[0] = 5;
    System.out.println(aaa[0]);
    //bx = 3;
    System.out.println(bx);
    final int bx = 12;
    System.out.println(bx);
    
    Bar2 b = new Bar2("frank", 23);
    Bar2 cc = new Bar2("CLINT", 24);
    //cc.jj[4] = 4;
    
  // System.out.println("HERES JJ : " + jj);
    //jj = 3;
    //jj = new int[4];
    
    
    //char cc = 'c';
    ArrayList<Double> v = new ArrayList<Double>();
    //double[] x = v;
    //ArrayList<double> xx = v;
   // v = new ArrayList<Integer>();
    
    Integer iiii = 5;
    System.out.println(iiii);
    iiii = 4;
    int vvv = 3;
    double dd = vvv;
    try {
    test(null);
    }
    catch (NullPointerException e) {
      System.out.println("IN NUlL");
      return;
    }
    finally {
      System.out.println("Here we are finally");
     
    }
   /* catch (Exception e) {
      System.out.println("int getneral");
      
    } */
    System.out.println("moving on");
     
    
    String[] arobj = new String[10];
    System.out.println(arobj[2]);
    //arobj[1].equals("HEY");
    
    
    classint++;
    System.out.println(++classint);
    
    int[] arr1 = {1,2,3,4,5};
    //arr1[5] = 6;
    //System.out.println(arr1[5]);    
    Bar2 obj = new Bar2("frank", 4);
   // System.out.println(name);
    
    
    System.out.println(obj.name); // Prints Yoda
    
    //System.out.println(Bar2.name);
    
    int[] data = new int[] {10,20,30,40,50,60,71,80,90,91};
   // System.out.println(s);
    //String s = "hey2";
    //System.out.println(s);
    
    //test();
    String t = null;
    //System.out.print(s.equals(null));
    int k = 3;
    k++; System.out.println(k);
   
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(6);//, 8, 7, 4, 312, 78, 54);
    arr.add(6);
    arr.add(400);
    arr.add(20);
    arr.add(61);
    arr.add(56);
    
for (int i = 0; i < arr.size(); i++) { 
  for (int j = i + 1; j < arr.size(); j++) { 
    int tmp = 0;          
    if (arr.get(i) < arr.get(j)) {  ///ch
      tmp = arr.get(i); 
      arr.set(i,(arr.get(j))); 
      arr.set(j,tmp); 
   } } } 
   
    for(int element : arr) {
      System.out.println(element);
    
    }
  
  
  }
  
  static void test(Double[] d) throws NullPointerException {
    Bar2 b = new Bar2("FRANKYYY", 80);
    final int[] arr = {1,2,3,4,5};
    //int[] b = arr;  //same address
    //b[1] = 10;
   // b = new int[5]; // container b labelled for an int[] gets a new object & obj address
   // System.out.println(b[1] + "       " + arr[1]); // prints 0
    
    ArrayList<Integer> arr22 = new ArrayList<Integer>();
    //Integer.parseInt(arr22.get(1));
    //System.out.println(arr22 + 3);
    //arr.getice();
    
   System.out.println("METHOD");
   return ;
  }
}
  