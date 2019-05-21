package com.mera.borisgk98.autoshowroom.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * for test
 */
@ApiModel(description = "for test")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-21T12:59:08.940+03:00[Europe/Moscow]")

public class Kek   {
  @JsonProperty("kek")
  private String kek;

  public Kek kek(String kek) {
    this.kek = kek;
    return this;
  }

  /**
   * Get kek
   * @return kek
  */
  @ApiModelProperty(value = "")


  public String getKek() {
    return kek;
  }

  public void setKek(String kek) {
    this.kek = kek;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Kek kek = (Kek) o;
    return Objects.equals(this.kek, kek.kek);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kek);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Kek {\n");
    
    sb.append("    kek: ").append(toIndentedString(kek)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

