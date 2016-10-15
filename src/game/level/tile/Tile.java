package game.level.tile;

import game.graphics.Sprite;

public class Tile
{
	private int x;
	private int y;

	protected Sprite sprite;

	public Tile(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public Sprite getSprite()
	{
		return sprite;
	}
}
