package cn.zlq.Collections;
import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 16:06 2022/2/23
 * @ Description：
 */
public class Instructions {
		private static int count = 0;
		private static String isChar = "[a-z]{1,10}";
		//按行读取数据
		public String[][] read() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入指令,end结束");
			String[][] strings = new String[100][];
			String nextLine = scanner.nextLine();
			while (!nextLine.equals("end")) {
				strings[count] = nextLine.trim().split(" ");
//				strings[count] = strings[count];
				count++;
				nextLine = scanner.nextLine();
			}
			return strings;
		}
		public static void main(String[] args) {
			Instructions instructions = new Instructions();
			String[][] strings = instructions.read();
			//line标记现在运行到的行数
			int line = 0;
			HashMap<String, Integer> res = new HashMap<>();
			//对应关键字进入不同的case，若不符合，default提示重新输入
			while (line != count) {
				switch (strings[line][0]) {
					case "mov":
						if (strings[line][2].matches(isChar)) {
							res.put(strings[line][1], res.get(strings[line][2]));
						} else {
							res.put(strings[line][1], Integer.parseInt(strings[line][2]));
						}
						break;
					case "inc":
						if (strings[line][1].matches(isChar)) {
							res.put(strings[line][1], res.get(strings[line][1]) + 1);
						}
						break;
					case "dec":
						if (strings[line][1].matches(isChar)) {
							res.put(strings[line][1], res.get(strings[line][1]) - 1);
						}
						break;
					case "jnz":
						if (strings[line][1].matches(isChar)) {
							if (res.get(strings[line][1]) != 0) {
								line = line + Integer.parseInt(strings[line][2]);
								line--;
							}
						}
						break;
					default:
						System.out.println("指令格式错误请重新输入");
						res.clear();
				}
				line++;
			}
			//按照格式输出
			for (Map.Entry<String, Integer> stringIntegerEntry : res.entrySet()) {
				System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
			}
		}
}

