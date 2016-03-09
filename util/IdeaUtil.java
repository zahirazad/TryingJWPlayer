package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class IdeaUtil {
	public class IdeaUtils {
		public String getTime() {
			String time = new SimpleDateFormat("yyyyMMddHHmmss")
					.format(new Date());
			return time;

		}
	}
}
