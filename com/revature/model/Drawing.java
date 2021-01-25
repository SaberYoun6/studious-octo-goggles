package com.revature.model;

public class Drawing extends Art{
	private String artist;
	private String style;
	private String medium;
	private String description;
	private String works;
	private String artists;

	public String getArtists() {
		return artists;
	}
	public void setArtists(String artists) {
		this.artists = artists.substring(0,1).toUpperCase() + artists.substring(1);
	}
	public Drawing(){
		super(artist,artists,style,medium);
	}
	public Drawing(String artist,String artists){
		this();
	}
	public Drawing (String artist,String artists,String style,String medium){
		this(artist,artists);
		this.style = style;
		this.medium = medium;
	}
	public Drawing(String artist, String artists,String style, String medium, String works){
		this(artist,artists, style, medium);
		this.works= works;
		
	}
	public Drawing(String artist,String artists, String style, String medium, String works, String description){
		this(artist,artists,style,medium,works);
		this.description = description;
	}
	public String artist(){
		return" This artist does draw" + this.artist + this.artists;
	}
	public String mediums(){
		return "This artist does draws in this " + medium;
	}
	public String style(){
		return "artist" + style; 
	}
	public String descriptionImages(){
		return description;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist.toUpperCase().substring(0,1) +  artist.substring(1);
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWorks() {
		return works;
	}
	public void setWorks(String works) {
		this.works = works;
	}
	public String works(String works){
		return works;
	}
	public String combinedDrawing(String artist, String artists, String medium, String style, String description, String works){
		return "Artisted name " + artist + " " + artists + "the style is "+  style + "the medium of choise " +  medium + "one of there" + works + "this description of the work is going to be " + description;
	}


}

