package com.gri.alex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * User: Alex
 * Date: 02-Jan-19
 */
public class SortedNoDuplicates {

    int[] sort(int[] a) {
        if (a.length == 0) {
            return a;
        } else {
/*
            Set<Integer> temp = new HashSet<>();

            for (int i : a) {
                temp.add(i);
            }

            Integer[] integers = temp.toArray(new Integer[0]);

            return Arrays.stream(integers)
                    .mapToInt(Integer::intValue)
                    .sorted()
                    .toArray();
*/

            List<Integer> list = new ArrayList<>();

            for (int el : a) {
                if (!list.contains(el)) {
                    list.add(el);
                }
            }

            int[] ret = new int[list.size()];
            Iterator<Integer> iterator = list.iterator();

            for (int i = 0; i < ret.length; i++) {
                ret[i] = iterator.next();
            }

            Arrays.sort(ret);

            return ret;
        }
    }
}
