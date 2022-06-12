package ch4;

public class IfTest {

	public static void main(String[] args) {
		String name = "이자바"; //이름을 나타내기 적합한 변수타입은 String
		//java, db, algorithm, 시험점수 - 100
		
		int java = (int)(Math.random() * 100) + 1; //소스파일 정수값 변경하면 소스파일 수정- 재저장- 재컴파일- 재실행
		int db = (int)(Math.random() * 100) + 1;
		int algo = (int)(Math.random() * 100) + 1;;
		int sum = java + db + algo;
		int avg = sum / 3;
		double avgDouble = (double)sum / 3;
		
		System.out.println(sum);
		System.out.println(name + " 학생은 자바점수=" + java + ", db점수=" + db + ", 알고리즘점수=" + algo + "입니다.");
		System.out.println(name + "학생은 총점=" + sum + ", 점수평균" + avg + "실수평균=" + avgDouble + "입니다.");
		/* avg = 90이상 100이하 A등급 부여 */
		/* avg = 80이상 90이하 B등급 부여
		 * avg = 70이상 80이하 C등급 부여
		 * avg = 나머지 미수료 부여
		 */
		if(avg >= 90) {
			System.out.println("A등급 부여");
			//93점 이상 a+
			if(avg >= 93 ) {
				System.out.println("A+ 등급 부여");
			}
		}
		else if(avg >= 80 && avg <90 ) {//not
			System.out.println("B등급 부여");
		}
		else if(avg >= 70 && avg <90 ) {//not
			System.out.println("C등급 부여");
		}	
		else {
				System.out.println("미수료 부여");
				
		}		
	}
	}


