import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;




class Practice {
  
  static char character = 'c';
  private String model;
  private int x;
  private int z;
  static String yoma;
  //t++;
  int t = 7;
  /*
  private Practice (String model, int x, int y) {
    model = model;
    
    x = x;
    y = y;
    
  }
  
  String setmethod(String model) {
     this.model = "heya" + " oy bish";
     
     System.out.println("yoma " + this.yoma);
     
     if (this.model == this.model) {
       //int model = 4;
       System.out.println(model);
     }
     return this.model + "andanotherconcatenation" + model;
     
    
  }
  */
  
  void dothis() {
    System.out.println("IT WORKEDDD");
  }
 public static void main(String args[]) {
   
   double x = 2.0;
   if (x > 1.0) {
     x /= 2;}
   System.out.println(x);
   if (x <= 1.0) {
     x /= 2;}
   System.out.println(x);
   
   
   
   
   ArrayList<String> list = new ArrayList<String>() ;
   list.add( "Andy" );
   list.add( 0, "Bart" );list.add( "Carl" );list.add( "Derek" );
     list.add( 0, "Eve" );
    System.out.println(list.get(1));
    
    list = new ArrayList<String>(5);
    System.out.println(list.size());
   
   
   
    Practice run1 = new Practice();
    run1.dothis();
    
    
   /* String wierd = run1.setmethod("  oy");
    System.out.println(run1.model + "  " + run1.x + "    " + wierd);
    
    if (run1.x == 0) {
      System.out.println("heyyyayayyay its null");
    }
    
    
        try {
    //fileMethod(args[0], args[1]);
    }
    catch (Exception e) {
      e.printStackTrace();
    }
    
    
    */
    
    char character = '/';
    char characterj = 'a';
    
    int characteruni = (int)character;
    int characteruni2 = (int)characterj;
    
    if ('B' <= 'b') {
    System.out.print("char unicode: " + characteruni + characteruni2);
    System.out.print(Character.getNumericValue('B') + "  " + Character.getNumericValue('j'));
    }
   // String character = "C";
    
    if (character >= 'b') {
      System.out.println("larger");
      //int character = 5;
      System.out.println(character);
    }
    else {
      System.out.println("smaller");
      //character = (int)character;
      System.out.println(character);
    }
    
    
    int iiii = 0;
    int[][][] d3 = new int[2][3][2];
    
    
    
    
    for (int[][] zzzz: d3) {
      for (int[] qqqq: zzzz) {
        for (int elem: qqqq) {
          iiii++; 
    }
      }
    }
    
    byte byt = 9;
    short shor = 5;
    
    int truncate = 10191;
    int smallint = truncate % 100; 
    int truncate1 = truncate - smallint*100;
    System.out.println(" TRUNCATE " + truncate1);
    
    Short shor2 = shor;
    short byte2 = (byte)(byt * shor2 * shor2);
    System.out.println(byte2);
    
    System.out.println(4 % 2);
    
    
    Integer numb = 4;
    System.out.println(4 % 2);
    
    System.out.println("Number of elements:!!!!: " + iiii);
    System.out.println(0f == 00.00);
    System.out.println(2%3);
    
    int[] array123 = {1,2,3,9,8,7};
    increment(1,1,array123);
    System.out.println(array123[5]);
    //return "name: + " + string1 + "." remember return can be a concatenated string.
    
    int[][] twod1 = {{1,3,4},{1,3,6}};
    System.out.println(1 % twod1[1].length);
    
    System.out.println(twod1[1]);
    
    String s1 = new String("Hi There");
    String s2 = new String("Hi There");
    String s3 = s1;
    
    int iii = 1;
    float di = iii + 1.5f;
    
    System.out.println(di + " " + iii + 1.5);
    System.out.println(s1.equals(s2));
    
    System.out.println(s1==s3);
    System.out.println(s2.equals(s3));
    
    
    
    //Boolean uu = (st == tt);
    //System.out.println(uu); ///Print's true of both var's point to same string object.
    
    float h = 1f;
    double jj = h * 6.0f; //narrowing conversions require an explicit casting.
    System.out.println(h);
    System.out.println(jj);
    
    boolean[][] booD = new boolean[2][2];
    boolean[][] booD2 = {{true, false},{true, false}};
    
    int[][] twoD2 = {{1,2}, {4,2}};
    
    
    int ii = 0;
    while (ii < 2) {
    Arrays.sort(twoD2[ii]);
    System.out.println("run number : " + ii + "   " + twoD2[ii][0] + " " + twoD2[ii][1]);
    ii++;
    }
    
    
    ArrayList<Integer> AL = new ArrayList<Integer>();
    for (int z = 0; z<twod1.length; z++) {
      for (int y = 0; y<twod1[z].length; y++){
        AL.add(twod1[z][y]);
      }
    }
   // ArrayList.sort(AL);
     System.out.println(AL);
      
    
    
    
    float[][] twod = new float[4][1];
    int[][] threed;
    System.out.println(twoD2[1][0] + " " + twoD2[1][1]);
    
    System.out.println(twod[1] + " " + twod1[1][1] + " " + twoD2[1][1]);
    System.out.println(booD[0][0] + " " + booD[0][1] + " " + twoD2[1][1]);
    System.out.println(booD2[1][1] + "h: " + h);
    
    
    Scanner in = new Scanner(System.in);
    int age = in.nextByte();
    
    
    
    System.out.println(in.nextLine() + " God, you're a great age." + in.next() + in.nextLine());
    String gender = in.nextLine();
    System.out.println("Well hellu." + gender);
    int y = 2;
    
    //z = increment(y, x);
    System.out.println(y);
    //System.out.println("x: " + x + " y: " + y + " z: " + z); 
  }
  
  
  //Interesting code which reads one file & writes another line by line. 
  static void fileMethod(String inputfile, String outputfile) throws IOException{
    Scanner in = new Scanner(new File(inputfile));
    FileWriter fw = new FileWriter(outputfile);
    BufferedWriter bw = new BufferedWriter(fw);
    int i = 1;
    while (in.hasNextLine()) { ///make use you refer to the scanner instance
      String temp = in.nextLine();// name when using scanner methods
      bw.write(i + ") " + temp);
      bw.newLine();
      i++;
    }  bw.close(); in.close(); w.close();
  }
  
  
  
      public static int increment(int x, int y, int[] array) { // when parameter name = same as global variable name, changes to the parameter var will not change the global variable. 
    System.out.println("HERE IS THE CHARACTER!!! " + character);
    x++;
    
    Arrays.sort(array);
    
    //int z = 4;
    //z++;
    int z = y++; // changes global scope variable if not declared within method. 
    System.out.println(x);
    char character = 'B';
    
    return y; 
   
  }
      
  
}