
public class Fibonacci {
    /**
     * Return the nth number of fibonacci sequence.
     * The fibonacci sequence is calculated by adding the previous two numbers in the sequence to obtain the next
     * number. The first two numbers in the whole fibonacci sequence are always 0 and 1.
     * For instance, the sequence starts as:
     * index: 0 1 2 3 4 5 6 7  8 
     * value: 0 1 1 2 3 5 8 13 21
     * where the 4th number of the sequence would be 3, the 5th number would be 5, the 6th number would be 8, etc.
     *
     * You could either use a for loop to keep track of the current number of the fibonacci sequence as well as the two
     * numbers before it, or you could look up a recursive solution to experiment with recursion for the first time.
     *
     * @param n an iteration of the fibonacci sequence.
     * @return the nth number of fibonacci sequence.
     */
    public int fib(int n){
        int[] fib;
        int size = 2 + n;
        fib = new int[size];
        fib[0] = 0;
        fib[1] = 1;

        for (int ctr = 2; ctr < size; ctr++) {
            fib[ctr] = fib[ctr-2] + fib[ctr-1];
        }
        for (int f : fib) {
            System.out.println(f);
        }
        return fib[n];
    }
}
