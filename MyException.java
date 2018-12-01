package ExceptionDemo1;

public class MyException extends Exception {

	public MyException(String message) {
		super(message);//直接调父类的构造方法即可
	}
	
}
