package com.example.colortheme;

import android.graphics.Color;
import java.util.Random;

public class RandomColor {
	Color rColor;
	public RandomColor()
	{
		rColor = new Color();
		Random rand = new Random();
		
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		
		Color color = new Color();
		color.rgb(r, g, b);
		rColor = color;
	}
	public Color getColor()
	{
		return rColor;
	}

}
