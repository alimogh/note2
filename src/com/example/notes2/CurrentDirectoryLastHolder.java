package com.example.notes2;

public class CurrentDirectoryLastHolder {

	private String currentDir,Last;
	
	public CurrentDirectoryLastHolder(String current, String last) {
this.currentDir=current;
this.Last=last;
	}

	public String getCurrentDir() {
		return currentDir;
	}

	public void setCurrentDir(String currentDir) {
		this.currentDir = currentDir;
	}

	public String getLast() {
		return Last;
	}

	public void setLast(String last) {
		Last = last;
	}
	
	
}
