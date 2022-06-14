package ch5;

public class ArrayTest1 {

	public static void main(String[] args) {
		//46개 점수 저장, 이름까지
		
		String names[] = {"이학생", "최신입","김대리","박과장", "최부장"};
		System.out.println("학생수=" + names.length); //학생수=5
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}//for end
		
		int scores[] = new int[names.length];
		
		//1-100 점수 배열 랜덤 저장
		for(int i = 0; i <scores.length; i++) { //46이라고 넣었던 부분을 scores. length로 하면서 코드 수정을 최소화
			scores [i] = (int)(Math.random() * 100) + 1;
			System.out.println(i + ":" + scores [i]+ ",");
		}
		System.out.println();
		System.out.println("점수 총갯수=" + scores.length);
		//총점, 평균
		int sum =0;
		int avg;
		for(int i = 0; i <scores.length; i++) {
			sum = sum + scores[i];
		
		}
		avg = sum /scores.length;
		System.out.println("총점=" + sum);
		System.out.println("평균" + avg);
		
	
		//1등 점수
		int max = 0; //1보다 더 작은 값을 줘야지 비교인식을 함
		String maxName = "";
		
		for(int i=0; i<scores.length; i++) { 
		if (scores[0] >max) {
			max = scores[i];
			maxName = names[i];
			System.out.println(max);
		}//if end
		}// for end
		
		System.out.println("1등점수=" + maxName + ":"+ max); //1등 점수 xxxx : xxx		
		
		//꼴등 점수
		int min = 999; //max는 작은값을 주고, min는 최고값을 주고 시작해야함  101도 괜찮음(100보다 큰수)
		for(int i=0; i<scores.length; i++) {
		if(scores[0] <min) {
			min = scores[i];
			System.out.println(min);
		
		}//if end
		}// for end
		
		System.out.println("꼴등점수=" + min);
	}
}
