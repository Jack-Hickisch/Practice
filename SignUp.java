import java.util.Scanner;

public class SignUp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        String proposed_username, proposed_password, first_letter;
        String[] vowels, symbols;
        boolean first_letter_vowel = false, symbol_present = false, password_in_username = false;
        

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

        // username in password

        if (proposed_password.contains(proposed_username))
        {
            password_in_username = true;
        }

        System.out.println(password_in_username);
    }
}