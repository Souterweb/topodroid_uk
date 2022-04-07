/* @file IBearingAndClino.java
 *
 * @author marco corvi 
 * @date nov 2013
 *
 * @brief TopoDroid bearing and clino interface
 * --------------------------------------------------------
 *  Copyright This software is distributed under GPL-3.0 or later
 *  See the file COPYING.
 * --------------------------------------------------------
 */
package com.topodroid.DistoX;

interface IBearingAndClino
{
  /**
   * @param b0 bearing
   * @param c0 clino
   * @param o0 orienatation
   * @param a0 accuracy
   */
  void setBearingAndClino( float b0, float c0, int o0, int a0 );

  /** set the JPEG data
   * @param data   JPEG data
   * @return false: the JPEG data are not stored
   */
  default boolean setJpegData( byte[] data ) { return false; }

}
