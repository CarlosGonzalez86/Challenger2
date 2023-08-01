package com.conversor;

public enum Colors {
    BG("#DAF7A6"),
    BLACK("#343a40"),
    BLUE("#C70039"),
    BLACK_OTHER("#adb5bd"),
    BORDER("#C70039"),
    BLUE_OTHER("#C78E00");

    private String color;
	
	
    Colors(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}