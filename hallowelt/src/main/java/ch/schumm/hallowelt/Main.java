package ch.schumm.hallowelt;

import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.LUDecompositionImpl;
import org.apache.commons.math.linear.RealMatrix;

/**
 * @author rschumm
 * Diese Klasse ist bloss HalloWelt und dient dazu, die GitHub Infrastruktur
 * inkl. maven auszuprobieren. 
 */
public class Main {
	
	public static void main(String[] args) {
		RealMatrix pInverse = inverse();
		System.out.println(pInverse);
	}

	public static RealMatrix inverse() {
		double[][] matrixData = { {1d,0,0}, {0,1d,0}, {0,0,1d}};
		RealMatrix m = new Array2DRowRealMatrix(matrixData);
		RealMatrix pInverse = new LUDecompositionImpl(m).getSolver().getInverse();
		return pInverse;
	}

}
