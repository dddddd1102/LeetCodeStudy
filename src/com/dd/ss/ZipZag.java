package com.dd.ss;

public class ZipZag {

    public static void main(String[] args) {
        System.out.println("Test: " + convert("AB", 1));
    }
  
    /**
     * 找规律～
     * @param s 传递的数据
     * @param numRows 行数
     * @return zipZag后的数据
     * 
     * 传入ABCDEFGHI</br>
     * A   E   I</br>
     * B D F H </br>
     * C   G </br>
     * 
     */
    static String convert(String s, int numRows) {
        int length = s.length();
        if(numRows <= 1 || length <= numRows) {
            return s;
        }
        char[] chars = new char[length];
        int interval = numRows * 2 - 2;
        int index = 0;
        for(int i = 0; i < numRows; i++) {
            int step = interval - 2 * i;
            for(int j = i; j < length; j += interval){
                chars[index] = s.charAt(j);
                index ++;
                if(step > 0 && step <interval && step + j < length) {
                    chars[index] = s.charAt(j + step);
                    index++;
                }
            }
        }
        return String.valueOf(chars);
    }

}