package com.strendent.tutorsu.Models;

public class Model_Drawer_Items {
	private String title;
	private int icon;

	public Model_Drawer_Items(String title, int icon) {
		this.title = title;
		this.icon = icon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}
}
