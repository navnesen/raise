package no.navnesen;

public class Raise {
	@SuppressWarnings("unchecked")
	private static <T extends Throwable> void raise(Throwable exception, Object __) throws T {
		throw (T) exception;
	}

	public static void raise(Throwable exception) {
		Raise.<RuntimeException>raise(exception, null);
	}
}