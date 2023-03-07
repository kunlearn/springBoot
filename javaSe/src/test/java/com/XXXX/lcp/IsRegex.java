package com.XXXX.lcp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsRegex {

    /**
     * 正则表达式匹配
     *
     * @param str     指定值
     * @param pattern 正则表达式
     * @return Boolean
     */
    public static Boolean isRegex(Object str, Object pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        if (pattern instanceof Pattern) {
            return ((Pattern) pattern).matcher(str.toString()).matches();
        }
        if (pattern instanceof String) {
            Pattern pattern1 = Pattern.compile(String.valueOf(pattern));
            return pattern1.matcher(str.toString()).matches();
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "8iufsaqzx";
        String pattern = "^[^(9|Z)]";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
        System.out.println("==========================");
        System.out.println(isRegex(str, pattern));
    }
}
