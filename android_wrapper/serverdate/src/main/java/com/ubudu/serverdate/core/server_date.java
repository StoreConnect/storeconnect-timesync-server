/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ubudu.serverdate.core;

public class server_date {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected server_date(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(server_date obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        server_date_native_WrapperJNI.delete_server_date(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public server_date(String url, int sample_count, int refresh_rate, http_get_interface http_interface) {
    this(server_date_native_WrapperJNI.new_server_date(url, sample_count, refresh_rate, http_get_interface.getCPtr(http_interface), http_interface), true);
  }

  public long now() {
    return server_date_native_WrapperJNI.server_date_now(swigCPtr, this);
  }

  public void synchronise_date_sync() {
    server_date_native_WrapperJNI.server_date_synchronise_date_sync(swigCPtr, this);
  }

  public void auto_synchronize() {
    server_date_native_WrapperJNI.server_date_auto_synchronize(swigCPtr, this);
  }

  public void offset_amortization_enabled(boolean enabled) {
    server_date_native_WrapperJNI.server_date_offset_amortization_enabled(swigCPtr, this, enabled);
  }

  public void stop_auto_synchronize() {
    server_date_native_WrapperJNI.server_date_stop_auto_synchronize(swigCPtr, this);
  }

  public double get_precision() {
    return server_date_native_WrapperJNI.server_date_get_precision(swigCPtr, this);
  }

  public double get_offset() {
    return server_date_native_WrapperJNI.server_date_get_offset(swigCPtr, this);
  }

}
