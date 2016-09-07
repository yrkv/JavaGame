package game.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet
{
	private String path;
	private final int SIZE;
	private int[][] pixels;

	public SpriteSheet(String path, int SIZE)
	{
		this.path = path;
		this.SIZE = SIZE;

		pixels = new int[SIZE][SIZE];
		
		load();
	}

	private void load()
	{
		try
		{
			BufferedImage image = ImageIO
					.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();

			int[] tempArray = new int[SIZE * this.SIZE];

			for (int i = 0; i < SIZE; i++)
			{
				for (int j = 0; j < SIZE; j++)
				{
					tempArray[i * SIZE + j] = pixels[i][j];
				}
			}

			image.getRGB(0, 0, w, h, tempArray, 0, w);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
