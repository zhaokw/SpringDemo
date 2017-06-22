package pkg;

import org.springframework.stereotype.Component;

public class Message {
		private String message;

		public String getMessage() {
			return message;
		}
		
		public void setMessage(String message) {
			this.message = "Hello USA";
		}
		
}
