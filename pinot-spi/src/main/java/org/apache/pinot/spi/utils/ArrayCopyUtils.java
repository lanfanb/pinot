/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.spi.utils;

import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The class <code>ArrayCopyUtils</code> provides methods to copy values across arrays of different types.
 */
public class ArrayCopyUtils {
  private ArrayCopyUtils() {
  }

  public static void copy(int[] src, int[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(int[] src, long[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(int[] src, float[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(int[] src, double[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(int[] src, BigDecimal[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = BigDecimal.valueOf(src[i]);
    }
  }

  public static void copy(int[] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = Integer.toString(src[i]);
    }
  }

  public static void copy(long[] src, int[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = (int) src[i];
    }
  }

  public static void copy(long[] src, float[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(long[] src, double[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(long[] src, BigDecimal[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = BigDecimal.valueOf(src[i]);
    }
  }

  public static void copy(long[] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = Long.toString(src[i]);
    }
  }

  // specialize copy from timestamp array to string array
  public static void copyTimestamp(long[] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = new Timestamp(src[i]).toString();
    }
  }

  // specialize copy from boolean array to string array
  public static void copyBoolean(int[] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = Boolean.toString(src[i] == 1);
    }
  }

  public static void copy(long[] src, long[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(float[] src, int[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = (int) src[i];
    }
  }

  public static void copy(float[] src, long[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = (long) src[i];
    }
  }

  public static void copy(float[] src, double[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(float[] src, BigDecimal[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = BigDecimal.valueOf(src[i]);
    }
  }

  public static void copy(float[] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = Float.toString(src[i]);
    }
  }

  public static void copy(float[] src, float[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(double[] src, int[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = (int) src[i];
    }
  }

  public static void copy(double[] src, long[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = (long) src[i];
    }
  }

  public static void copy(double[] src, float[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = (float) src[i];
    }
  }

  public static void copy(double[] src, BigDecimal[] dest, int length) {
    for (int i = 0; i < length; i++) {
      // Note: BigDecimal class provides no representation for NaN, -infinity, +infinity.
      // This will throw NumberFormatException for Double.NaN, Double.NEGATIVE_INFINITY and Double.POSITIVE_INFINITY.
      dest[i] = BigDecimal.valueOf(src[i]);
    }
  }

  public static void copy(double[] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = Double.toString(src[i]);
    }
  }

  public static void copy(double[] src, double[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(BigDecimal[] src, int[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i].intValue();
    }
  }

  public static void copy(BigDecimal[] src, long[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i].longValue();
    }
  }

  public static void copy(BigDecimal[] src, float[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i].floatValue();
    }
  }

  public static void copy(BigDecimal[] src, double[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i].doubleValue();
    }
  }

  public static void copy(BigDecimal[] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i].toPlainString();
    }
  }

  public static void copy(BigDecimal[] src, byte[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = BigDecimalUtils.serialize(src[i]);
    }
  }

  public static void copy(String[] src, int[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = Double.valueOf(src[i]).intValue();
    }
  }

  public static void copy(String[] src, long[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = new BigDecimal(src[i]).longValue();
    }
  }

  public static void copy(String[] src, float[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = Float.parseFloat(src[i]);
    }
  }

  public static void copy(String[] src, double[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = Double.parseDouble(src[i]);
    }
  }

  public static void copy(String[] src, BigDecimal[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = new BigDecimal(src[i]);
    }
  }

  public static void copy(String[] src, byte[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = BytesUtils.toBytes(src[i]);
    }
  }

  public static void copy(String[] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = src[i];
    }
  }

  public static void copy(byte[][] src, String[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = BytesUtils.toHexString(src[i]);
    }
  }

  public static void copy(byte[][] src, BigDecimal[] dest, int length) {
    for (int i = 0; i < length; i++) {
      dest[i] = BigDecimalUtils.deserialize(src[i]);
    }
  }
  public static void copy(int[][] src, int[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new int[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(int[][] src, long[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new long[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(int[][] src, float[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new float[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(int[][] src, double[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new double[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(int[][] src, String[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new String[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(int[][] src, BigDecimal[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new BigDecimal[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(double[][] src, int[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new int[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(double[][] src, long[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new long[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(double[][] src, float[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new float[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(double[][] src, double[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new double[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(double[][] src, String[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new String[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(double[][] src, BigDecimal[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new BigDecimal[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(String[][] src, int[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new int[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(String[][] src, long[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new long[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(String[][] src, float[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new float[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(String[][] src, double[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new double[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(String[][] src, String[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new String[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(String[][] src, BigDecimal[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new BigDecimal[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(long[][] src, int[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new int[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(long[][] src, long[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new long[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(long[][] src, float[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new float[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(long[][] src, double[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new double[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(long[][] src, String[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new String[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(long[][] src, BigDecimal[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new BigDecimal[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(float[][] src, int[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new int[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(float[][] src, long[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new long[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(float[][] src, float[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new float[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(float[][] src, double[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new double[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(float[][] src, String[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new String[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copy(float[][] src, BigDecimal[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new BigDecimal[rowLength];
      copy(src[i], dest[i], rowLength);
    }
  }

  public static void copyTimestamp(long[][] src, String[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new String[rowLength];
      copyTimestamp(src[i], dest[i], rowLength);
    }
  }

  public static void copyBoolean(int[][] src, String[][] dest, int length) {
    for (int i = 0; i < length; i++) {
      int rowLength = src[i].length;
      dest[i] = new String[rowLength];
      copyBoolean(src[i], dest[i], rowLength);
    }
  }
}
