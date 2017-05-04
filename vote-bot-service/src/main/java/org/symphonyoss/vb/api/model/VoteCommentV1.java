/*
 *  Copyright 2017 The Symphony Software Foundation
 *
 *  Licensed to The Symphony Software Foundation (SSF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

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
 * VoteCommentV1
 */

public class VoteCommentV1   {
  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("symUser")
  private SymUserV1 symUser = null;

  @JsonProperty("timestamp")
  private Long timestamp = null;

  public VoteCommentV1 comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @JsonProperty("comment")
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public VoteCommentV1 id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VoteCommentV1 symUser(SymUserV1 symUser) {
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

  public VoteCommentV1 timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @JsonProperty("timestamp")
  @ApiModelProperty(value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoteCommentV1 voteCommentV1 = (VoteCommentV1) o;
    return Objects.equals(this.comment, voteCommentV1.comment) &&
        Objects.equals(this.id, voteCommentV1.id) &&
        Objects.equals(this.symUser, voteCommentV1.symUser) &&
        Objects.equals(this.timestamp, voteCommentV1.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id, symUser, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoteCommentV1 {\n");
    
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symUser: ").append(toIndentedString(symUser)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

