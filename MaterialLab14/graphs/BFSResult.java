package graphs;

import java.util.Arrays;


/**** NO MODIFICAR ESTA CLASE ****/
public class BFSResult {
	public static final byte WHITE = 0;
	public static final byte GRAY = 1;
	public static final byte BLACK = 2;

	private int estado;
	byte[] color;
	int[] distance;
	Integer[] predecessor;

	public BFSResult(int estado, int cantEstados) {
		this.estado = estado;
		color = new byte[cantEstados];
		distance = new int[cantEstados];
		Arrays.fill(distance, -1);
		predecessor = new Integer[cantEstados];
	}

	public int getResultsState() {
		return this.estado;
	}

	public int[] getDistances() {
		return this.distance;
	}
}
