// 1.
// import java.util.Scanner;
// public class Loop{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
        
//         int number = sc.nextInt();

//         for(int i=1; i<=number;i++){
//             System.out.println(i);
//         }

//     }
// }



// import java.util.Scanner;

// public class Loop {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         for (int i = n; i >= 1; i--) {
//         System.out.println(i);
//       }

//         sc.close();
//     }
// }


// / import java.util.Scanner;
// public class Loop{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();
        
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
            
           
//         }
//         sc.close();

//     }
// }



//  import java.util.Scanner;
//  public class Loop{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         for(int i = 0;i<=n;i++){
//             System.out.println(i);
//         }

//     }
// }

//  import java.util.Scanner;
//  public class Loop{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         for(int i = n;i>=1;i--){
//             System.out.println(i);
//         }

//     }
// }

//  import java.util.Scanner;
//  public class Loop{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         for(int i = 0;i<=n;i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
            
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Loop{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         int sum = 0;
//         for(;n>0;){
//             int digit = n%10;
//             sum+= digit;
//             n=n/10;
//         }
//         System.out.println(sum);
//     }
// }

// import java.util.Scanner;
// public class Loop{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

       
//         for(int i = 0;i<=n;i++){
//             if(i%2!=0){
//                 System.out.println(i);
//             }
            
//         }
      
//     }
// }



// import java.util.Scanner;
// public class Loop{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();
//         for(int i = 1;i<=n;i++){
//           System.out.println(n + "x" + i + "=" + (n*i));
          
//         }
     
//     }
// }

// import java.util.Scanner;

// public class Loop {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         int sum = 0;

//         for (int i = 1; i <= n; i++) {
           
//            if(i%2!=0){
//             sum = sum + i;
//            }
//         }

//         System.out.println("Sum: " + sum);
//     }
// }


// import java.util.Scanner;

// public class Loop {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         int count = 0;

//         for (int i = 1; i <= n; i++) {

//             if (i % 3 == 0) {
//                 count++;
//             }
//         }

//         System.out.println("Count: " + count);

//         sc.close();
//     }
// }
// import java.util.Scanner;

// public class Loop {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number:");
//         int n = sc.nextInt();

//         int fact = 1;

//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }

//         System.out.println("Factorial: " + fact);

//         sc.close();
//     }
// }


// import java.util.Scanner;

// public class Loop {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number:");
//         int n = sc.nextInt();
//         for (int i = 2; i <= n; i++){
//         boolean isPrime = true;

//         for (int j = 2; j <i; j++) {
//             if(i % j == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         if(isPrime){
//             System.out.println("It is a Prime number");
//         }
//         else{
//             System.out.println("Not a Prime number");
//         }
//     }


//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Looping{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         int n = sc.nextInt();
//         int reverse = 0;
//         for(;n>0;){
//             int digit = n % 10;
//             reverse = reverse * 10 + digit;
//             n = n / 10;
//         }
//         System.out.println(reverse);
//     }
// }