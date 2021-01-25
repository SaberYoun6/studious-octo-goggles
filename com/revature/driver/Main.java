package com.revature.driver;

import com.revature.model.Art;
import com.revature.model.Digital;
import com.revature.model.Drawing;
import com.revature.model.Painting;

public class Main{
	public static void main(String [] args){
		Art samArt = new Art("sam","young");
		Digital brainChui= new Digital("brain","chui");
		brainChui.professional(true);
		brainChui.setmediums("photoShop");
		brainChui.setStyle("Multiply features");
		System.out.println(samArt.artist());
		System.out.println(brainChui.getFirstName() +" "+ brainChui.getLastName());
		System.out.println(brainChui.artist());
		System.out.printf("%s\n","s" );
		//(Drawing) (myArt.setMedium("Ink"));

	}
}

