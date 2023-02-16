import java.util.Random;

public class OTPGenerator {
    // length otp
    private static final int OTP_length = 6;

    // generate otp

    public static String generatOTP()
    {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<OTP_length; i++)
        {
            int digit = random.nextInt(10);
            sb.append(digit);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String otp = generatOTP();
        System.out.println("Your otp is :- " + otp);
    }
}
