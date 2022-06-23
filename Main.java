public class Main {

  /**
   * @param dividend
   * @param divisor
   * @return arr
   */
  public static int[] weirdDivider(int dividend, int divisor) {
    int sum = 0;
    int iterations = 0;
    int remainder = 0;

    while (sum < dividend) {
      sum += divisor;
      iterations += 1;
    }

    if (sum > dividend) {
      remainder = sum - dividend;
      iterations -= 1;
    }

    int quotient = iterations;
    int[] arr = {quotient, remainder};
    return arr;
  }


  public static void main(String[] args) {
    int dividend = 47;
    int divisor = 7;
    int[] quotient_remainder = weirdDivider(dividend, divisor);
    System.out.println("The quotient is:");
    System.out.println(quotient_remainder[0]);
    System.out.println("The remainder is:");
    System.out.println(quotient_remainder[1]);
  }
}
