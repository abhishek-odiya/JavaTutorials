public class LastDigit {
    public static void main(String[] args) {
        int number=123456559;
        int org = number;
        int rev =0;
        int count = 0;
        int rem;


        while(number > 0) {
            count++;
            rem = number % 10;
            rev = (rev * 10) + rem;
            number = number / 10;
            
        }

        System.out.println("Total digits are: " + count);
        System.out.println("Orignal number is: " + org);
        System.out.println("Reverse is: " + rev);

    }
}
