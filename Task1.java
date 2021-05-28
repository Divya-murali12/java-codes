import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] id = new String[n];
        int count = 0;
        for(int i=0;i<n;i++){
             id[i] = sc.next();
        }
        for(int i=0;i<n;i++)
        {
              if(id[i].length()< 6)
              {
                 
                 System.out.println(id[i]);
              }
        }
        
        sc.close();
    }
    
}
