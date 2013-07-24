package tf.manager;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import javax.naming.*;
import javax.naming.ldap.*;
import javax.naming.directory.*;

import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class test {
	public static void main(String args[]) {
		List<String> list = new ArrayList<String>();
		list.add("aaaaa");
		list.add("bbbbb");
		list.add("cccccc");
		
		System.out.println(StringUtils.join(list, ","));
	}
}
