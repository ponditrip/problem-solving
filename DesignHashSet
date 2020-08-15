
//https://leetcode.com/explore/featured/card/august-leetcoding-challenge/549/week-1-august-1st-august-7th/3410/

/** All values will be in the range of [0, 1000000].
The number of operations will be in the range of [1, 10000].
Please do not use the built-in HashSet library.
*/

//Solution
/**
 * Maximum possible value to be stored = 1000000 Considering each bit of a
 * number reprsents a number Number of bits in one number(Numbers each number in
 * the array can represent) = 32 Total numbers required = 1000000/32 = 31250 For
 * example: number 0 can be reprsented by idx = 0, bit = 0 i.e. num[0] =
 * 00000000000000000000000000000001 number 37 can be represented by idx =
 * 1(37/32), bit = 5(37%32) ie. num[1] = 00000000000000000000000000100000
 **/
class MyHashSet {
	int num[];

	public MyHashSet() {
		num = new int[31251];
	}

	// set the bit if that element is present
	public void add(int key) {
		num[getIdx(key)] |= getMask(key);
	}

	// unset the bit if a key is not present
	public void remove(int key) {
		num[getIdx(key)] &= (~getMask(key));
	}

	// check if bit corresponding to the key is set or not
	public boolean contains(int key) {
		return (num[getIdx(key)] & getMask(key)) != 0;
	}

	// idx of num[] to which this key belongs
	// for key = 37, it will give 1
	private int getIdx(int key) {
		return (key / 32);
	}

	// get mask representing the bit inside num[idx] that corresponds to given key.
	// for key = 37, it will give 00000000000000000000000000100000
	private int getMask(int key) {
		key %= 32;
		return (1 << key);
	}
}
