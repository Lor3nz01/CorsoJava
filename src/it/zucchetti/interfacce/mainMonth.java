package it.zucchetti.interfacce;

import java.util.ArrayList;
import java.util.Collections;

public class mainMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Month> monthList = new ArrayList<Month>();
		Month m = new Month();
		
		monthList.add(new Month(1,"January"));
		monthList.add(new Month(7,"July"));
		monthList.add(new Month(6,"June"));
		monthList.add(new Month(12,"December"));
		
		Collections.sort(monthList);
		
		for(int i = 0; i < monthList.size(); i++) {
			
		}
		
	}

}
