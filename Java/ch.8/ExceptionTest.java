package ch8;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			//2개 입력변수 필요, 정수변환가능한 입력값이어야 함
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);
			/*System.out.println(second / first );
			IllegalArgumentException e = new IllegalArgumentException ();
			throw e ; //e가 참조하는 예외 객체 강제 발생  */
			throw new IllegalAccessException("매개변수 잘못 지정");
		}
		
		/*catch(ArithmeticException | numberArithmeticException)
			System.out.println("0을 입력하거나 숫자가 아닌 값을 입력하였습니다."); */
		
		catch(ArithmeticException e) {
			System.out.println("0이 아닌 값을 입력하세요"); 
		}
		catch(Exception e) {
			System.out.println("모든 에외 동일 처리"); // 어떤 예외여도 동일하게 처리하고 싶다
		}
		/*catch(ArithmeticException e) { //try- catch는 이어있어야 함
			//first = (int) (Math.random()*100) + 1;
			//args [0] = "100";
			//System.out.println("0이 아닌 값을 입력하세요");
			e.printStackTrace();//예외발생원인, 문장, 메소드 추적
			System.out.println(e.getMessage());
		}
		/*catch(NumberFormatException e) {
			System.out.println("정수 변환 가능 값을 입력하세요"); //정수로 바뀔 수 없는 값을 입력해서 그런거니까
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("입력값은 2개 이상이어야 합니다.");
		}*/
		
		System.out.println("main실행완료"); 

	}

}

