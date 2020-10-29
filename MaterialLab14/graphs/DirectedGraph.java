package graphs;

import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DirectedGraph {

	// NO CAMBIAR estos campos
	private boolean[][] matAdj;
	private int cantEstados;

	// NO CAMBIAR el codigo de este constructor
	public DirectedGraph(boolean[][] adj) throws NotValidGraph{
		this.cantEstados = adj.length;
		for (int i=0; i<adj.length; i++) {
			if (adj[i].length != cantEstados) {
				throw new NotValidGraph(" matriz de adjacencia no cuadrada ");
			}
		}
		this.matAdj = adj;
	}

	public LinkedList<Integer> getAdj(int estado) {
		// ** Agregue aqui su implementacion ** //
		return null;
	}

	public BFSResult bfs(int estado) {
		/** Agregue aqui su implementacion **/
		return null;
	}

	public int[] path(int estadoinicial, int estadofinal) {
		/** Agregue aqui su implementacion **/
		return null;
	}

	// NO CAMBIAR ESTE CODIGO
	public String toString() {
		String s = "";
		for (int i=0; i<matAdj.length; i++) {
			s += ("Estado " + i + " adjacencias: ");
			for (int j=0; j<matAdj[i].length; j++) {
				if (matAdj[i][j]) s+= (j + " ");
			}
			s += "\n";
		}
		return s;
	}
}

class NotValidGraph extends Exception {
	public NotValidGraph(String msg) {
		super(msg);
	}
}
