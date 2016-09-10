package game.graphics;

public class Sprite
{
	private int x;
	private int y;
	private int width;
	private int height;
	
	private int[] pixels;

	public static Sprite aaa = new Sprite(SpriteSheet.spriteSheet, 0, 0, 16, 16);

	public Sprite(SpriteSheet sheet, int x, int y, int width, int height)
	{
		pixels = new int[width * height];
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				pixels[i * width + j] = sheet.getPixels()[x + (i + y) * sheet.getSize() + j];
				pixels[0] = sheet.getPixels()[0];
			}
		}
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int[] getPixels()
	{
		return pixels;
	}
	
	public int getPixel(int i)
	{
		return pixels[i];
	}
}
