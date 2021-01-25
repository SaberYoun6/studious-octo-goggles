package com.revature.driver;

import com.revature.model.Art;
import com.revature.model.Digital;
import com.revature.model.Drawing;
import com.revature.model.Painting;

public class Main{
	public static void main(String [] args){
		Art piabloArt = new Art("Piablo","Piccaso");
		Art brainChui = new Digital("brain","chui");
		brainChui.professional(true);
		brainChui.setMedium("photoShop");
		brainChui.setStylized(("Multiply features"));
		System.out.println(piabloArt.artist());
		System.out.println(brainChui.getArtist() +" "+ brainChui.getArtists());
		System.out.println(brainChui.artist());
		Art davinci = new Drawing("leonardo","davinci","Skecthing","Ink");
		System.out.println(davinci.artist());
		System.out.printf("%s\n","s" );


	}
}

