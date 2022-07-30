package dbProject;


public class BookTest {

	public static void main(String[] args) {
		// BookDTO dto = new BookDTO(args[0],args[1],args[2],Integer.parseInt(args[3]),Integer.parseInt(args[4]),args[5]);
		BookDAO dao = new BookDAO();
		//int insertRows = dao.insertBook(dto);
		// System.out.println(insertRows); */

		//select
		 BookDTO[] arr = dao.selectBook();
		for (BookDTO dto : arr) {
			if (dto != null) {
				System.out.println(dto);
			} // if end

		} // for end 
	}// main end
}// class end
