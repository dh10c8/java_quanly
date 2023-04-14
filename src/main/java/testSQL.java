import dao.SinhVienDao;
import model.SinhVienModel;

public class testSQL {
	public static void main(String[] args) {
		SinhVienDao sv = new SinhVienDao();
		SinhVienModel list = sv.getStudentById("2"); 
		
		/*
		 * for (SinhVienModel o : list) { System.out.println(o); }
		 */
	}
}
