import java.util.Scanner;

public class FirstAndSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max1=arr[0];
        int max2=arr[1];
        int temp;
        if(max1>max2)
        {
         
            temp = max1;
            max1 = max2;
            max2 = temp;
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i]>max1)
            {
               
                max1=arr[i];
            }
            else if((arr[i]>max2)&&(arr[i]!=max1))
            {
                max2=arr[i];
            }
            
            

        }
        System.out.println("max1:"+max1);
        System.out.println("max2:"+max2);
    }
    
}
