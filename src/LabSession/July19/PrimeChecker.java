package LabSession.July19;

public class PrimeChecker {

	public static int checkPrime(int num) {
        if (num <= 1) {
            return -1; 
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return -1; 
            }
        }
        return num; 
    }

    public static void main(String[] args) {
        int number = 11; 
        int result = checkPrime(number);

        if (result != -1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

