/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.ubudu.serverdate.core;

public class server_date_native_WrapperJNI {
  public final static native String ERROR_get();
  public final static native void delete_http_get_interface(long jarg1);
  public final static native String http_get_interface_get(long jarg1, http_get_interface jarg1_, String jarg2);
  public final static native long new_http_get_interface();
  public final static native void http_get_interface_director_connect(http_get_interface obj, long cptr, boolean mem_own, boolean weak_global);
  public final static native void http_get_interface_change_ownership(http_get_interface obj, long cptr, boolean take_or_release);
  public final static native long new_server_date(String jarg1, int jarg2, int jarg3, long jarg4, http_get_interface jarg4_);
  public final static native void delete_server_date(long jarg1);
  public final static native long server_date_now(long jarg1, server_date jarg1_);
  public final static native void server_date_synchronise_date_sync(long jarg1, server_date jarg1_);
  public final static native void server_date_auto_synchronize(long jarg1, server_date jarg1_);
  public final static native void server_date_offset_amortization_enabled(long jarg1, server_date jarg1_, boolean jarg2);
  public final static native void server_date_stop_auto_synchronize(long jarg1, server_date jarg1_);
  public final static native double server_date_get_precision(long jarg1, server_date jarg1_);
  public final static native double server_date_get_offset(long jarg1, server_date jarg1_);

  public static String SwigDirector_http_get_interface_get(http_get_interface jself, String url) {
    return jself.get(url);
  }

  private final static native void swig_module_init();
  static {
    swig_module_init();
  }
}