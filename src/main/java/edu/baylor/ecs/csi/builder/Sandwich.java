package edu.baylor.ecs.csi.builder;

import java.util.ArrayList;
import java.util.List;

/* "Product" */
public class Sandwich {

	public final static boolean FOOTLONG = true;
	public final static boolean SIXINCH = false;
	
	private boolean footlong = false;
	private String bread = "";
	private String meat = "";
	private String cheese = "";
	private List<String> veggies = new ArrayList<String>();
	private List<String> sauce = new ArrayList<String>();
	private List<String> extras = new ArrayList<String>();

	public String getBread() {
		return bread;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public String getCheese() {
		return cheese;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public List<String> getVeggies() {
		return veggies;
	}

	public void setVeggies(List<String> veggies) {
		this.veggies = veggies;
	}

	public List<String> getSauce() {
		return sauce;
	}

	public void setSauce(List<String> sauce) {
		this.sauce = sauce;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	public boolean isFootlong() {
		return footlong;
	}

	public void setFootlong(boolean footlong) {
		this.footlong = footlong;
	}

	@Override
	public String toString() {
		return "Sandwich [footlong=" + footlong + ", bread=" + bread + ", meat=" + meat + ", cheese=" + cheese
				+ ", veggies=" + list2String(veggies) + ", sauce=" + list2String(sauce) + ", extras=" + list2String(extras) + "]";
	}

	private static String list2String(List<String> list) {
		String out = "";
		for (String s : list) {
			out += s + ", ";
		}
		if(out.endsWith(", ")) {
			out = out.substring(0,out.length()-2);
		}
		
		return out;
	}

}