package com.example.pickitup.domain.dao.user;

import com.example.pickitup.domain.vo.Criteria;
import com.example.pickitup.domain.vo.user.AdminBoardVO;
import com.example.pickitup.domain.vo.user.UserVO;
import com.example.pickitup.mapper.user.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDAO {

    private final UserMapper userMapper;

//    관리자 공지등록
    public void registerWrite(AdminBoardVO adminBoardVO) {
        userMapper.write(adminBoardVO);
    }

    // 유저 목록(관리자용)
    public List<UserVO> getList(Criteria criteria){
        return userMapper.getList(criteria);
    }

    // 일반 유저 가입
    public void register(UserVO userVO){
        userMapper.insert(userVO);
    }

    // 유저 상세보기
    public UserVO read(Long num){
        return userMapper.getDetail(num);
    }

    // 유저 정보 수정
    public boolean update(UserVO userVO){
        return userMapper.update(userVO);
    }

    // 유저 탈퇴
    public boolean remove(Long num){
        return userMapper.delete(num);
    }

    // 로그인 -> select count-> read() 사용?
}
