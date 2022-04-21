package cn.zlq.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 17:18 2022/2/25
 * @ Description：
 */
public class test {
	private static int count=0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nextLine = scanner.nextLine();
		System.out.println("请输入指令,end结束");
		String[][] strings = new String[100][];
		while (!nextLine.equals("end")) {
			strings[count] = nextLine.trim().split(" ");
			strings[count] = strings[count];
			count++;
		}
		for (String[] i : strings) {
			System.out.println(i);
		}
	}
}
