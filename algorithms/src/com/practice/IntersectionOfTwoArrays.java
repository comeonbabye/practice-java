package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.util.ArrayUtil;
import com.util.RandomUtil;

/**
 * Given two arrays, write a function to compute their intersection.
 * 
 * @see http://www.programcreek.com/2015/05/leetcode-intersection-of-two-arrays-
 *      java/
 * @author tony
 *
 */
public class IntersectionOfTwoArrays {

	protected static final Logger log = LoggerFactory.getLogger(IntersectionOfTwoArrays.class);
	
	public static void main(String[] args) {
		
		IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
		
		int size = 500, seed = 5000;
		int[] a = RandomUtil.getRandomIntNoDuplicate(size, seed);
		int[] b = RandomUtil.getRandomIntNoDuplicate(size, seed);
		
		long t = System.currentTimeMillis();
		int[] intersection1 = intersectionOfTwoArrays.intersection(a, b);
		log.info("elapsed time:{}, intersection1:{}", (System.currentTimeMillis() - t), ArrayUtil.join(intersection1, ","));
		
		t = System.currentTimeMillis();
		int[] intersection2 = intersectionOfTwoArrays.intersection2(a, b);
		log.info("elapsed time:{}, intersection2:{}", (System.currentTimeMillis() - t), ArrayUtil.join(intersection2, ","));
		
		
	}

	/**
	 * Java Solution 1 - HashSet
	 * Time = O(n).
	 * Space = O(n).
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i : nums1) {
			set1.add(i);
		}

		HashSet<Integer> set2 = new HashSet<Integer>();
		for (int i : nums2) {
			set2.add(i);
		}

		Iterator<Integer> iter = set1.iterator();
		while (iter.hasNext()) {
			int i = iter.next();
			if (!set2.contains(i)) {
				iter.remove();
			}
		}

		int[] result = new int[set1.size()];
		int i = 0;
		for (int x : set1) {
			result[i++] = x;
		}

		return result;
	}
	
	/**
	 * Java Solution 2 - Binary Search
	 * Time = O(nlog(n)).
	 * Space = O(n).
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersection2(int[] nums1, int[] nums2) {
	    Arrays.sort(nums1);
	    Arrays.sort(nums2);
	 
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for(int i=0; i<nums1.length; i++){
	        if(i==0 || (i>0 && nums1[i]!=nums1[i-1])){
	            if(Arrays.binarySearch(nums2, nums1[i])>-1){
	                list.add(nums1[i]);
	            }
	        }
	    }
	 
	    int[] result = new int[list.size()];
	    int k=0;
	    for(int i: list){
	        result[k++] = i;
	    }
	 
	    return result;
	}
}
