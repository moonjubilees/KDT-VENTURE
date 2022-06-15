package ch5;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 5명 학생의 국어 영어 수학점수를 저장하는 이차원 배열
		
		int scores [][] = new int [3][5];
		System.out.println("총 학생수=" + scores[0].length); // 왜 두 번째는 0이없지? 
		System.out.println("총 과목 갯수=" + scores.length);
		System.out.println("총 점수 갯수=" + scores.length * scores[0].length);
		//배열 최초의 값 출력
		for(int i =0; i<scores.length; i++) {
			for(int j =0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		}//for end
		
		//배열 1-100 난수를 저장 출력
		for(int i =0; i<scores.length; i++) {
			for(int j =0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 100) + 1;
				System.out.print(scores[i][j] + "\t");
			}
			System.out.println();
		System.out.println("========================================");
		//저장 가변 길이 이차원 배열
		char stars[][] = new char [5][]; //뒤에 숫자가 매번 달라지기 때문에 빈 공간으로
		System.out.println("총 라인수=" + stars.length);
		
		for(int j=0; j <stars.length; j++) {
			stars [i] = new char[i+1];
			//System.out.println("1줄 별 갯수=" + scores[i].length);
			for(int j1 =0; j1 < stars [i].length; j1++) {
				stars[i][j1] = '*';
				System.out.println(stars[i][j1]);
			}
		}
	int ar[][] = { {1,2}, {3,4}, {5,6} };
	
	int ar2[][] = { {1,2}, {3,4, 5}, {5,6,7,8} };
		
		}	
	}
}
