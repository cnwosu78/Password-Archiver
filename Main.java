
import java.util.Scanner;

public class Main  {
     
    // Credit to @CodingWithTim on YouTube for the framework of this project.
    // The video that this project is built off of is linked here. https://www.youtube.com/watch?v=oBU1Mr1rZag&t=15s.

    public static String lower_case = "qwertyuiopasdfghjklzxcvbnm";
    public static String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
    public static String nums = "0123456789";
    public static String special_chars = "!@#$%&*()=`~,.;:'";
    public static String seperators = "-_^<>+";
    public static String password = "";
    public static String output = "";

    public static String temp1 = "";
    public static String temp2 = "";
    public static String temp3 = "";












    
    public static void main(String[] args) {
        System.out.println("Give your desired password length between 1 and 30");
        
        Scanner input = new Scanner(System.in);
        
        
    
        int digit = input.nextInt();

        assert digit <= 30 : "Password length must be in between 1 & 30";
        assert digit >= 1 : "Password length must be in between 1 & 30";

        lower_case = "qwertyuiopasdfghjklzxcvbnm";
        upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
     // My additions adds the functionality for numbers and special characters into the password generator
        nums = "0123456789";
        special_chars = "!@#$%&*()=`~,.;:'/";
        seperators = "-";
    // Seperators are used to make the password more readable (My addition)
       
         password = "";
         output = "";



        for(int i = 0; i < digit; i++) {
            int rand = (int)(5 * Math.random());

            switch (rand) {
                case 0:
                    password += String.valueOf((int)(0 * Math.random()));
                    break;
                case 1:
                    rand = (int)(lower_case.length() * Math.random());
                    password += String.valueOf(lower_case.charAt(rand));
                    break;
                case 2:
                    rand = (int)(upper_case.length() * Math.random());
                    password += String.valueOf(upper_case.charAt(rand));
                    break;
    // My addition adds for the password to factor nums and specials into the password
                case 3:
                    rand = (int)(nums.length() * Math.random());
                    password += String.valueOf(nums.charAt(rand));
                    break;
                case 4:
                    rand = (int)(special_chars.length() * Math.random());
                    password += String.valueOf(special_chars.charAt(rand));
                    break;
            }
        }
    // This addition adds the ability to add seperator characters to the password; making it more readable.
        System.out.println(password);
    System.out.println("Would you like seperators to make the password more readable? (True or False)");

    Scanner input2 = new Scanner(System.in);
    


    boolean answer = input2.nextBoolean();
    
    

    if(answer == true) {
    String output = simplify(password);
    System.out.println(output);


    } 

    input2.close();
    
}

public static String simplify(String password) {
    
    if(password.length() <= 30) {
        assert password.length() > 8 : "Password must be a good size for security";
         temp1 = password.substring(0, password.length() * 1/3);   
         temp2 = password.substring(password.length() * 1/3, (int)password.length() * 2/3);   
         temp3 = password.substring(password.length() * 2/3, (int)password.length());   
    }
    output = temp1 + seperators.charAt((int)Math.random() * 10 / 2) + temp2 + seperators.charAt((int)Math.random() * 10 / 2) + temp3;
    return output;
}
  
    
    


}