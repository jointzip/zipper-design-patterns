package com.athome.designers.leetcode;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:
 * @Date: 2021/7/9 17:17
 * @Description:
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 *方法一： 双重循环暴力破解
 * 时间复杂度  o(n²)
 *
 * 方法二： 最优解
 * 时间复杂度 o(1)
 */
public class top01 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ints = twoSum1(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(target - nums[i] == nums[j]){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * @Author ZhaoPo
     * @Description
     * @Date  2021/7/9
     * @Param    hashmap实现低的复杂度
     * @return int[]
     **/
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();//用来存放已经检验过的数据
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                //如果包含
                return new int[]{map.get(target - nums[i]),  i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
