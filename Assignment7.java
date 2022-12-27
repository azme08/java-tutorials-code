// Logical or assignment
// step 1: Print "Do you love java? "
// step 2: take user input y / Y / n / N
// step 3: if user input y / Y then print you are a java lover
// step 4: if user input n / N then print you are not a java lover
public class Assignment7 {
  import java.util.Scanner;
  public static void main(String[] args) {
    char ans;
    Scanner sc = new Scanner(System.in);
    
   System.out.print("Do you love java?\nChoose your ans:Y/y for Yes \nN/n for No \n Ans is:");
    ans = sc.next().charAt(0);
    
    if(ans =='Y' || ans ='y'){
      System.out.println("You are a java lover.");
    }
    else if(ans ='N' || ans ='n'){
      System.out.println("You are not a java lover.");
    }
    else{
      System.out.println("Your choosing ans is wrong.");
    }
                    
  }
}
