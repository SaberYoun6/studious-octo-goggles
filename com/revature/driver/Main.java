package com.revature.driver;

import com.revature.model.Art;
import com.revature.model.Digital;
import com.revature.model.Drawing;

public class Main{
	public static void main(String [] args){
		Art myArt = new Art("Sam Young");
		Digital brainChui= new Digital("brain","chui");
		brainChui.professional(true);
		brainChui.mediums("photoShop");
		brainChui.setStyle("Multiply features");
		System.out.println("myArt " + myArt.getArtist());
		System.out.println(brainChui.getFirstName() +" "+ brainChui.getLastName());
		System.out.println(brainChui.artist());
		

	}
}

