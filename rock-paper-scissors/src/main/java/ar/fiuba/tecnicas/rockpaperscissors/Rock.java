package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {

	public Object vs(Scissors scissors) {
		return this;
	}

	public Object vs(Paper paper) {
		return paper;
	}

	public Object vs(Rock rock) {
		return this;
	}

}
