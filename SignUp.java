import java.util.Scanner;

public class SignUp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        String proposed_username, proposed_password, first_letter;
        String[] vowels, symbols, all_but_last_two_letters, list_of_numbers, taken_usernames;
        boolean first_letter_vowel = false, symbol_present = false, password_in_username = false, number_in_all_but_last_two = false, already_a_username = false;
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

        // symbol present check:

        symbols = new String[]{"#", "!", "$", "&", "*"};

        for (String symbol : symbols)
        {
            if ((proposed_password).contains(symbol))
            {
                symbol_present = true;
            }
        }

        // username in password:

        if (proposed_password.contains(proposed_username))
        {
            password_in_username = true;
        }

        // no numbers except in last two places

        if (proposed_password.length() <= 2)
        {
            length_of_password_minus_two = proposed_password.length() - 2;
            all_but_last_two_letters = new String[length_of_password_minus_two];
            
            for (int i = 0; i < length_of_password_minus_two; i++)
            {
                all_but_last_two_letters[i] = proposed_password.substring(i, i + 1);
            }
            
            list_of_numbers = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

            for (String number_in_password : all_but_last_two_letters)
            {
                for (String number_compare_to : list_of_numbers)
                {
                    if (number_in_password.equals(number_compare_to))
                    {
                        number_in_all_but_last_two = true;
                    }
                }
            }
        }
        

        // compare to users that already exist

        taken_usernames = new String[]{"admin", "person", "jimbob234", "skater_gurl17", "gary"};

        for (String taken_username : taken_usernames)
        {
            if (taken_username.equals(proposed_username))
            {
                already_a_username = true;
            }
        }

        if (first_letter_vowel && symbol_present && !password_in_username && !number_in_all_but_last_two && !already_a_username)
        {
            System.out.println("Your password works! Congrats!!!");
        }
        else
        {
            System.out.println("Your password does not work, try again");
        }
    }
}