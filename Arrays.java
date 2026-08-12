import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The Array is Sorted");
        } else {
            System.out.println("The Array is Not Sorted");
        }

        sc.close();
    }
}



// 1..// import java.util.Scanner;
// public class Arrays{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int[] numbers = new int[10];

//         int evenCount = 0;
//         int oddCount = 0;

//         for(int i = 0; i < 10; i++){
//             numbers[i] = sc.nextInt();

//             if(numbers[i] % 2 == 0){
//                 evenCount++;
//                  }

//             else{
//                 oddCount++;
//             }
//         }
//            System.out.println("Enter Even numbers:" + evenCount);
//            System.out.println("Enter Odd numbers:" + oddCount); 

//     }
// }

// 2.// import java.util.Scanner;
// public class Arrays{
//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int[] elements = new int[5];
//         System.out.println("Enter 5 elements:");


//         for(int i=0;i<5;i++){
//             elements[i] = sc.nextInt();
            
//         }
//         System.out.println("All elements are:");
//         for(int j=0;j<5;j++){
//             System.out.println(elements[j]);

//         }

//     }
// }

// Sum of elements in arrays

// import java.util.Scanner;
// public class Arrays{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int[] numbers = new int[5];
//         int sum = 0;

//         for(int i=0; i<5; i++){
//             numbers[i] = sc.nextInt();
//         }
//         for(int j=0;j<5;j++){
//          sum = sum + numbers[j];
//         }
//         System.out.println("Sum:" + sum);
//     }
// }