class Practice3 {
  
  String name;
  Practice3 outerobj;
  
  Practice3 obj;
  //Practice3 obj2;
  //int age;
 // static String name = "BILLY";
  Practice3() {
    //outerobj.name = "yohan";
    //outerobj.age = 16;
    System.out.println(this.name);
  }
  
  static void staticMethod() {
    //obj.name = "bob1";
    //System.out.println("IN STATIC METHOD: " + obj.name);
  }
  
  int age;
  
  void setname() {
    name = name;
    //int age = 4; 
    this.age = 2;
    this.name = "bob";
  }
  
  void instanceMethod() {
    System.out.println("I1" + name);
    System.out.println(age);
    name = "Bout";
   // System.out.println(obj2);
   // Practice3 obj = new Practice3();
  }
  
  void instanceMethod2() {
    System.out.println("HEREHEH " + this.name);
  }
      
      
  public static void main(String[] args) {
    
    Practice3 obj = new Practice3();
    Practice3 obj2 = new Practice3();
    Practice3 obj3 = new Practice3();
    
    obj.setname();
    //obj.staticMethod(obj);
    obj.instanceMethod();
    obj.instanceMethod2();
    
    
    
    System.out.println(obj.name + "   " + obj2.name);
    //staticMethod();
    
    System.out.println("HERE" + obj.age);
  }
 
}
