package javaProject1;

class Product {
	String proNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;

	public Product(String proNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		super();
		this.proNo = proNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}

	public String toString() {
		return  proNo +  "\t"+ prdName +  "\t"+ prdPrice +  "\t"+ prdYear +  "\t"+ prdMaker;
	}

}

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product ("001", "노트북", 1200000, 2021, "삼성");
		Product p2 = new Product ("002", "모니터",300000, 2021, "LG");
		Product p3 = new Product ("003", "마우스",3000, 2020, "로지텍");
		
		System.out.println("상품번호"+"\t"+ "상품명"+  "\t"+ "가격"+  "\t"+ "연도"+  "\t"+ "제조사 ");
		System.out.println("------------------------------------");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
