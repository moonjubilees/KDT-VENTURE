package ch4;

public class SwitchTest {

	public static void main(String[] args) {
		String name = "이자바"; //이름을 나타내기 적합한 변수타입은 String
		//jave, db, algorithm, 시험점수 - 100
		
		int java = 100;
		int db = 100;
		int algo = 100;
		int sum = java + db + algo;
		int avg = sum / 3;
		double avgDouble = (double)sum / 3;
		System.out.println(name + " 학생은 자바점수=" + java + ", db점수=" + db + ", 알고리즘점수=" + algo + "입니다.");
		System.out.println(name + "학생은 총점=" + sum + ", 점수평균" + avg + "실수평균=" + avgDouble + "입니다.");
		/* avg = 90이상 100이하 A등급 부여 */
		/* avg = 80이상 90이하 B등급 부여
		 * avg = 70이상 80이하 C등급 부여
		 * avg = 나머지 미수료 부여
		 */
		
		/* avg = 90 A등급 부여
		 * avg = 80 B등급 부여
		 * avg = 70 C등급 부여
		 * avg = 나머지 기타등급 부여
		 */
		int avg10 = avg/ 10;
		
		switch(avg10) {
		case 10:
			//System.out.println("A등급 부여"); //case10이랑 case9는 같은 일을 하고 있음. 
			//break ;
		case 9:
			System.out.println("A등급 부여"); //case10이랑 case9는 같은 일을 하고 있음. 
			break ;
		case 8:
			System.out.println("B등급 부여");
			break ;
		case 7:
			System.out.println("C등급 부여");
			break ;
			
		default : 
			System.out.println("기타등급 부여");
		}//switch end		
	}//main end

	}//class end

//swith(입력변수) { //switch는 if문과 비슷하지만 좀 더 정형화된 조건 판단문이다. 
case 입력값1 : ... //입력변수의 값과 일치하는 case 입력값이 있다면 case문에 속한 문장들 실행
  break;          //case문마다 break 라는 문장이 있는데 해당 case문을 실행한 뒤 swith문을 빠져나가기 위한 것.
case 입력값1 : ...
  break;
...
  default : ...
      break;
}


