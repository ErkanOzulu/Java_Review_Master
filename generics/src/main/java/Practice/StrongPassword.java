package Practice;

public class StrongPassword {

    public static void main(String[] args) {

        String password="Apple123!";


        if (password.contains(" ")){
            System.out.println("Invalid Password");
           return;
        }

        boolean hasAtLeast8Chars=password.length()>=8;
        boolean hasUpperCase=false;
        boolean hasLowerCase=false;
        boolean hasDigit= false;
        boolean hasSpecialChar=false;

        for (int i = 0; i <password.length() ; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)){
                hasUpperCase=true;
            }else if (Character.isLowerCase(ch)){
                hasLowerCase=true;
            }else if (Character.isDigit(ch)){
                hasDigit=true;
            } else {
                hasSpecialChar=true;
            }
        }

        boolean isStrongPassword=hasAtLeast8Chars&&hasDigit&&hasSpecialChar&&hasLowerCase&&hasUpperCase;
        if (isStrongPassword){
            System.out.println(password+" is a strong password");
        }else {
            System.out.println(password + " is a weak password");
        }

    }
}
/**

 Write a program that can determine whether the given password is strong password.
 Characteristics of a strong password typically include:
 1. Password should be at least have 8 characters
 2. Password should contain at least one uppercase letter
 3. Password should contain at least one lowercase letter
 4. Password should contain at least one digit character
 5. Password should contain at least one special character

 In addition, a valid password should not include whitespaces

 Ex: "Apple123!"

 */