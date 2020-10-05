package com.example.pokemonapp.Model;

import com.google.gson.annotations.SerializedName;

public class Pokemon {

	@SerializedName("name")
	private String name;

	@SerializedName("url")
	private String url;

	public Pokemon(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName(){
		return name;
	}

	public String getUrl(){
		return url;
	}
}