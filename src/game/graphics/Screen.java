package game.graphics;

public class Screen
{
	private int width;
	private int height;

	private int[] pixels;

	public Screen(int width, int height)
	{
		this.width = width;
		this.height = height;

		pixels = new int[width * height];
	}

	public void renderSprite(Sprite sprite, int x, int y)
	{
		for (int i = 0; i < sprite.getHeight(); i++)
		{
			for (int j = 0; j < sprite.getWidth(); j++)
			{
				pixels[y * width + x] = sprite.getPixels()[x + (i + y) * sprite.getWidth() + j];
			}
		}
	}

	public int[] getPixels()
	{
		return pixels;
	}
}
