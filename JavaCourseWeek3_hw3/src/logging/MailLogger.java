package logging;

public class MailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Mail olarak Logland�: " + message);

	}

}
