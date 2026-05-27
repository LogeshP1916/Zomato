package Com.Zomato_GenericUtility;

import java.time.LocalDateTime;

public class JavaUtility {

	public String localDateAndTime() {
		String date = LocalDateTime.now().toString().replace(":", "").replace("-", "").replace(".", "");
		return date;
	}

//	public static void main(String[] args) {
//		System.out.println(FrameWorkConstants.screenshotPath);
//		System.out.println(FrameWorkConstants.reportsPath);
//	}

}
