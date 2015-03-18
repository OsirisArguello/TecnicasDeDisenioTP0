package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors {

	public Object vs(Paper paper) {
		return this;
	}

	public Object vs(Rock rock) {
		return rock;
	}

	public Object vs(Scissors scissors) {
		return this;
	}

}
