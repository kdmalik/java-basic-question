// /**
//  * deepak1
//  */
// // public class deepak1 {

// //     public static void main(String[] args) {
// //         System.out.println("jai shree ram");
// //     }
// // }
// /**
//  * deepak1
//  */
// //fibonacci series
// // public class deepak1 {
// // public static void main(String[] args) {
// //        int a=0;
// //        int b=1;
// //        int c;
// //        System.out.println(a+"\n"+b);
// //     for(int i=2;i<10;i++){
// //         c=a+b;
// //         System.out.println(c);

// //          a=b;
// //          b=c;
    
// //     }
// // }
    
// // }

// //array target question

// public class deepak1 {

//     public static void main(String[] args) {
//         int arr[]={2,4,8,1,6,3};
//         int target=10;
//         jaat(arr,target);
        
//     }
//     public static void jaat(int arr[],int target){
//         for(int i=0;i<arr.length;i++){
//             for(int j=1;j<arr.length;j++){
            
//                if(arr[i]+arr[j]==target){

//                     System.out.println(i+" "+j);
//               //  System.out.println(arr[i]);
//                     arr[i]=5;
//                     //System.out.println(arr[i]);

//                     break;
                    
                    
//                }
            
//             }
            
//         }
    
        
//     }
// }



// // public class deepak1 {

// //     public static void main(String[] args) {
// //         int kd[]={};
// //         int arr[]=new int[3];
// //         int j=0;
// //         for(int i=kd.length-1;i>=0;i--){
// //             arr[j]=kd[3];
// //             j++;

            

// //         }
// //         for(int i=0;i<kd.length;i++){
            
            
// //         }

       

// //     }
// // }
// /**
//  * deepak1
//  */
// // public class deepak1 {

// //     public static void main(String[] args) {
// //         int a=7;
// //         boolean x = true;
// //         for(int i=2;i<a;i++){

// //         if(a%i==0){
// //            System.out.println();
// //             x = false;

// //             break;
// //         }
// //     }
    
// //     if(x==true){
// //         System.out.println("Prime Number");
// //     }
// //     else{
// //         System.out.println("Not Prime");
// //     }
// //     }
// // }

// /**
//  * deepak1
//  */
// // 


// /**
//  * deepak1
//  */
// // public class deepak1 {

// //         public static void main(String[] args) {
// //             String a="deepak";
            
// //             for(int i=a.length()-1;i>=0;i--){
            
// //                 System.out.print(a.charAt(i));
// //             }
// //         }
// //     }

import java.util.Scanner;

/**
 * deepak1
 */
public class deepak1 {
    public static void findCP(String a1,String a2) {
        int len=Math.min(a1.length(),a2.length());
          String lan="";
          for(int i=0;i<len;i++){
            if(a1.charAt(i)==a2.charAt(i)){
                lan+=a2.charAt(i);
            }
            else{
                break;
            }
          }
        System.out.println(lan);
    }

    public static void main(String[] args) {
        Scanner dk=new Scanner(System.in);
        System.out.println("enter 1st string");
        String a1=dk.nextLine();
        System.out.println("enter 2nd string");
        String a2=dk.nextLine();
        findCP(a1,a2);
    }
}