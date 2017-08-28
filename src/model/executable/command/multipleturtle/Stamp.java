package model.executable.command.multipleturtle;

import model.Environment;
import model.turtle.Turtle;

public class Stamp extends MultipleCommand {

	public Stamp() {
		super(0);
	}

	@Override
	protected double turtleExecute(Environment env, Turtle turtle) {
		return turtle.stamp(env.getTurtlePool());
	}

}
