package com.matdang.seatdang.payment.dto;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
public class PayDetail {
    private String partnerOrderId;
    private String partnerUserId;
    private Long shopId;
    private String itemName;
    private Integer quantity;
    private Integer totalAmount;
    private Integer taxFreeAmount; // 상품 비과세 금액
}
