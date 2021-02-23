package com.dailycodeBuffere.Userservice.vo;


import com.dailycodeBuffere.Userservice.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private  Department department;

}
