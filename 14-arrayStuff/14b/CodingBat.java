
public class CodingBat {

    public int sum67(int[] nums) {
	int sum = 0;
	boolean add = true;
	for(int i=0; i<nums.length; i++) {
	    if(nums[i] == 6) {
		add = false;
	    }
	    else if(add == false && nums[i] == 7) {
		add = true;
	    }
	    else if(add == true) {
		sum = sum + nums[i];
	    }
	}
	return sum;
    }

    public boolean more14(int[] nums) {
	int one = 0;
	int four = 0;
	for (int i=0;i<nums.length;i++) {
	    if (nums[i] == 1) {
		one = one + 1;
	    }
	    else if (nums[i] == 4) {
		four = four + 1;
	    }
	}
	if (one > four) {
	    return true;
	} else {
	    return false;
	}
    }

    public int[] tenRun(int[] nums) {
	int[] array = new int[nums.length];
	boolean ten = false;
	int n = 0;
	for(int i=0;i<nums.length;i++) {
	    if(nums[i]%10 == 0) {
		ten = true;
		n = nums[i];
		array[i] = nums[i];
	    }
	    else if(ten == true) {
		array[i] = n;
	    }
	    else {
		array[i] = nums[i];
	    }
	}
	return array;
    }

    public boolean tripleUp(int[] nums) {
	int count = 0;
	int n = 0;
	for(int i=0;i<nums.length;i++) {
	    if(count == 0) {
		count = count + 1;
		n = nums[i];
	    }
	    else if(nums[i] == nums[i-1] + 1) {
		count = count + 1;
	    }
	    else {
		count = 1;
		n = nums[i];
	    }
	    if(count >= 3) {
		return true;
	    }
	}
	return false;
    }

    public boolean canBalance(int[] nums) {
	int sum1 = 0;
	int sum2 = 0;
	for(int i=1;i<nums.length;i++) {
	    for(int y=0;y<i;y++) {
		sum1 = sum1 + nums[y];
	    }
	    for(int x=i;x<nums.length;x++) {
		sum2 = sum2 + nums[x];
	    }
	    if(sum1 == sum2) {
		return true;
	    }
	    else {
		sum1 = 0;
		sum2 = 0;
	    }
	}
	return false;
    }

}
