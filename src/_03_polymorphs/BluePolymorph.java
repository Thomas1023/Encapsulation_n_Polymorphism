package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class BluePolymorph extends Polymorph{
    
	BluePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
	for(int i =0; i<9;i++)
			g.fillRect(x, y, 200+i, 200-i);
	}
	
}
