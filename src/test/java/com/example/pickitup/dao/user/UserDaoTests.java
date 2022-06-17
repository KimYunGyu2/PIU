package com.example.pickitup.dao.user;

import com.example.pickitup.domain.dao.user.UserDAO;
import com.example.pickitup.domain.vo.user.AdminBoardVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserDaoTests {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void registerWriteTest(){
        AdminBoardVO adminBoardVO = new AdminBoardVO();
        adminBoardVO.setTitle("DAO새로운 공지글 제목");
        adminBoardVO.setContent("DAO새로운 공지글 내용2");
        adminBoardVO.setUserNum(0L);

        userDAO.registerWrite(adminBoardVO);

        log.info("게시글 번호 : " + adminBoardVO.getNum());
    }



}
