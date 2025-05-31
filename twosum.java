import java.util.Scanner ;
class twosum  {
    public static void main(String ... sumit)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a target: ");
        int target=sc.nextInt();
        System.out.println("Enter the size of an array: ");
        int userInput=sc.nextInt();
     int [] num=new int[userInput];
     for(int i=1;i<userInput;i++)
     {
        System.out.println("Enter a number: ");
        num[i]=sc.nextInt();
        
        
     }
     for(int i=0;i<userInput;i++)
     {
        for(int j=0;j<userInput;j++)
        {
            if(num[i]+num[j]==target)
            {
                System.out.println("The value are : "+num[i]+ " & " +num[j]);
                break;
            }
        }
     }
    //  System.out.println("You entered:");
    //     for (int i = 0; i < userInput; i++) {
    //         System.out.print(num[i] + " ");
    //     }

    //  System.out.print(num[]);
    //  for(int n=0;n<userInput;n++)
    //  {
    //     System.out.println(num[n]);
    //  }
    }
    // public int[] twoSum(int[] nums, int target) {
    //     Scanner sc=new Scanner(System.in);
    //     int userInput=sc.nextInt();
    //  int [] num=new int[userInput];   
    // }
}
