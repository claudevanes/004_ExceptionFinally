package ses;

public class ExceptionFinally {

	public ExceptionFinally() {

	}

	public static void doTheWork() {

		Object o = null;
		for (int i = 0; i < 5; i++) {

			try{
			o = MakeObject.makeObj(i);
			}
			catch(IllegalArgumentException e){
				System.err.println(e.getMessage());
			} 
			finally{
				System.err.println(".All done.");
			}
			
			System.out.println(o);
		}
	}

}
