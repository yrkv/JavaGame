package game.level.tile;

import game.graphics.Sprite;
import game.graphics.SpriteSheet;

public class BlueBrick extends Tile
{
	public BlueBrick(int x, int y)
	{
		super(x, y);
		sprite = new Sprite(SpriteSheet.spriteSheet, 0, 0, 16, 16);
	}
}
