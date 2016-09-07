package game.graphics;

public class Sprite
{
	private final int x;
	private final int y;
	private final int width;
	private final int height;
	
	private final int[] pixels;

	public static Sprite test = new Sprite(SpriteSheet.spriteSheet, 0, 0, 16, 16);

	public Sprite(SpriteSheet sheet, int x, int y, int width, int height)
	{
		this.pixels = new int[width * height];
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				pixels[i * width + j] = sheet.getPixels()[x + (i + y) * sheet.getSize() + j];
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
}
