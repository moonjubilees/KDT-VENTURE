package ch7;

class Product {
	private int code = 100; //private ; 외부에서 내 코드를 수정할 수 없게끔, private은 그 클래스 내부에서만 사용. 
	private String name;
	private double price;
	private int amount;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

	 class ProductTest { //public 이 들어간클래스가 이름이다
		public static void main (String args[]) {
			Product p = new Product();
			System.out.println(p.getCode());
			p.setCode(200);
			System.out.println(p.getCode());
			p.setName("상품명");
			p.setAmount(100);
			System.out.println(p.getName());
			System.out.println(p.getPrice());
			System.out.println(p.getAmount());
			
		} //main end
	} //class end
