package recursionAssignment;

import java.io.*;

public class Recursion {
  public static int count7(int n) {
    int counter = 0;

    if (n % 10 == 7)
      counter++;

    if (n / 10 == 0)
      return counter;

    return counter + count7(n / 10);
  }
public static String changePi(String str) {
    String str2 = "";
    return changePi(str, str2);
  }

  public static String changePi(String str, String str2) {
    if (str.length() == 0) {
      return str2;
    } else {
      if (str.endsWith("pi")) {
        str2 = 3.14 + str2;
        return changePi(str.substring(0, str.length() - 2), str2);
      } else {
        str2 = str.charAt(str.length() - 1) + str2;
      }
    }
    return changePi(str.substring(0, str.length() - 1), str2);

  }

  public static String stringClean(String str) {
    if (str.length() < 2) {
      return str;
    }
    if (str.charAt(0) == str.charAt(1)) {
      return stringClean(str.substring(1));
    } else {
      return str.charAt(0) + stringClean(str.substring(1));
    }
  }
  
}
