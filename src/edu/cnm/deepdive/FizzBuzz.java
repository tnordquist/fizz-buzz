package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {

    String[] computedValues = fizzBuzz(1, 101);

    for (String eachVal : computedValues) {

      System.out.println(eachVal);

    }

  }

  public static String[] fizzBuzz(int start, int end) {

    String[] bins = new String[end - start];

    for (int i = start; i < end; i++) {

      String envelope;

      if (i % 3 == 0) {

        envelope = "Fizz";

      } else {
        envelope = ""; // empty string length is zero
      }

      if (i % 5 == 0) {

        envelope += "Buzz";

      }

      if (envelope.isEmpty()) {

        envelope += i;

      }

      bins[i - start] = envelope;  // from here the array has to be put on the
      // stack by returning it.

    }

    return bins;
  }

}
