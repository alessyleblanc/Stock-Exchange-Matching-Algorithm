package myPackage;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StockExchange {
	public static void main(String[] args) {
		method();
		for (int i = 0; i < StockExchange.method().size(); i++) {
			System.out.println(StockExchange.method().get(i));
		}
	}

	public static List<Integer> method() {
		// public static List<Integer> computePrices(List<Integer> s, List<Integer> p,
		// List<Integer> q) {
		int[] s = { 12, 15, 1, 50 };
		int[] p = { 7, 32, 43, 77 };
		int[] q = { 1, 12, 100, 1000 };
		
		List<Integer> answer = new ArrayList<Integer>();
		List<Integer> a = new ArrayList<Integer>();
		int max = 0;
		for (int i = 0; i < q.length; i++) {
			a = new ArrayList<Integer>();
			for (int j = 0; j < s.length; j++) {

				if (s[j] <= q[i]) {
					a.add(s[j]);
				}
			}
			max = a.get(0);
			for (int count1 = 0; count1 < a.size(); count1++) {
				if (a.get(count1) > max) {
					max = a.get(count1);
				}
			}
			for (int z = 0; z < s.length; z++) {
				if (max == s[z]) {
					answer.add(p[z]);
				}
			}
		}
		return answer;
	}
}

/* Actual Solution to the HackerRank Problem*/
/*
public static List<Integer> computePrices(List<Integer> s, List<Integer> p, List<Integer> q) {
    List<Integer> answer = new ArrayList<Integer>();
    List<Integer> a = new ArrayList<Integer>();
    int max = 0;
    for (int i = 0; i < q.size(); i++) {
        a = new ArrayList<Integer>();
        for (int j = 0; j < s.size(); j++) {

            if (s.get(j) <= q.get(i)) {
                a.add(s.get(j));
            }
        }
        max = a.get(0);
        for (int count1 = 0; count1 < a.size(); count1++) {
            if (a.get(count1) > max) {
                max = a.get(count1);
            }
        }
        for (int z = 0; z < s.size(); z++) {
            if (s.get(z) == max) {
                answer.add(p.get(z));
            }
        }
    }
    return answer;
}
}
*/
