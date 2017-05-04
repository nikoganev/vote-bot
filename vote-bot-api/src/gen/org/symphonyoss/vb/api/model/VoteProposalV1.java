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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.symphonyoss.vb.api.model.ParticipantV1;
import org.symphonyoss.vb.api.model.ProposalV1;
import org.symphonyoss.vb.api.model.VoteCommentV1;
import javax.validation.constraints.*;

/**
 * Voting proposal 
 */
@ApiModel(description = "Voting proposal ")

public class VoteProposalV1   {
  @JsonProperty("participants")
  private List<ParticipantV1> participants = new ArrayList<ParticipantV1>();

  @JsonProperty("abstain")
  private Integer abstain = null;

  @JsonProperty("yea")
  private Integer yea = null;

  @JsonProperty("nay")
  private Integer nay = null;

  @JsonProperty("completed")
  private Boolean completed = null;

  @JsonProperty("comments")
  private List<VoteCommentV1> comments = new ArrayList<VoteCommentV1>();

  @JsonProperty("approvalPercentage")
  private Integer approvalPercentage = null;

  @JsonProperty("reminderFrequency")
  private Long reminderFrequency = null;

  @JsonProperty("totalCast")
  private Long totalCast = null;

  @JsonProperty("proposal")
  private ProposalV1 proposal = null;

  /**
   * Gets or Sets result
   */
  public enum ResultEnum {
    ACTIVE("ACTIVE"),
    
    APPROVED("APPROVED"),
    
    COMPLETE("COMPLETE"),
    
    FAILED("FAILED"),
    
    TIE("TIE");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResultEnum fromValue(String text) {
      for (ResultEnum b : ResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("result")
  private ResultEnum result = ResultEnum.ACTIVE;

  public VoteProposalV1 participants(List<ParticipantV1> participants) {
    this.participants = participants;
    return this;
  }

  public VoteProposalV1 addParticipantsItem(ParticipantV1 participantsItem) {
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * Get participants
   * @return participants
  **/
  @JsonProperty("participants")
  @ApiModelProperty(value = "")
  public List<ParticipantV1> getParticipants() {
    return participants;
  }

  public void setParticipants(List<ParticipantV1> participants) {
    this.participants = participants;
  }

  public VoteProposalV1 abstain(Integer abstain) {
    this.abstain = abstain;
    return this;
  }

   /**
   * Get abstain
   * @return abstain
  **/
  @JsonProperty("abstain")
  @ApiModelProperty(value = "")
  public Integer getAbstain() {
    return abstain;
  }

  public void setAbstain(Integer abstain) {
    this.abstain = abstain;
  }

  public VoteProposalV1 yea(Integer yea) {
    this.yea = yea;
    return this;
  }

   /**
   * Get yea
   * @return yea
  **/
  @JsonProperty("yea")
  @ApiModelProperty(value = "")
  public Integer getYea() {
    return yea;
  }

  public void setYea(Integer yea) {
    this.yea = yea;
  }

  public VoteProposalV1 nay(Integer nay) {
    this.nay = nay;
    return this;
  }

   /**
   * Get nay
   * @return nay
  **/
  @JsonProperty("nay")
  @ApiModelProperty(value = "")
  public Integer getNay() {
    return nay;
  }

  public void setNay(Integer nay) {
    this.nay = nay;
  }

  public VoteProposalV1 completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @JsonProperty("completed")
  @ApiModelProperty(value = "")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public VoteProposalV1 comments(List<VoteCommentV1> comments) {
    this.comments = comments;
    return this;
  }

  public VoteProposalV1 addCommentsItem(VoteCommentV1 commentsItem) {
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @JsonProperty("comments")
  @ApiModelProperty(value = "")
  public List<VoteCommentV1> getComments() {
    return comments;
  }

  public void setComments(List<VoteCommentV1> comments) {
    this.comments = comments;
  }

  public VoteProposalV1 approvalPercentage(Integer approvalPercentage) {
    this.approvalPercentage = approvalPercentage;
    return this;
  }

   /**
   * Get approvalPercentage
   * @return approvalPercentage
  **/
  @JsonProperty("approvalPercentage")
  @ApiModelProperty(value = "")
  public Integer getApprovalPercentage() {
    return approvalPercentage;
  }

  public void setApprovalPercentage(Integer approvalPercentage) {
    this.approvalPercentage = approvalPercentage;
  }

  public VoteProposalV1 reminderFrequency(Long reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
    return this;
  }

   /**
   * Get reminderFrequency
   * @return reminderFrequency
  **/
  @JsonProperty("reminderFrequency")
  @ApiModelProperty(value = "")
  public Long getReminderFrequency() {
    return reminderFrequency;
  }

  public void setReminderFrequency(Long reminderFrequency) {
    this.reminderFrequency = reminderFrequency;
  }

  public VoteProposalV1 totalCast(Long totalCast) {
    this.totalCast = totalCast;
    return this;
  }

   /**
   * Get totalCast
   * @return totalCast
  **/
  @JsonProperty("totalCast")
  @ApiModelProperty(value = "")
  public Long getTotalCast() {
    return totalCast;
  }

  public void setTotalCast(Long totalCast) {
    this.totalCast = totalCast;
  }

  public VoteProposalV1 proposal(ProposalV1 proposal) {
    this.proposal = proposal;
    return this;
  }

   /**
   * Get proposal
   * @return proposal
  **/
  @JsonProperty("proposal")
  @ApiModelProperty(value = "")
  public ProposalV1 getProposal() {
    return proposal;
  }

  public void setProposal(ProposalV1 proposal) {
    this.proposal = proposal;
  }

  public VoteProposalV1 result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @JsonProperty("result")
  @ApiModelProperty(value = "")
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoteProposalV1 voteProposalV1 = (VoteProposalV1) o;
    return Objects.equals(this.participants, voteProposalV1.participants) &&
        Objects.equals(this.abstain, voteProposalV1.abstain) &&
        Objects.equals(this.yea, voteProposalV1.yea) &&
        Objects.equals(this.nay, voteProposalV1.nay) &&
        Objects.equals(this.completed, voteProposalV1.completed) &&
        Objects.equals(this.comments, voteProposalV1.comments) &&
        Objects.equals(this.approvalPercentage, voteProposalV1.approvalPercentage) &&
        Objects.equals(this.reminderFrequency, voteProposalV1.reminderFrequency) &&
        Objects.equals(this.totalCast, voteProposalV1.totalCast) &&
        Objects.equals(this.proposal, voteProposalV1.proposal) &&
        Objects.equals(this.result, voteProposalV1.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participants, abstain, yea, nay, completed, comments, approvalPercentage, reminderFrequency, totalCast, proposal, result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoteProposalV1 {\n");
    
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    abstain: ").append(toIndentedString(abstain)).append("\n");
    sb.append("    yea: ").append(toIndentedString(yea)).append("\n");
    sb.append("    nay: ").append(toIndentedString(nay)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    approvalPercentage: ").append(toIndentedString(approvalPercentage)).append("\n");
    sb.append("    reminderFrequency: ").append(toIndentedString(reminderFrequency)).append("\n");
    sb.append("    totalCast: ").append(toIndentedString(totalCast)).append("\n");
    sb.append("    proposal: ").append(toIndentedString(proposal)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

