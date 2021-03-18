package com.callor.var;

public class Varriable_16 {

	public static void main(String[] args) {

		int intDan1 = 3;
		int intNum1 = 1;
		
		for ( ; intNum1 < 9 ;) {
			System.out.printf("%d x %d = %3d\n",intDan1,intNum1 + 1,intDan1 * (++intNum1));
		}
		
		int intDan = 3;
		int intNum = 1;
				
		System.out.println("================");
		System.out.printf("%d x %d = %3d\n",intDan,++intNum,intDan * (intNum));
		System.out.printf("%d x %d = %3d\n",intDan,++intNum,intDan * (intNum));
		System.out.printf("%d x %d = %3d\n",intDan,++intNum,intDan * (intNum));
		System.out.printf("%d x %d = %3d\n",intDan,++intNum,intDan * (intNum));
		System.out.printf("%d x %d = %3d\n",intDan,++intNum,intDan * (intNum));
		System.out.printf("%d x %d = %3d\n",intDan,++intNum,intDan * (intNum));
		System.out.printf("%d x %d = %3d\n",intDan,++intNum,intDan * (intNum));
		System.out.printf("%d x %d = %3d\n",intDan,++intNum,intDan * (intNum));
		
//		System.out.printf("%d x %d = %3d\n",intDan,intNum+=1,intDan * (intNum));
//		System.out.printf("%d x %d = %3d\n",intDan,intNum+=1,intDan * (intNum));
//		System.out.printf("%d x %d = %3d\n",intDan,intNum+=1,intDan * (intNum));
//		System.out.printf("%d x %d = %3d\n",intDan,intNum+=1,intDan * (intNum));
//		System.out.printf("%d x %d = %3d\n",intDan,intNum+=1,intDan * (intNum));
//		System.out.printf("%d x %d = %3d\n",intDan,intNum+=1,intDan * (intNum));
//		
		System.out.println("------------------");
		System.out.printf("%d x %d = %3d\n",intDan,intNum += 1,intDan * (++intNum));
		System.out.printf("%d x %d = %3d\n",intDan,intNum += 1,intDan * (++intNum));
		System.out.printf("%d x %d = %3d\n",intDan,intNum += 1,intDan * (intNum++));
		
		
		
		
	}

}
