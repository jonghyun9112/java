package com.ruby.java.ch12;

import java.io.File;
import java.io.PrintWriter;

public class Test05 {
	
	public static void main(String[] args) {
		try {
			File dir = new File("c:\\work");
			dir.mkdir();
			
			File file = new File(dir, "file1.txt");
			file.createNewFile();
			
			if(dir.isDirectory())
				System.out.println(dir.getName() + "은 디렉토리입니다.");
			if(file.isFile())
				System.out.println(file.getName() + "은 파일입니다.");
			
			if (file.exists()) {
				try(PrintWriter out = new PrintWriter(file)) {
					out.print("hello java!");
					
				}
			System.out.println("파일이름:" + file.getName());	
			System.out.println("파일이름:" + file.getPath());	
			System.out.println("파일이름:" + file.canWrite());	
			System.out.println("파일이름:" + file.canRead());	
			System.out.println("파일이름:" + file.length()+ "바이트");	
			}	
			else {
				System.out.println("작업할 파일이 존재하지 않음");
			}
		File subDir = new File("c:\\work\\subDir");
		subDir.mkdir();
		File file2 = new File(subDir, "aile.txt");
		file2.createNewFile();
		
		String file2pPath = file2.getAbsolutePath();
		System.out.println("절대경로:" + file2pPath);
		
		String parentDir = file2.getParent();
		System.out.println("부모경로:" + parentDir);
		
		File parenFile = file.getParentFile();
		String[] fileNames = parenFile.list();
		System.out.println(parentDir + "목록 >");
		for(String name :fileNames) {
			System.out.println(name);
		}	
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}

}
