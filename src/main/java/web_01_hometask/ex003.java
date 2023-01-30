/* Задача 3. Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные
заданному, нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все)
элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */
package web_01_hometask;

import java.util.Arrays;
import java.util.Random;

public class ex003 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        fillRandArray(nums, random);
        System.out.println(Arrays.toString(nums));
        int val = 3;

        System.out.println(Arrays.toString(changeElems(nums, val)));
    }

    static int[] fillRandArray(int[] nums, Random random) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1, 4);
        }
        return nums;
    }

    static int[] changeElems(int[] nums, int val) {
        int r = nums.length - 1;
        for (int l = 0; l <= r; l++) {
            if (nums[l] != val) continue;
            else if (nums[l] == val && nums[r] == val) {
                r--;
                l--;
            } else if (nums[l] == val && nums[r] != val) {
                nums[l] = nums[r];
                nums[r] = val;
                r--;
            }
        }
    return nums;
    }
}
