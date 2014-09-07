
public class TestMainClass {

	private static void call() throws Exception{
		throw new Exception();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		    call();
		} catch (Exception e) {
		    System.out.println("An exception was caught at the top level:" + e);
		    System.exit(-1);
		}

	}

}
