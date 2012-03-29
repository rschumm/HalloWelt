package ch.schumm.hallowelt;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.LUDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;

public class Main {
	
	public static void main(String[] args) {
		double[][] matrixData = { {1d,0,0}, {0,1d,0}, {0,0,1d}};
		RealMatrix m = new Array2DRowRealMatrix(matrixData);
		RealMatrix pInverse = new LUDecompositionImpl(m).getSolver().getInverse();
		System.out.println(pInverse);
	}

}
