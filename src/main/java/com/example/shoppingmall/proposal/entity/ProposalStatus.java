package com.example.shoppingmall.proposal.entity;

import lombok.Getter;

@Getter
public enum ProposalStatus {
  WAITING("대기"),
  ACCEPTED("수락"),
  DENIED("거절");

  private String proposalStatus;

  ProposalStatus(String proposalStatus) {
    this.proposalStatus = proposalStatus;
  }
}