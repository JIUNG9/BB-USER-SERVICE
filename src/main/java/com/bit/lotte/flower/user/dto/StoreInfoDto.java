package com.bit.lotte.flower.user.dto;

import com.bit.lotte.flower.user.common.valueobject.StoreId;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class StoreInfoDto<ID extends StoreId> {

  private ID key;
  private String storeCode;
  private String storeName;
  private String phoneNumber;
  private String bank;
  private String accountNumber;
  private String averageRating;
  private String totalAmount;
  private Date regDate;

}