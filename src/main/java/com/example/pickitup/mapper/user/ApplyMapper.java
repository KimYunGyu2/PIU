package com.example.pickitup.mapper.user;

import com.example.pickitup.domain.vo.project.projectFile.ProjectVO;
import com.example.pickitup.domain.vo.user.ApplyVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplyMapper {
//    내가 신청한 프로젝트 리스트 보이기
    public List<ProjectVO> get(Long userNum);

//    프로젝트 신청하기
    public void insert(ApplyVO applyVO);

// 프로젝트 신청 한개 객체 정보 가져오기
    public ApplyVO getDetail(Long num);

//    프로젝트 시작, 도착 확인 하기 userNum을 로그인 정보로 받아온 후 이 메소드 부를 때 userNum과 approach 같이 넘겨주기
//    approach 1-출발 2-도착
    public boolean update(Long approach, Long userNum);

}
