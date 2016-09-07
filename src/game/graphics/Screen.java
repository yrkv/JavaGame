package game.graphics;

public class Screen
{
	private int width;
	private int height;

	private int[][] pixels;

	public Screen(int width, int height)
	{
		this.width = width;
		this.height = height;

		pixels = new int[width][height];
	}

	public void renderSprite()
	{

	}

	public int[][] getPixels()
	{
		return pixels;
	}
}
