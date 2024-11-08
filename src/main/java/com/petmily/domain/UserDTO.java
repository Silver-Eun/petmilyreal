package com.petmily.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
   
   private String user_id;
   private String user_password;
   private String user_name;
   private String user_email;
   private String user_birthday;
   private String user_phone;
   private String zipcode;
   private String addr;
   private String addr_detail;

}
