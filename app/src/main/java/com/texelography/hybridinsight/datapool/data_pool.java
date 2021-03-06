/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.texelography.hybridinsight.datapool;

public class data_pool {
  public static DataPoolOBDData get_obd_data_array_element(int i32_element) {
    return new DataPoolOBDData(data_poolJNI.get_obd_data_array_element(i32_element), true);
  }

  public static void set_obd_data_array_element(int element, DataPoolOBDData value) {
    data_poolJNI.set_obd_data_array_element(element, DataPoolOBDData.getCPtr(value), value);
  }

  public static int get_obd_data_array_num_of_elements() {
    return data_poolJNI.get_obd_data_array_num_of_elements();
  }

  public static DataPoolDisplayedElementData get_main_view_elements_of_interest_array_element(int i32_element) {
    return new DataPoolDisplayedElementData(data_poolJNI.get_main_view_elements_of_interest_array_element(i32_element), true);
  }

  public static void set_main_view_elements_of_interest_array_element(int element, DataPoolDisplayedElementData o_value) {
    data_poolJNI.set_main_view_elements_of_interest_array_element(element, DataPoolDisplayedElementData.getCPtr(o_value), o_value);
  }

  public static int get_main_view_elements_of_interest_array_size() {
    return data_poolJNI.get_main_view_elements_of_interest_array_size();
  }

  public static int get_main_view_elements_of_interest_count() {
    return data_poolJNI.get_main_view_elements_of_interest_count();
  }

  public static void set_main_view_elements_of_interest_count(int i32_value) {
    data_poolJNI.set_main_view_elements_of_interest_count(i32_value);
  }

  public static void set_main_view_num_of_cols(int i32_value) {
    data_poolJNI.set_main_view_num_of_cols(i32_value);
  }

  public static int get_main_view_num_of_cols() {
    return data_poolJNI.get_main_view_num_of_cols();
  }

  public static void set_main_view_num_of_rows(int i32_value) {
    data_poolJNI.set_main_view_num_of_rows(i32_value);
  }

  public static int get_main_view_num_of_rows() {
    return data_poolJNI.get_main_view_num_of_rows();
  }

  public static boolean get_read_all_obd_values() {
    return data_poolJNI.get_read_all_obd_values();
  }

  public static int set_read_all_obd_values(boolean value) {
    return data_poolJNI.set_read_all_obd_values(value);
  }

  public static DataPoolOBDReadynessCode get_obd_readyness_code() {
    return new DataPoolOBDReadynessCode(data_poolJNI.get_obd_readyness_code(), true);
  }

  public static void set_obd_readyness_code(DataPoolOBDReadynessCode value) {
    data_poolJNI.set_obd_readyness_code(DataPoolOBDReadynessCode.getCPtr(value), value);
  }

  public static DataPoolIMAState get_ima_state() {
    return new DataPoolIMAState(data_poolJNI.get_ima_state(), true);
  }

  public static void set_ima_state(DataPoolIMAState value) {
    data_poolJNI.set_ima_state(DataPoolIMAState.getCPtr(value), value);
  }

  public static DataPoolOBDDTC get_obd_dtc_array_element(int element) {
    return new DataPoolOBDDTC(data_poolJNI.get_obd_dtc_array_element(element), true);
  }

  public static void set_obd_dtc_array_element(int i32Element, DataPoolOBDDTC value) {
    data_poolJNI.set_obd_dtc_array_element(i32Element, DataPoolOBDDTC.getCPtr(value), value);
  }

  public static int get_obd_dtc_array_num_of_elements() {
    return data_poolJNI.get_obd_dtc_array_num_of_elements();
  }

  public static int get_obd_dtc_count() {
    return data_poolJNI.get_obd_dtc_count();
  }

  public static void set_obd_dtc_count(int value) {
    data_poolJNI.set_obd_dtc_count(value);
  }

}
