package ses;

public class MakeObject {

	public MakeObject() {
	}

	public static Object makeObj(int type) throws IllegalArgumentException {
		{
			if (type == 1)
				throw new IllegalArgumentException("Don't like type" + type);

			return new Object();
		}
	}

}
