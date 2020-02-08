package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunner {

	public static void main(String[] args) {
		Bug bug=new Bug();
		World<Actor> world = new World<Actor>();
	Random rand = new Random();
	int i=rand.nextInt(8)+1;
	int z=rand.nextInt(8)+1;
	bug.setColor(new Color(0,0,250));	
	bug.turn();
	bug.turn();
	world.show();
		world.add(new Location(i,i), bug);
		world.add(new Location(i, i), bug);
		
		world.add(new Location(i,i+1), new Flower());
		world.add(new Location(i,i-1), new Flower());
		for (int x = 0; x<10; x++) {
			for(int y = 0; y<10; y++) {
			world.add(new Location(x, y), new Flower());
		}
	}
		;
		world.add(new Location(i, z),bug);
	}
}
