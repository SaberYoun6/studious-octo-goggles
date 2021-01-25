package com.revature.model;

public class Drawing extends Art{
	private String artist;
	private String style;
	private String medium;
	private String description;
	private String works;

	public Drawing(){
		super();
	}
	public Drawing(String artist){
		this();
		this.artist = artist;
	}
	public Drawing (String artist,String style,String medium){
		this(artist);
		this.style = style;
		this.medium = medium;
	}
	public Drawing(String artist, String style, String medium, String description){
		this(artist, style, medium);
		this.description = description;
	}
	public Drawing(String artist, String style, String medium, String description, String works){
		this(artist,style,medium,description);
		this.works= works;
	}
	public String artist(String artist){
		return" This artist does draw" + artist;
	}
	public String mediums(String medium){
		return "This artist does draws in this " + medium;
	}
	public String style(String style){
		return "artist" + style; 
	}
	public String descriptionImages(String description){
		return description;
	}
	public String works(String works){
		return works;
	}
	public String combinedDrawing(String artist, String medium, String style, String description, String works){
		return "Artisted name " + artist + "the style is "+  style + "the medium of choise " +  medium + "one of there" + works + "this description of the work is going to be " + description;
	}


}

