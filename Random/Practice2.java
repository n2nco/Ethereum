import java.util.*;
import java.util.ArrayList;

class Practice2 {
  
  static Practice2 obj;
  static String name = "ayo";
  
  private Practice2() {
    
  }
  
  
  static void hasDuplicates() {
    System.out.println(name);
    
   /* 
    for (Integer i = 1; i<al.size(); i++) {
      al.remove(i);
      if (al.contains(i)) {
        //eturn true;
      }
    }
    */
  }
  static Practice2 testmethod(Practice2 obj) {
    System.out.println(name);
    obj.name = "bi";
    System.out.println("EYEY");
    Practice2 Bill2 = new Practice2();
    obj.name = "Bill";
    Bill2.name = "bill2";
    return Bill2;
  }
    
  
  public static void main(String args[]) {
    
    obj = new Practice2();
    obj.hasDuplicates();
    
    obj = Practice2.testmethod(obj);
    System.out.println(obj.name);
    obj.testmethod(obj);
    
    String AA = "YO\\sAOA";
    //String BB = new String(null);
    String b = AA.substring(0,3);
    
    
    if (AA == b) {
      System.out.println(b);
    }
    else {
      System.out.println(b);
      return;
    }
    
    
    Integer tester = 191;
    String testers = String.valueOf(tester);
    System.out.println(testers.length());
    
    
    ArrayList<Object> ar= new ArrayList<Object>();
    ar.add("Heya");
    ar.add(191);
    ar.add('c');
    
    int iar = 0;
    while (iar < 3) {
      System.out.println(ar.get(iar));
      iar++;
    }
    
    String theAge = "twentythree";
    //int nig = theAge / 2 + 7;
    //String bs = testmethod();
    
    
    String HHHHey = "hey";
    double Jt= 1;
    
    
    
    int x = (int) Math.pow(2,3);
    
     String sss = null;
     boolean xb = 0.5 == 1/2;
    
     System.out.println(b);
     //System.exit(0);
   
    
    String wer = "wer";
    System.out.println(Integer.toHexString(wer.hashCode()));
    wer = wer + ".";
    System.out.println(Integer.toHexString(wer.hashCode()));
    
    
    final String[] st = {"heya", "yoma"};
    st[1] = "yoma1";
    //st = 5;
    String[] st2 = st;
    boolean t = (st.equals("heya"));
    boolean tt = (st.equals(st2));
    //st2 = st2 + "extra";
    //boolean ttt = (st==st2);
    
    System.out.println(t + "2:" + tt + "3:" );
    
   /* 
     ArrayList<Integer> arrlist = new ArrayList<Integer>();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("prepare to enter 23 birthdates.");
    
    int counter = 1;
    while (counter < 23){
    
      System.out.print("Birthdate #" + counter + ".   \n" + "Enter a month:");
      Integer temp = sc.nextInt();
      System.out.print("Respective day: ");
      Integer temp2 = sc.nextInt();
      if (temp > 12 || temp2 > 31) {
        System.out.println("please enter a valid day & month");
        continue;
      }
      arrlist.add(temp);
      arrlist.add(temp2);
    }
     /* 
      
      while (sc.hasNextInt()) {
    Integer temp = sc.nextInt();
    System.out.println(temp);
    arrlist.add(temp);
      }
    counter++;
    }
    */
    /*
    ArrayList<Integer> al = new ArrayList<Integer>();
    for (int i = 0; i<11; i++) {
      al.add(i);
    }
    
    int jj = 0;
    while (jj < 11) {
      System.out.println(al.get(jj));
      jj++;
    }
    
    //hasDuplicates(al);
                       
   */ 
   // String model;
    //System.out.println(model);
    
    boolean[][] values = new boolean[3][4];
    System.out.println(values.length);
    values[2] = new boolean[8];
    System.out.println(values[2].length + " " + values[0].length);
    System.out.println(values[2]);
    
    if(values[2] != null) {
      System.out.println("out here");
      //continue;
    }
    
    for(int j=0; j<=values.length; j++){ 
        System.out.print(values[j] + " ");
    }
    
    
    
    /*
    
    int i = 0;
    String c = "CHARACTER";
    
    i = i * i/i;
    int x = 2;
    int z = x;
    System.out.println(x/0);
    System.out.println(3.5%5); //2 divided by 5 (integer division) is 0 with a remainder of 2.
   
    for(int k = (c.length() - (c.length() - 1)); k<3; k++){
      for(int j=0; j<=k; j++){ ///
        System.out.print(j+ " ");
      }
      System.out.println(i); */
    }
  }


