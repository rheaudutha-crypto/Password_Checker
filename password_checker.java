import java.util.Scanner;

public class password_checker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Password: ");
        String pass = sc.nextLine();

        evaluatePass(pass);
        sc.close();
    }

    public static void evaluatePass(String pass){
        int score = 0;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if(pass.length() > 8){
            score++;
        }
        for(int i=0; i<pass.length(); i++){
            char ch = pass.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpper = true;
            } else if(Character.isLowerCase(ch)){
                hasLower = true;
            } else if(Character.isDigit(ch)){
                hasDigit = true;
            }else{
                hasSpecial = true;
            }
        }

        if(hasUpper) score++;
        if(hasLower) score++;
        if(hasSpecial) score++;
        if(hasDigit) score++;

        if(score <=2) {System.out.println("WEAK PASSWORD");}
        else if(score <=4 && score>2) {System.out.println("MEDIUM PASSWORD");}
        else {System.out.println("STRONG PASSWORD");}
    }
}