package com.test.io;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class ReadFileData {

	public static void main(String[] args)  throws Exception{
		//String fileData =  FileUtils.readFileToString(new File("C:\\Jan2016\\MavenDemo\\src\\main\\resources\\File.demo"));
		List<String> lines = 	IOUtils.readLines(ReadFileData.class.getResourceAsStream("File.demo"));
		System.out.println(lines);
	}

}
