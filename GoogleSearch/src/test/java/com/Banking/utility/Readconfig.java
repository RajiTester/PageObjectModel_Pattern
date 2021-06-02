package com.Banking.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {

	public static Properties pro;

	public Readconfig() 
	{
		File file=new File("./Configuration/config.properties");

		try {
			FileInputStream fis=new FileInputStream(file);
			pro=new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


	public String geturl()
	{
		String url=pro.getProperty("baseurl");
		return url;

	}
	public String getusername() {
		String username=pro.getProperty("username");
		return username;

	}
	public String getpassword() {
		String password=pro.getProperty("password");
		return password;

	}
	public String getchromepath() {
		String chromepath=pro.getProperty("chromepath");
		return chromepath;

	}
	public String getfirefoxpath() {
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;

	}


}
