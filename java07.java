/**
 * 
 */
package java08;
class CTest {
	int x;
	void test(int x) {
		if(x == 0) {
			System.out.println("���Ƭ�0");
		}else if(x%2!=0) {
			System.out.println("���Ƭ��_��");
		}else {
			System.out.println("���Ƭ�����");
		}
	}
}
	public class java07 {
		public static void main(String[] args) {
			CTest s = new CTest();
			System.out.println("test(0)");
			s.test(0);
			System.out.println("test(3)");
			s.test(3);
			System.out.println("test(8)");
			s.test(8);
}
	}