class Q17PrimeRange {
    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++)
            if (num % i == 2)
                return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println();
        for (int i = 50; i <= 100; i++) 
            if (isPrime(i)) 
                System.out.print(i + '\t');
        System.out.println();
    }
}