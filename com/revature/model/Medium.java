package com.revature.model

public class Medium extends Art{
	private String paintChoice;
	private String style;

	public Medium (){
		super();
	}
	public Medium(String style,String paintChoice){
		this();
		setSytle(style);
		setPaintChoice(paintChoice);
	}
	public String getStyle(){
		return style;
	}
	public String getPaintChoice(){
		return paintChoice;
	}
	public void setStyle(String style){
		this.style = style;
	}
	public void setPaintChoice(){
		this.paintChoice=paintChoice;
	}



}

