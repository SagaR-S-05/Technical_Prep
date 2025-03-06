// Dutch National Flag Algorithm
class Main {
    public static void main(String[] args) {
        int[] arr= {1,2,1};
        for(int i=0;i<arr.length-2;i++)
        {
             if(arr[0+i]==arr[i+1] && arr[i+1]==arr[i+2])
            {
                System.out.println("All same");
            }
            else
            {
                if(arr[i+1]==arr[i+2])
                {
                    System.out.println(arr[i+0]);
                }
                else if(arr[i+0]==arr[i+2])
                {
                    System.out.println(arr[i+1]);
                }
                else
                {
                    System.out.println(arr[i+2]);
                }
        }
       
    }
}
}

// Normal approach:
// import java.util.Scanner;

// public class Main {
//     public static int sameNo(int[] arr) {
//         if (arr.length < 3) {
//             return -1;
//         } else {
//             for (int i = 1; i < arr.length; i++) {
//                 if (arr[i] != arr[i - 1]) {
//                     return arr[i];
//                 }
//             }
//         }
//         // If no different element is found, return -1
//         return -1;
//     }

//     public static int maxAlt(int[] arr) {
//         int maxAlt = 0;
//         // int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             // sum += arr[i];
//             arr[i+1]=arr[i]+arr[i+1];
//             if (arr[i] > maxAlt) {
//                 maxAlt = arr[i];
//             }
//         }
//         return maxAlt;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }
//         // System.out.println(sameNo(arr));
//         System.out.println(maxAlt(arr));
//     }
// }
