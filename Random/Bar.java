import java.util.ArrayList;

class Bar {
  //Bar c = new Bar();
  static Bar b = new Bar();
  String nana;
  
  Bar() {
    
  }
  static void setter(Bar b) {
    b.nana = "Grandmother";
    b.nana = "YOMA";
    
  }
  
  
    public void func(){ 
      System.out.print("CLASS SCOPE OBJECT" + b);
    //x = 3;//changes Bar.x// 
    //yy = 3; //changes this.y
    funcstat();
    func2();
    Bar b = new Bar();
    System.out.println("METHOD SCOPE OBJECT " + b);
    
    }
    public void func2() {
     // System.out.println("WORKED WITHOUT OBJ. or THIS. " + this.yy);
    }
    static void funcstat() {
      int yy = 3;
     // System.out.println(x);
      //System.out.println(yy);
    }
    
    public static void main(String[] args) { 
      
      /*nt[] arr = new int[] {6, 8, 7, 4, 312, 78, 54}; 
for (int i = 0; i < arr.length; i++) { 
  for (int j = i + 1; j < arr.length; j++) { 
    int tmp = 0;          
    if (arr[i] > arr[j]) { 
      tmp = arr[i]; 
      arr[i] = arr[j]; 
      arr[j] = tmp; 
   } } } }
      
      /*
      ArrayList<String> ar = new ArrayList<String>(5);
      
      ar.add(0,"16");
      ar.add(1, "12");
      ar.add(1, "14");
      //ar.add(2, new Bar().nana);
     // ar.remove(1);
       //int count = 0;
      ArrayList<String> ar2 = new ArrayList<String>();
      
      ar2.addAll(ar);
      /*
      for (int count = 0; count < ar.size(); count++) {
        ar2.add(count, "0");
      } */
    //  System.out.println(ar2.get(2));
     
     
      /*for(int count = 0; count < ar.size() - 1; count++) {
        String min = null;
        for (int count2 = count + 1; count2 < ar.size(); count2++) {
         
          if (Integer.parseInt(ar2.get(count)) > Integer.parseInt(ar2.get(count2))) {
            min = ar2.get(count2);
          }
          else {
            min = ar2.get(count);
          }
          
            
           // ar.add(count, "10000");
            //ar2.add(count, ar.get(count2));
          }
        ar2.add(count, min);
        }
      
      int[] arr = {110,7,8,5};
      for(int i = 0; i < arr.length -1 ; i++) { //left comparison loop. don't need to compare final array value. 
        
        Integer index = i;
        for (int j = i + 1; j < arr.length; j++) { // right comparison loop. don't need to compare 1st value to 1st value.
          if (arr[j] < arr[index]) {
            index = j;
          }
          
          int smallerNumber = arr[index];
          arr[index] = arr[i];
          arr[i] = smallerNumber;
          
          else {
            min = arr[i];
          }
        }
        System.out.println(min);
         arr[i] = min;
      }
      
      for (int element : arr) {
        System.out.println(element);
      }
        
      
    

        
        
      
      System.out.println( " AR2  " + ar2.get(0) + ar2.get(1) + ar2.get(2));
      
      ArrayList<Object> arObj = new ArrayList<Object>();
      arObj.addAll(ar);
      
      System.out.println("AD ALL ARRAY: " + arObj.get(2));
        
      Object[] array = new Object[5];
      array[1] = "HEY";
      array[2] = 4.0;
      array[0] = new Bar();
      System.out.println("ARRAY: " + array[0] + array[1] + " " + array[2]);
      
      System.out.println("ADS" + 1 / 2);
      int index = 1;
      Integer ind = index;
      index = index++;
      index++;
      System.out.println("FIRST " + index); //
      
      funcstat();
      
      int yy = 2;
     // Bar b;
      
      
      
      Bar b = new Bar();
      setter(b);
      System.out.println(b.nana);
     // System.out.println(b.yy);
      b.func(); // call func on object since not static}
    //  System.out.println("HERE " + b.yy);
      
      try {
      System.out.println(yy);
      }
      catch (Exception e) {
        System.out.println(e);
      }
      
    }
*/
}
}