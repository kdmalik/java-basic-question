
 //=====================> INHERITANCE <=========================
//         ____________SINGEL INHERITANCE 1______________
// class Collage{
//     public void colage(){
//         System.out.println("SGT University:");
//     }
// }
// class Department extends Collage{
//     public void departmnt(){
//         System.out.println("CSE Department");
//     }
// }
// public class Practis {

//     public static void main(String[] args) {
//         Department my=new Department();
//         my.colage();
//         my.departmnt();
//         }
// }


//        *__________MULTI VALUE INHERITANCE 2_____________*

// class Collage{
//     public void clg(){
//         System.out.println(" Collage name:-SGT University");
//     }
// }
// class Department extends Collage{
//     public void dprtmnt(){
//         System.out.println("Deparment name:-CSE Department");

//     }
// }
// class Studentclass extends Department{
//     public void studntcls(){
//         System.out.println("Class name:-Bechler Computer Of Application");
//     }
// }
// class Studentname extends Studentclass{
//     public void studentnam(){
//         System.out.println("Student name:-Deepak Malik");
//     }
// }
// public class Practis {

//     public static void main(String[] args) {
//         Studentname my=new Studentname();
//         my.clg();
//         my.dprtmnt();
//         my.studntcls();
//         my.studentnam();

//     }
// }


/**
 * Practis
 */
//            *____________HIERARCHICAL INHERITANCE_________________*

// class Vehical{
//     public void vehical(){
//         System.out.println("Car and Bike");
//     }
// }
// class Car extends Vehical{
//     public void car(){
//         System.out.println("car is=>G-wagon");
//     }
// }
// class Bike extends Vehical{
//   public void bike(){
//     System.out.println("bike is=>bullet");
//   }
// }
// public class Practis {

//     public static void main(String[] args) {
//         Bike my=new Bike();
//         Car my2=new Car();
//         my.vehical();
//         my.bike();
//         my2.car();
//     }
// }

//======================> POLYMOREPHISUM <=========================
//                      ____OVERLOADING____

// class overloading{
//     public int area(int a,int b){
//          //System.out.println("Area of rectangle"+a*b);
//          return a*b;
//     }
//     public double area(double x,double y){
//        // System.out.println("Area of trangle"+1/2*a*b);
//         return 1.0/2*(x*y);
//     }
// }
// public class Practis {
//         public static void main(String[] args) {
//            overloading my=new overloading();
//            System.out.println("Area of rectangle"+" => "+my.area(8, 10));
//            System.out.println("Area of trangle"+" => "+my.area(9d,10));
//         }
//     }

//                *____________OVERRIDING__________*

// class Bank{
//      public   int bank()
//      {
//         return 0;
//     }
//     }
    
//     class SBI extends Bank{
//         public int bank(){
//             return 8;
//         }
//     }
    
//     class ICICI extends Bank{
//         public int bank(){
//             return 7;
//         }
//     }
//     class AXIS extends Bank{
//         public int bank(){
//             return 9;
//         }
//     }
    
//     class Practis{
//     public static void main(String args[]){
//     SBI s=new SBI();
//     ICICI i=new ICICI();
//     AXIS a=new AXIS();
//     System.out.println("SBI Rate of Interest: "+s.bank());
//     System.out.println("ICICI Rate of Interest: "+i.bank());
//     System.out.println("AXIS Rate of Interest: "+a.bank());
//     }
//     }

//====================> ABSTRACTION <=====================

// abstract class Shape {
    
//     public abstract void draw();
// }

// class Circle extends Shape {
//     public void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// class Rectangle extends Shape {
//     public void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }

// public class Practis{
//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         Rectangle rectangle = new Rectangle();
//         circle.draw();
//         rectangle.draw();
//     }
// }