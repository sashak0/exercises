package com.example.exercises;

/**
 * A way to do exponentiation that noone asked for but here it is anyways.
 * Does not work with large numbers.
 * First version was written in DRAMA (KU Leuven SOCS assembly language) while tipsy on a train. 
 * Unfortunately I can't find it anymore.
 */
public class ExponentiationBinary {

  public static long calculate(long base, int power) {
    assert (power >= 0);
    switch (power) {
      case 0:
        return 1;
      case 1:
        return base;
    }
    int powerHalf = power / 2;
    int powerMod = power % 2;

    return calculate(base * base, powerHalf) * calculate(base, powerMod);
  }
}


