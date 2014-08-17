/**
 * JWave - Java implementation of wavelet transform algorithms
 *
 * Copyright 2008-2014 Christian Scheiblich
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at 
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 *
 * This file is part of JWave.
 *
 * @author Christian Scheiblich (cscheiblich@gmail.com)
 * @date 17.08.2014 08:41:55
 *
 */
package math.jwave.transforms.wavelets.other;

import math.jwave.transforms.wavelets.Wavelet;

/**
 * LeGall 5/3 biorthogonal wavelet.
 * 
 * @date 17.08.2014 08:41:55
 * @author Christian Scheiblich (cscheiblich@gmail.com)
 */
public class LeGall53 extends Wavelet {

  /**
   * Constructor setting up the orthonormal Haar wavelet coefficients and the
   * scaling coefficients; normed, due to ||*||_2 -- euclidean norm. See the
   * orthogonal version in class Haar1Orthogonal for more details.
   * 
   * @date 17.08.2014 08:41:55
   * @author Christian Scheiblich (cscheiblich@gmail.com)
   */
  @Deprecated
  public LeGall53( ) {

    _transformWavelength = 2; // minimal wavelength of input signal

    _motherWavelength = 5; // wavelength of mother wavelet

    _scalingDeCom = new double[ _motherWavelength ];
    double sqrt2 = Math.sqrt( 2. );
    _scalingDeCom[ 0 ] = -1. / 8.; // - 1/8
    _scalingDeCom[ 1 ] =  1. / 4.; // + 2/8
    _scalingDeCom[ 2 ] =  3. / 4.; // + 6/8
    _scalingDeCom[ 3 ] =  1. / 4.; // + 2/8
    _scalingDeCom[ 4 ] = -1. / 8.; // - 1/8

    _waveletDeCom = new double[ _motherWavelength ];
    _waveletDeCom[ 0 ] = 0; // 
    _waveletDeCom[ 1 ] = 1. / 2. ; // 
    _waveletDeCom[ 2 ] = 1.; // 
    _waveletDeCom[ 3 ] = 1. / 2.; // 
    _waveletDeCom[ 4 ] = 0; // 
    
    // Copy to reconstruction filters due to orthogonality (orthonormality)!
    _scalingReCon = new double[ _motherWavelength ];
    _waveletReCon = new double[ _motherWavelength ];
    for( int i = 0; i < _motherWavelength; i++ ) {
      _scalingReCon[ i ] = _scalingDeCom[ i ];
      _waveletReCon[ i ] = _waveletDeCom[ i ];
    } // i

  } // LeGall53

} // class