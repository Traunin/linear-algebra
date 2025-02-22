package io.github.alphameo.linear_algebra.mat;

/**
 * Interface for arbitrary matrix.
 */
public interface Matrix {

    /**
     * Returns element at given row index and column index inside matrix.
     * 
     * @param r row index of element
     * @param c column index of element
     * @return element at given position
     */
    float get(int r, int c);

    /**
     * Sets value into given row index and column index inside matrix.
     *
     * @param r     row index for putting value
     * @param c     column index for putting value
     * @param value component value to be put
     */
    void set(int r, int c, float value);

    /**
     * Returns width (column count) of matrix.
     * 
     * @return width of matrix
     */
    int width();

    /**
     * Returns height (row count) of matrix.
     * 
     * @return height of matrix
     */
    int height();
}
