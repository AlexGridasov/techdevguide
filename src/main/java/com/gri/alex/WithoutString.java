package com.gri.alex;

/*
Given two strings, base and remove, return a version of the base string where
all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more.
Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
/*

/**
 * User: Alex
 * Date: 7-Jun-18
 */
public class WithoutString {

    static String withoutString(String base, String remove) {
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();

        if (base.isEmpty() || !baseLower.contains(removeLower)) {
            return base;
        }

        int off = 0;
        int next = 0;
        StringBuilder builder = new StringBuilder();

        while ((next = baseLower.indexOf(removeLower, off)) != -1) {
            builder.append(base, off, next);
            off = next + remove.length();
        }

        builder.append(base, off, base.length());

        return builder.toString();
    }

}
