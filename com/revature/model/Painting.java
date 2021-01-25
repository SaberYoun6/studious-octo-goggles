package com.revature.model;

public class Painting extends Art {
	protected String artistf;
	protected String artistl;
	protected String medium;
	
	public Painting() {
		super();
	}
	public Painting(String artistf, String artistl) {
		this.artistf = artistf.substring(0,1).toUpperCase().concat(artistf.substring(1));
		this.artistl = artistl.substring(0, 1).toUpperCase().concat(artistl.substring(1));
	}
	public Painting(String artistf, String artistl,String medium) {
		this(artistf,artistl);
		this.medium= medium;
		
	}

}
