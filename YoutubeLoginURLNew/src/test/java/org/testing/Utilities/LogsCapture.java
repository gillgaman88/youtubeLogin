package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

	public static void takelog(String className, String message) {
		DOMConfigurator.configure("../YoutubeLoginURLNew/Layout.xml");
		Logger log = Logger.getLogger(className);
        log.info(message);
	}

}
