// Logical and assignment
// Check eligible candidate
// Step 1: Ask the candidate have you completed your masters? y/n 
// Step 2: Ask the candidate are you fulent in English? y/n 
// Step 3: if the candidate has passed masters and also have fluent english skill then print you are eligible to for the job interview
// Step 4: else print Sorry. you are not eligible to for the job interview
public class Assignment8 {
  import java.util.Scanner;
  public static void main(String[] args) {
    char ans1,ans2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Have you completed your masters?\nChoose your option in small letter:\n y for Yes \n n for No");
    ans1=sc.next().charAt(0);
    
    System.out.print("Are you fulent in English?\nCoose your option:\n y for Yes \n n for No");
     ans2=sc.next().charAt(0);
    if(ans1 =='y' && ans2=='y'){
      System.out.println("You are eligible to for the job interview");
    }
    else{
      System.out.println("You are not eligible to for the job interview.");
    }
  }
}
