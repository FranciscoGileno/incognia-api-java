package com.incognia;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PostFeedbackRequestBody {
  FeedbackEvent event;
  Long timestamp;
  String accountId;
  String externalId;
  String installationId;
  String paymentId;
  String loginId;
  String signupId;
}
