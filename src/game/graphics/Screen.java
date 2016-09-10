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
				pixels[x + (i + y) * width + j] = sprite.getPixels()[i * sprite.getWidth() + j];
			}
		}
	}

	public int[] getPixels()
	{
		return pixels;
	}
}
