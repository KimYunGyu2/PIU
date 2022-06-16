package com.example.pickitup.domain.dao.project.projectQna;

import com.example.pickitup.domain.vo.project.projectQna.ProjectQnaVO;
import com.example.pickitup.mapper.project.projectQna.ProjectQnaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor

public class ProjectQnaDAO {

    private final ProjectQnaMapper projectQnaMapper;

    // qna 전체 목록 -> 수정
    public List<ProjectQnaVO> getList(Long projectNum){
        return projectQnaMapper.getList();
    }

    // qna 상세보기 -> 수정
    public ProjectQnaVO read(Long projectNum){
        return projectQnaMapper.getDetail(projectNum);
    }

    // qna 등록
    public void register(ProjectQnaVO projectQnaVO){
        projectQnaMapper.insert(projectQnaVO);
    }

    // qna 수정
    public boolean update(ProjectQnaVO projectQnaVO){
        return projectQnaMapper.update(projectQnaVO);
    }

    // qna 삭제
    public boolean remove(Long num){
        return projectQnaMapper.delete(num);
    }



}
