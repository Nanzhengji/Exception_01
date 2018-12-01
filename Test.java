package ExceptionDemo1;
/**
 * 设计一个相除的方法,要求必须打印开始计算和计算结束,有异常时抛出自定义的异常
 * 
 * */
public class Test {

	public static void div(int a,int b) throws MyException {
		int c ;
		try{
			c = a / b;
			System.out.println(c);
		}catch(Exception e) {
			//有异常不处理,抛给方法调用处
			throw new MyException("出现异常,除数为零");
		}finally {
			System.out.println("计算结束-----------");
		}
	}
	public static void main(String[] args) {
		System.out.println("计算开始-----------");
		try {
			div(10,0);
		} catch (Exception e) {//主方法一般不再向外抛出异常,直接用catch处理异常
			e.printStackTrace();
		}
	}

}
