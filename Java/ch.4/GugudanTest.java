package ch4;

public class GugudanTest {

	public static void main(String[] args) {
		for (int i = 1; i<=9; i++) {
			for(int dan=2; dan <=9; dan++) {
				if(dan == 5) {
					//System.out.println("->");
					//5단만 출력 생략 = dan 5 경우 반복 수행 무시
					//continue;
					break;
				}
				System.out.print(dan + "*" + i+ "=" + dan *i + "\t");
			
				
				}//inner for end
			System.out.println(); //줄만 바꿔라
			
			
			
		}// outer for end
	} //main end
} //class end
