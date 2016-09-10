package game.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet
{
	private String path;
	private final int SIZE;
	private int[] pixels;
	
	public static SpriteSheet spriteSheet = new SpriteSheet("/newSpriteSheet.png", 256);

	public SpriteSheet(String path, int SIZE)
	{
		this.path = path;
		this.SIZE = SIZE;	

		pixels = new int[SIZE * SIZE];
		
		
		
		load();
		
		
	}

	private void load()
	{
		try
		{
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();

			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public int[] getPixels()
	{
		return pixels;
	}
	
	public int getPixel()
	{
		return pixels.length;
	}
	
	public int getSize()
	{
		return SIZE;
	}
}
