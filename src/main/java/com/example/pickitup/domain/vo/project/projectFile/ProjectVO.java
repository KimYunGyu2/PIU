package com.example.pickitup.domain.vo.project.projectFile;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProjectVO {
    private Long num;
    private String title;
    private String content;
    private String course;
    private String terrain;
    private String point;
    private String approval;
    private String startTime;
    private String endTime;
    private String startAddress;
    private String endAddress;
    private String distance;
    private String qr;
    private String registDate;
    private String updateDate;
    private String status;
    private Long companyNum;
    private Long userNum;


}
