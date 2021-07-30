package leetcode;

/*
 * 1. 两数之和
 */
/*
 * 题目信息
 * <P>
 *
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 *
 *
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 * 提示：
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 * </P>
 */

import org.junit.Test;

import java.util.Arrays;


public class leetcode01 {



        @Test //@Test的使用 是该方法可以不用main方法调用就可以测试出运行结果，是一种测试方法
              //一般函数都需要有main方法调用才能执行，注意被测试的方法必须是public修饰的
    public void test() {
            int[] nums = new int[]{2, 7, 11, 15};
            int target = 9;
            System.out.println(Arrays.toString(twoSum(nums, target)));
        }


        public int[] twoSum(int[] nums, int target) {

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
            /*return 就是跳出方法...
            return null也是跳出方法并返回null..

            也就是说return null必须用在返回值不是void的方法里面..
            return可以用在任何方法里面*/
        }
    }


