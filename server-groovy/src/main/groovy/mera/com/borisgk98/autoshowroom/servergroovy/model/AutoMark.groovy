package mera.com.borisgk98.autoshowroom.servergroovy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class AutoMark implements HasId<Integer> {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  public AutoMark id(Integer id) {
    this.id = id;
    return this;
  }


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


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoMark autoMark = (AutoMark) o;
    return Objects.equals(this.id, autoMark.id) &&
        Objects.equals(this.name, autoMark.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoMark {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

