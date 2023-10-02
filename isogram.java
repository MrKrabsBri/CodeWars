package com.JBCODEWARS;

import java.util.HashMap;
import java.util.Map;

public class isogram { // 23.10.01
    public static boolean isIsogram(String str) {
        String testingString = str.toUpperCase();
         Boolean isWordIsogram;
         String newWord = "";
         for(int i = 0; i < str.length(); i++){
             isWordIsogram = newWord.contains(String.valueOf(testingString.charAt(i))) ? false : true ;
             if (!isWordIsogram) {
                 return isWordIsogram;
             }
             newWord = newWord + testingString.charAt(i);
         }
         return true;
    }
}
//public class isogram {
//    public static boolean isIsogram(String str) {
//
//        Map <Character,Boolean> wordCharactersMap = new HashMap<>(); // true means only one count of the letter.
//        Boolean isWordIsogram = true;

//        for(int i = 0; i < str.length(); i++){
//            if(!wordCharactersMap.containsKey(str.charAt(i))){
//                wordCharactersMap.put(str.charAt(i),true);
//            }
//            else {
//                isWordIsogram = false;
//                break;
//            }
//        }
//        return isWordIsogram;
//    }
//}