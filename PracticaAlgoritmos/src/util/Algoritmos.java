package util;

public abstract class Algoritmos {
	
    /**
     * @param fibonacci
     * @return La formula Fibonacci.
     */
    public static int fibonacci(int num) {
        if (num <= 1)
            return num;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    /**.
     * @param factorial
     * @return La formula factorial.
     */
    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }
	
    /**
     * @param primo
     * @return La formula de si es primo es true.
     */
    public static boolean primo(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
	

