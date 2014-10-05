package com.example.colortheme;

import android.graphics.Color;
import java.util.Random;

public class rColor {
	public static int getRColor()
	{
		//Color rColor = new Color();
		
		Random rand = new Random();
		
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		
		//rColor.rgb(r, g, b);
		
		//return rColor;
		
		
	

	        r = (r << 16) & 0x00FF0000;
	        g = (g << 8) & 0x0000FF00;
	        b = b & 0x000000FF;

	        return 0xFF000000 | r | g | b;
	    
	}

}
