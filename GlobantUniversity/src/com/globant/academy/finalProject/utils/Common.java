package com.globant.academy.finalProject.utils;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Common {


	public List<String> readFile(String filename) {

		String path = "C:/Users/daniela.pico/eclipse-workspace/GlobantUniversity/src/com/globant/academy/finalProject/resources/";
		List<String> studentsLines = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(path + "" + filename));
			String line;

			while ((line = br.readLine()) != null) {
				studentsLines.add(line);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return studentsLines;
	}

}
