/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Model for testing reserved words
 */
@ApiModel(description = "Model for testing reserved words")

public class ModelReturn implements Parcelable {
  @SerializedName("return")
  private Integer _return = null;

  public ModelReturn() {
  }
  public ModelReturn _return(Integer _return) {
    this._return = _return;
    return this;
  }

   /**
   * Get _return
   * @return _return
  **/
  @ApiModelProperty(value = "")
  public Integer getReturn() {
    return _return;
  }

  public void setReturn(Integer _return) {
    this._return = _return;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelReturn _return = (ModelReturn) o;
    return Objects.equals(this._return, _return._return);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_return);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelReturn {\n");
    
    sb.append("    _return: ").append(toIndentedString(_return)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    return toIndentedString(o, false);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line). Obfuscate the value, if required.
   */
  private String toIndentedString(java.lang.Object o, boolean isObfuscated) {
    if (o == null) {
      return "null";
    }
    if (isObfuscated) {
      return "***";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public void writeToParcel(Parcel out, int flags) {
    out.writeValue(_return);
  }

  ModelReturn(Parcel in) {
    _return = (Integer)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<ModelReturn> CREATOR = new Parcelable.Creator<ModelReturn>() {
    public ModelReturn createFromParcel(Parcel in) {
      return new ModelReturn(in);
    }
    public ModelReturn[] newArray(int size) {
      return new ModelReturn[size];
    }
  };
}

