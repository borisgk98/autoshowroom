package com.mera.borisgk98.autoshowroom.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mera.borisgk98.autoshowroom.server.models.Auto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains information about automobiles&#39; marks
 */
@ApiModel(description = "Contains information about automobiles' marks")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T17:07:29.290+03:00[Europe/Moscow]")
@Entity
public class AutoMark   {
  @JsonProperty("id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("autos")
  @Valid
  @OneToMany(fetch = FetchType.LAZY)
  private List<Auto> autos = null;

  public AutoMark id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AutoMark name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AutoMark autos(List<Auto> autos) {
    this.autos = autos;
    return this;
  }

  public AutoMark addAutosItem(Auto autosItem) {
    if (this.autos == null) {
      this.autos = new ArrayList<>();
    }
    this.autos.add(autosItem);
    return this;
  }

  /**
   * Get autos
   * @return autos
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Auto> getAutos() {
    return autos;
  }

  public void setAutos(List<Auto> autos) {
    this.autos = autos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoMark autoMark = (AutoMark) o;
    return Objects.equals(this.id, autoMark.id) &&
        Objects.equals(this.name, autoMark.name) &&
        Objects.equals(this.autos, autoMark.autos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, autos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoMark {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autos: ").append(toIndentedString(autos)).append("\n");
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

