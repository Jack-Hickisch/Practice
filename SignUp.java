import java.util.Scanner;

public class SignUp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        String proposed_username, proposed_password, first_letter;
        String[] vowels;
        boolean first_letter_vowel = false;
        

        System.out.println("Enter your proposed username: ");
        proposed_username = scan.nextLine();
        
        System.out.println("Enter your proposed password: ");
        proposed_password = scan.nextLine();

        // starts with a vowel check:

        first_letter = proposed_password.substring(0, 1);
        vowels = new String[]{"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        
        for (String vowel : vowels)
        {
            if (first_letter.equals(vowel))
            {
                first_letter_vowel = true;
            }
        }

            System.out.println(first_letter_vowel);

    }
}