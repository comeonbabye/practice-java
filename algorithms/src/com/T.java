package com;

public class T {

	public static void main(String[] args) {
		
		
		test1Time();
	}
	
	public static void test1Time() {
		long t = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			test13();
		}
		System.out.println(System.currentTimeMillis() - t);
		
		/*System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		int[] a = test13();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			//System.out.print(" ");
		}*/
	}
	
	final static int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE };

	// Requires positive x
	static int stringSize(int x) {
		for (int i = 0;; i++)
			if (x <= sizeTable[i])
				return i + 1;
	}

	/**
	 * 实现输入一个整数，将整数的每一位分别依次赋予一个数组
	 * 测试反馈这个是最快的
	 */
	public static int[] test13() {
		int number = 2147483647;
		int size = stringSize(number);
		int[] buf = new int[size];
		
		int q = number;
		int m = 0;
		do {
			m = q % 10;
			q = q / 10;
			buf[--size] = m;
		} while(q > 0);
		return buf;
	}
	
	/**
	 * 实现输入一个整数，将整数的每一位分别依次赋予一个数组
	 */
	public static void test12() {
		int number = 2147483647;
		int size = stringSize(number);
		char[] buf = new char[size];
        getChars(number, size, buf);
	}
	
	final static char [] DigitOnes = { 
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			} ;
	final static char[] digits = {
			'0' , '1' , '2' , '3' , '4' , '5' ,
			'6' , '7' , '8' , '9' , 'a' , 'b' ,
			'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
			'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
			'o' , 'p' , 'q' , 'r' , 's' , 't' ,
			'u' , 'v' , 'w' , 'x' , 'y' , 'z'
		    };
	final static char [] DigitTens = {
			'0', '0', '0', '0', '0', '0', '0', '0', '0', '0',
			'1', '1', '1', '1', '1', '1', '1', '1', '1', '1',
			'2', '2', '2', '2', '2', '2', '2', '2', '2', '2',
			'3', '3', '3', '3', '3', '3', '3', '3', '3', '3',
			'4', '4', '4', '4', '4', '4', '4', '4', '4', '4',
			'5', '5', '5', '5', '5', '5', '5', '5', '5', '5',
			'6', '6', '6', '6', '6', '6', '6', '6', '6', '6',
			'7', '7', '7', '7', '7', '7', '7', '7', '7', '7',
			'8', '8', '8', '8', '8', '8', '8', '8', '8', '8',
			'9', '9', '9', '9', '9', '9', '9', '9', '9', '9',
			} ; 
	
	static void getChars(int i, int index, char[] buf) {
        int q, r;
        int charPos = index;
        char sign = 0;

        if (i < 0) { 
            sign = '-';
            i = -i;
        }

        // Generate two digits per iteration
        while (i >= 65536) {
            q = i / 100;
        // really: r = i - (q * 100);
            r = i - ((q << 6) + (q << 5) + (q << 2));
            i = q;
            buf [--charPos] = DigitOnes[r];
            buf [--charPos] = DigitTens[r];
        }

        // Fall thru to fast mode for smaller numbers
        // assert(i <= 65536, i);
        for (;;) { 
            q = (i * 52429) >>> (16+3);
            r = i - ((q << 3) + (q << 1));  // r = i-(q*10) ...
            buf [--charPos] = digits [r];
            i = q;
            if (i == 0) break;
        }
        if (sign != 0) {
            buf [--charPos] = sign;
        }
    }
	
	/**
	 * 实现输入一个整数，将整数的每一位分别依次赋予一个数组
	 */
	public static void test1() {
		int number = 999999999;
		String str = String.valueOf(number);
		char[] a = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			a[i] = str.charAt(i);
		}
	}
	
	
	/**
	 * 求用1,2,5这三个数不同个数组合的和为100的个数.(如100个1是一个组合，5个1加19个5是一个组合)
	 * 总结：主要看多少个5和多少个2，每种5组合对应的2的组合熟练是不一样的，也有一点规律。因为奇数个5不被2整除，偶数个5可以被2整除，找到规律就可以统计出来。
	 * 0个5,50+1种2组合
	 * 1个5,47+1种2组合
	 * 2个5,45+1种2组合
	 * 依次类推
	 */
	public static void test3() {
		int count = 0;
		for(int i=20; i>=0; i--) {
			int tempI = 100 - i * 5;
			int maxJ = tempI / 2;
			for(int j=maxJ; j>=0; j--) {
				int tempJ = tempI - j * 2;
				int maxK = tempJ / 1;
				for(int k=maxK; k>=0; k--) {
					int sum = i*5 + j*2 + k * 1;
					if(sum == 100) {
						System.out.println(i + "*5 + " + j + "*2 + " + k + "*1 == 100");
						count++;
					} else {
						//System.out.println(i + "*5 + " + j + "*2 + " + k + "*1 !=100, sum=" + sum);
					}
				}
			}
		}
		System.out.println("count:" + count);
	}

}
