import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        isPrime(n);
        isArmstrong(n);

        for (int i = 100; i < 1000; i++) {
            if(isArmstrong(n))
            {
                System.out.println(i);
            }
        }
    }

    // Checking prime integers
    static void isPrime(int n) {
        int chk = 2;
        if (n == 1)
            System.out.println("Neither prime nor composite");
        else
            while (chk * chk <= n) {
                if (n % chk == 0) {
                    System.out.println("Number is not prime");
                    break;
                }
                chk++;
            }
            if (chk * chk > n) {
                System.out.println("Number is prime");
            }
    }

    // Checking armstrong integer
    static boolean isArmstrong(int n)
    {
        int pow = (int) (Math.log10(n) + 1);
        int arm_val = 0;
        int temp =n;
        while(n!=0)
        {
            arm_val+=Math.pow(n%10,pow);
            n/=10;
        }
        if(temp==arm_val)
        {
            System.out.println("Number is armstrong");
            return true;
        }
        else
        {
            System.out.println("Number is not armstrong");
            return false;
        }
    }
}
