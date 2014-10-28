
public class CodingBat {
    public int sum13(int[] nums) {
	int ans = 0;
	for (int i=0;i<nums.length;i++) {
	    if(nums[i] == 13) {
		i = i + 1;
	    }
	    else {
		ans = ans + nums[i];
	    }
	}
	return ans;
    }

    public int[] frontPiece(int[] nums) {
	if(nums.length < 3) {
	    return nums;
	} else {
	    int[] nums2 = new int[2];
	    nums2[0] = nums[0];
	    nums2[1] = nums[1];
	    return nums2;
	}
    }


    

}
