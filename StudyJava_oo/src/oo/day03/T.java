package oo.day03;

public class T extends Tetromino {
//	Cell cells=new Cell();
	public T() {
		this(0, 0);
	}

	public T(int row, int col) {
		super();//���ø�����޲ι���
		super.cells[0] = new Cell(row, col);
		cells[1] = new Cell(row, col + 1);
		cells[2] = new Cell(row + 1, col + 1);
		cells[3] = new Cell(row, col + 2);

	}

}