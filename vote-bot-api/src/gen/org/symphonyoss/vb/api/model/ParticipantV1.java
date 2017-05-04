/*
 * Vote Bot API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.symphonyoss.vb.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.symphonyoss.vb.api.model.SymUserV1;
import javax.validation.constraints.*;

/**
 * ParticipantV1
 */

public class ParticipantV1   {
  @JsonProperty("symUser")
  private SymUserV1 symUser = null;

  @JsonProperty("voteCast")
  private Boolean voteCast = null;

  public ParticipantV1 symUser(SymUserV1 symUser) {
    this.symUser = symUser;
    return this;
  }

   /**
   * Get symUser
   * @return symUser
  **/
  @JsonProperty("symUser")
  @ApiModelProperty(value = "")
  public SymUserV1 getSymUser() {
    return symUser;
  }

  public void setSymUser(SymUserV1 symUser) {
    this.symUser = symUser;
  }

  public ParticipantV1 voteCast(Boolean voteCast) {
    this.voteCast = voteCast;
    return this;
  }

   /**
   * Get voteCast
   * @return voteCast
  **/
  @JsonProperty("voteCast")
  @ApiModelProperty(value = "")
  public Boolean getVoteCast() {
    return voteCast;
  }

  public void setVoteCast(Boolean voteCast) {
    this.voteCast = voteCast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantV1 participantV1 = (ParticipantV1) o;
    return Objects.equals(this.symUser, participantV1.symUser) &&
        Objects.equals(this.voteCast, participantV1.voteCast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symUser, voteCast);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantV1 {\n");
    
    sb.append("    symUser: ").append(toIndentedString(symUser)).append("\n");
    sb.append("    voteCast: ").append(toIndentedString(voteCast)).append("\n");
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

