import java.util.Scanner;

public class SignUp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        String proposed_username, proposed_password, first_letter;
        String[] vowels, symbols, all_but_last_two_letters;
        boolean first_letter_vowel = false, symbol_present = false, password_in_username = false;
        int length_of_password_minus_two;
        

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

        // symbol present check:

        symbols = new String[]{"#", "!", "$", "&", "*"};

        for (String symbol : symbols)
        {
            if ((proposed_password).contains(symbol))
            {
                symbol_present = true;
            }
        }

        System.out.println(symbol_present);

        // username in password:

        if (proposed_password.contains(proposed_username))
        {
            password_in_username = true;
        }

        System.out.println(password_in_username);

        // // no numbers except in last two places

        // length_of_password_minus_two = proposed_password.length() - 2;
        // all_but_last_two_letters = new String[]{};
        
        // for (int i = 0; i <= length_of_password_minus_two; i++)
        // {
            
        //     System.out.println(all_but_last_two_letters[i + 1]); //= "p";//proposed_password.substring(i, i + 1);
        // }
        
        
        // System.out.println(all_but_last_two_letters);

        // System.out.println(proposed_password.length());
    }
}