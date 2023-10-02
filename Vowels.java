package com.JBCODEWARS;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Vowels { // 23.10.02
    public static int getCount(String str) {

        char[] listOfVowels = {'a','e','i','o','u'};
        int vowelCount = 0;

        for(int i = 0 ; i < str.length(); i++){
            for (char x : listOfVowels ) {
                if(x == str.charAt(i) ){
                    vowelCount++;
                }
            }
        }
    return vowelCount;
    }
}