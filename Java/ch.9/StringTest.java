package ch9;

//Strin 메소드 활용 실습 (p.469)

/*JAVA API를 사용하여 다음과 같은 결과가 나오도록 빈칸을 채우십시오. 단, 빈칸은 반드시 적절한 메소드를 사용해서 채워져야 합니다.

---------------------------
실행 결과: 
1. 이름: Arnold Alois Schwarzenegger
2. 이름 (대문자): ARNOLD SCHWARZENEGGER
3. 이니셜:  AAS
4. First Name은 arnold이다. (대소문자 구분; T/F):  false
5. First Name은 arnold이다. (대소문자 미구분; T/F):  true
6. Last Name Schwarzenegger의 index 번호 6~13까지 문자열 : zenegger
7. Last Name Schwarzenegger에서 negger 문자열의 위치 : 8 
---------------------------*/

class StringTest {
  public static void main(String[] args) {
	String first = "Arnold";
	String middle = "Alois";
	String last = "Schwarzenegger";
	String initials;
	String firstInit, middleInit, lastInit;

	firstInit =first.substring(0,1); //A
	middleInit = middle.substring(0,1); //A
	lastInit = last.substring(0,1);
	initials = firstInit + middleInit + lastInit;

	System.out.print("1. 이름: ");
	System.out.println(first + " " + middle + " " + last);
	System.out.print("2. 이름 (대문자): ");
	System.out.println(first.toUpperCase() + " " + last.toUpperCase());
	System.out.print("3. 이니셜:  ");
	System.out.println(initials);
			
	System.out.println("4. First Name은 arnold이다. (대소문자 구분; T/F):  " + first.contentEquals("arnold"));
	System.out.println("5. First Name은 arnold이다. (대소문자 미구분; T/F):  " + first.equalsIgnoreCase("arnold"));
	System.out.println(last.length()); //arr.length 
	System.out.println("6. Last Name " + last + "의 index 번호 6~14까지 문자열 : " + last.substring(6,14));
	System.out.println("7. Last Name " + last + "에서 negger 문자열의 위치 : " + last.indexOf("negger"));		
	
	StringBuffer sb1 = new StringBuffer();
	//sb1.append("stringbufferstringbuffer"); //이문장을 추가해서 값을 입력하는 순간 아래 두문장의 값이 달라짐.
	System.out.println(sb1.length()); //입력된 값이 없기때문에  갖고있는 문자열 = 0
	System.out.println(sb1.capacity()); //사용가능한 저장공간 = 16개의 문자 저장가능
  }

  
	}


