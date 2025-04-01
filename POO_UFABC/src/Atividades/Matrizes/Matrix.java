package Atividades.Matrizes;

public class Matrix {
    private final double[][] cells;
    Matrix(double[][] cells) {
        double[][] copyCells = new double[cells.length][cells[0].length];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                copyCells[i][j] = cells[i][j];
            }
        }
        this.cells = copyCells;
    }

    private double[][] getCells() {
        return cells;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                string += String.format("%10.6f",getCells()[i][j]);
            }
            string += ("\n");
        }
        return string;
    }

    double[][] toArray() {
        double[][] newArray = new double[getRows()][getColumns()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                newArray[i][j] = getCells()[i][j];
            }
        }
        return newArray;
    }

    int getRows() {
        return getCells().length;
    }

    int getColumns() {
        return  getCells()[0].length;
    }

    double getAt(int a, int b) {
        if (getRows() < a && getColumns() > b) {
            throw new IllegalArgumentException("Número de colunas ou de linhas exede o limite da matriz");
        } else {
            return getCells()[a][b];
        }
    }

    Matrix plus(Matrix matrix) {
        if ((getRows()!= matrix.getRows())
                && getColumns() != matrix.getColumns()){
            throw new IllegalArgumentException("Matrizes são incompatíveis.");
        } else {
            double[][] newCells = new double[getRows()][getColumns()];
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < getColumns(); j++) {
                    newCells[i][j] = getCells()[i][j] + matrix.cells[i][j];
                }
            }
            return new Matrix(newCells);
        }
    }

    Matrix minus(Matrix matrix) {
        if ((getRows()!= matrix.getRows())
                && getColumns() != matrix.getColumns()){
            throw new IllegalArgumentException();
        } else {
            double[][] newCells = new double[getRows()][getColumns()];
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < getColumns(); j++) {
                    newCells[i][j] = getCells()[i][j] - matrix.getCells()[i][j];
                }
            }
            return new Matrix(newCells);
        }
    }

    Matrix times(double e) {
        double[][] newCells = new double[getRows()][getColumns()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                newCells[i][j] = getCells()[i][j] * e;
            }
        }
        return new Matrix(newCells);
    }

    Matrix times(Matrix matrix) {
        if (getColumns() != matrix.getRows()){
            throw new IllegalArgumentException();
        } else {
            double[][] newCells = new double[getRows()][matrix.getColumns()];
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < matrix.getColumns(); j++) {
                    for (int k = 0; k < getColumns(); k++) {
                        newCells[i][j] += getCells()[i][k] * matrix.getCells()[k][j];
                    }
                }
            }
            return new Matrix(newCells);
        }
    }

    Matrix getTranspose() {
        double[][] newCells = new double[getColumns()][getRows()];
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                newCells[j][i] = getCells()[i][j];
            }
        }
        return new Matrix(newCells);
    }

    boolean isSquare() {
        if (getRows() == getColumns()) {
            return true;
        } else {
            return false;
        }
    }

    boolean isSymmetric() {
        if (!isSquare()) {
            return false;boolean isSymmetric() {
        if (!isSquare()) {
            return false;
        } else {
            Matrix transposta = getTranspose();
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < getColumns(); j++) {
                    if(!(transposta.getCells()[i][j] == getCells()[i][j])){
                        return false;
                    }
                }
            }
            return true;
        }
    }
        } else {
            Matrix transposta = getTranspose();
            for (int i = 0; i < getRows(); i++) {
                for (int j = 0; j < getColumns(); j++) {
                    if(!(transposta.getCells()[i][j] == getCells()[i][j])){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
