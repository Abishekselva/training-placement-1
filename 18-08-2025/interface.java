package package_2;
interface play{
	void play();
	default void disp() {
		System.out.println("outdoor");
	}
}
class piyano implements play{
	public void play() {
		System.out.println("cricket");
	}
}
class football implements play{
	public void play() {
		System.out.println("football");
	}
}
public class Main{
	public static void main(String[] args) {
		piyano ob1=new piyano();
		ob1.disp();
		ob1.play();
		football ob2=new football();
		ob2.play();
	}
}
