package com.tlglearning.practice;

/**
 * Defines a single static method, {@link #isPerfectSquare(long)}, which evaluates a specified value
 * to determine whether it is a perfect square.
 */
public abstract class Square {
  private static final String NEGATIVE_NUMBER = "negative numbers can not be perfect squares";
  private Square() {
    // NOTE: There is NO need to do anything with this constructor! The method you will implement
    //       in this class is static; thus, there is no need to create instances of this class.
  }

  /**
   * Computes and returns a {@code boolean} flag indicating whether the provided {@code input} is a
   * perfect square. A negative {@code input} value will result in {@link IllegalArgumentException}
   * being thrown.
   *
   * @param input Value to be tested.
   * @return Flag indicating whether {@code input} is a perfect square or not.
   * @throws IllegalArgumentException When {@code input} is negative.
   */
  public static boolean isPerfectSquare(long input) throws IllegalArgumentException {
//    throw new UnsupportedOperationException("Not yet implemented"); // TODO Implement as specified.
    boolean result = false;
    if(input < 0){
      throw new IllegalArgumentException(String.format(NEGATIVE_NUMBER));
    }

    double squareRoot = Math.sqrt(input);
    if(squareRoot % 2 == 0.0 || squareRoot % 2 == 1.0){
      result = true;
    }
    return result;
  }

}
