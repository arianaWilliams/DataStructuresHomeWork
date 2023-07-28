package com.tlglearning.practice;

import java.util.*;

/**
 * Implements a search for zero-sum triples in an array of {@code int} values.
 */
public abstract class Combinations {

  private Combinations() {
    // NOTE: There is NO need to do anything with this constructor! The method
    //       you will implement in this class is static; thus, there is no need
    //       to create instances of this class.
  }

  /**
   * Finds and returns all zero-sum triples (each encapsulated in a 3-element {@link Set
   * Set&lt;Integer&gt;}) contained in {@code data}.
   *
   * @param data Values to search.
   * @return All zero-sum triples in {@code data}.
   */
  public static Set<? extends Set<Integer>> zeroSumTriples(int[] data) {
//    throw new UnsupportedOperationException("Not yet implemented"); // TODO Implement as specified.
    Set<Set<Integer>> resultSet = new HashSet<>();
    Arrays.sort(data);
    int sum;
    for(int i = 0; i < data.length; i++){
      int firstNum = data[i];
      for(int j = i + 1; j < data.length; j++){
        int secondNum = data[j];
        for(int x = j + 1; x < data.length; x++){
          int thirdNum = data[x];
          sum = firstNum + secondNum + thirdNum;
          if(sum == 0) {
            Set<Integer> result = new HashSet<>();
            result.add(firstNum);
            result.add(secondNum);
            result.add(thirdNum);
            resultSet.add(result);
          }
        }
      }
    }

    return resultSet;
  }
}
