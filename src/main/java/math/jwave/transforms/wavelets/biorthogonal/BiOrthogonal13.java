/**
 * JWave is distributed under the MIT License (MIT); this file is part of.
 *
 * Copyright (c) 2008-2015 Christian Scheiblich (cscheiblich@gmail.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package math.jwave.transforms.wavelets.biorthogonal;

import math.jwave.transforms.wavelets.Wavelet;

/**
 * BiOrthogonal Wavelet of type 1.3 - One vanishing moment in wavelet function
 * and three vanishing moments in scaling function.
 * 
 * @author Christian Scheiblich (cscheiblich@gmail.com)
 * @date 16.02.2014 10:31:33
 */
public class BiOrthogonal13 extends Wavelet {

  /**
   * Already orthonormal coefficients taken from Filip Wasilewski's webpage
   * http://wavelets.pybytes.com/wavelet/bior1.3/ Thanks!
   * 
   * @author Christian Scheiblich (cscheiblich@gmail.com)
   * @date 16.02.2014 10:31:33
   */
  public BiOrthogonal13( ) {

    _name = "BiOrthogonal 1/3"; // name of the wavelet

    _transformWavelength = 2; // minimal wavelength of input signal

    _motherWavelength = 6; // wavelength of mother wavelet

    _scalingDeCom = new double[ _motherWavelength ];
    _scalingDeCom[ 0 ] = -0.08838834764831845;
    _scalingDeCom[ 1 ] = 0.08838834764831845;
    _scalingDeCom[ 2 ] = 0.7071067811865476;
    _scalingDeCom[ 3 ] = 0.7071067811865476;
    _scalingDeCom[ 4 ] = 0.08838834764831845;
    _scalingDeCom[ 5 ] = -0.08838834764831845;

    _waveletDeCom = new double[ _motherWavelength ];
    _waveletDeCom[ 0 ] = 0.;
    _waveletDeCom[ 1 ] = 0.;
    _waveletDeCom[ 2 ] = -0.7071067811865476;
    _waveletDeCom[ 3 ] = 0.7071067811865476;
    _waveletDeCom[ 4 ] = 0.;
    _waveletDeCom[ 5 ] = 0.;

    // build all other coefficients from low & high pass decomposition
    _buildBiOrthonormalSpace( );

  } // BiOrthogonal13

} // BiOrthogonal13