package com.mera.borisgk98.autoshowroom.client.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Contains information about automobiles
 */
@ApiModel(description = "Contains information about automobiles")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T17:07:29.290+03:00[Europe/Moscow]")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Auto implements HasId<Integer> {
  @JsonProperty("id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @JsonProperty("mark")
  @OneToOne
  private AutoMark mark = null;

  @JsonProperty("model")
  @OneToOne
  private AutoModel model = null;

  @JsonProperty("options")
  @Valid
  @OneToMany
  private List<AutoOption> options = null;

  public Auto id(Integer id) {
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

  public Auto mark(AutoMark mark) {
    this.mark = mark;
    return this;
  }

  /**
   * Get mark
   * @return mark
  */
  @ApiModelProperty(value = "")


  public AutoMark getMark() {
    return mark;
  }

  public void setMark(AutoMark mark) {
    this.mark = mark;
  }

  public Auto model(AutoModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  @ApiModelProperty(value = "")


  public AutoModel getModel() {
    return model;
  }

  public void setModel(AutoModel model) {
    this.model = model;
  }

  public Auto options(List<AutoOption> options) {
    this.options = options;
    return this;
  }

  public Auto addOptionsItem(AutoOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AutoOption> getOptions() {
    return options;
  }

  public void setOptions(List<AutoOption> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auto auto = (Auto) o;
    return Objects.equals(this.id, auto.id) &&
        Objects.equals(this.mark, auto.mark) &&
        Objects.equals(this.model, auto.model) &&
        Objects.equals(this.options, auto.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mark, model, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auto {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mark: ").append(toIndentedString(mark)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

