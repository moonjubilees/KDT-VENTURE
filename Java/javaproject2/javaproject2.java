package javaProject2;

class Book {
	String bookNo, bookTitle, bookAuthor;
	int bookPrice, bookYear;
	String bookPublisher;

	public Book(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear, String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookYear = bookYear;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookPrice + "\t" + bookYear + "\t"
				+ bookPublisher;
	}

}

class Magazine extends Book {

	int month;

	public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookPrice, int bookYear,
			String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookPrice, bookYear, bookPublisher);
		this.month = month;
	}

	@Override
	public String toString() {
		return bookNo + "\t" + bookTitle + "\t" + bookAuthor + "\t" + bookPrice + "\t" + bookYear + "\t" + bookPublisher
				+ "\t" + month;

	}
}
	public class BookTest {

		public static void main(String[] args) {

			System.out.println("도서번호" + "\t" + "도서명" + "\t\t" + "저자" + "\t" + "가격" + "\t" + "발행일" + "\t" + "출판사");
			System.out.println("-------------------------------------------------------");
			Book b1 = new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
			Book b2 = new Book("B002", "자바스크립트", "이몽룡", 30000, 2020, "서울출판사");
			Book b3 = new Book("B003", "HTML/CSS", "성춘향", 18000, 2021, "강남출판사");
			System.out.println(b1);
			System.out.println(b2);
			System.out.println(b3);

			System.out.println("\n");
			System.out.println(
					"잡지번호" + "\t" + "잡지명" + "\t" + "발행인" + "\t" + "가격" + "\t" + "발행연도 " + "\t" + "출판사" + "\t" + "발행월");
			System.out.println("-------------------------------------------------------");
			Magazine m1 = new Magazine("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5);
			Magazine m2 = new Magazine("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7);
			Magazine m3 = new Magazine("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9);
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
		}
	}

