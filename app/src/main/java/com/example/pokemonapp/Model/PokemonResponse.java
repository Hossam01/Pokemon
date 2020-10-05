package com.example.pokemonapp.Model;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PokemonResponse {

	@SerializedName("next")
	private String next;

	@SerializedName("previous")
	private Object previous;

	@SerializedName("count")
	private int count;

	@SerializedName("results")
	private ArrayList<Pokemon> results;

	public PokemonResponse(String next, Object previous, int count, ArrayList<Pokemon> results) {
		this.next = next;
		this.previous = previous;
		this.count = count;
		this.results = results;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public void setPrevious(Object previous) {
		this.previous = previous;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setResults(ArrayList<Pokemon> results) {
		this.results = results;
	}

	public String getNext(){
		return next;
	}

	public Object getPrevious(){
		return previous;
	}

	public int getCount(){
		return count;
	}

	public ArrayList<Pokemon> getResults(){
		return results;
	}
}