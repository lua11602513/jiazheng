
package java08;
class CBox{
	int length;
	int width;
	int height;
	void volume() {
		System.out.println("volume=" + length*width*height);
	}
	void surfaceArea() {
		System.out.println("surfaceArea=" + (length*width + width*height + height*length)*2);
	}
	void showData() {
		System.out.println("length=" + length);
		System.out.println("width=" + width);
		System.out.println("height=" + height);
	}
	void showAll() {
		showData();
		surfaceArea();
		volume();
	}
}
public class java05 {
	public static void main(String[] args) {
		CBox box;
		box = new CBox();
		box.length = 1;
		box.width = 2;
		box.height = 3;
		box.showAll();
	}

}
