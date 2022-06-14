package com.example.pickitup.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProjectReviewVO {
    private Long num;
    private String content;
    private String registDate;
    private String updateDate;
    private String status;
    private Long userNum;
    private Long projectNum;

}
