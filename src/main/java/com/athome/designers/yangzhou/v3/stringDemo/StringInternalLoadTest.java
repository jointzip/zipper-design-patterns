package com.athome.designers.yangzhou.v3.stringDemo;

import javax.sound.midi.Soundbank;

/**
 * @Author:
 * @Date: 2021/7/9 9:21
 * @Description:
 * /**
 *      * Returns a canonical representation for the string object.
 *      * <p>
 *      * A pool of strings, initially empty, is maintained privately by the
 *      * class {@code String}.
 *      * <p>
 *      * When the intern method is invoked, if the pool already contains a
 *      * string equal to this {@code String} object as determined by
 *      * the {@link #equals(Object)} method, then the string from the pool is
 *      * returned. Otherwise, this {@code String} object is added to the
 *      * pool and a reference to this {@code String} object is returned.
 *      * <p>
 *      * It follows that for any two strings {@code s} and {@code t},
 *      * {@code s.intern() == t.intern()} is {@code true}
 *      * if and only if {@code s.equals(t)} is {@code true}.
 *      * <p>
 *      * All literal strings and string-valued constant expressions are
 *      * interned. String literals are defined in section 3.10.5 of the
 *      * <cite>The Java&trade; Language Specification</cite>.
 *      *
 *      * @return  a string that has the same contents as this string, but is
 *      *          guaranteed to be from a pool of unique strings.
 *      *
 * 1.internal 用法：
 * internal方法被调用的时候，如果常量池已经包含这个字符串，
 * 然后常量池里的字符串会被返回，否则该字符串会被放到池中，返回它的引用
 * 2.系统自带的，加载的时候会使用bootstrapclassloader加载rt.jar,,,sun.misc.version里面会调用System类初始化的方法加载java相关字符串
 */
public class StringInternalLoadTest {
    public static void main(String[] args) {
        String brother = new StringBuilder("66").append("tongcheng").toString();
        String str = new StringBuilder("66").append("tongcheng").toString();
        System.out.println(str); //58tongcheng
        System.out.println(str.intern());
        System.out.println(str == str.intern());

        System.out.println("*********************************************");
        String str2 = new StringBuilder("1.8.0_").append("141").toString();
        System.out.println(str2); //java
        System.out.println(str2.intern());
        System.out.println(str2 == str2.intern()); //只有java是false,其他全是true

        System.out.println("*********************************************");
        String str3 = new StringBuilder("jav").append("a").toString();
        System.out.println(str2); //java
        System.out.println(str2.intern());
        System.out.println(str2 == str2.intern()); //只有java是false,其他全是true
    }
}
