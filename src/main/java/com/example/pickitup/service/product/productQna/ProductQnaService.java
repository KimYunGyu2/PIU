package com.example.pickitup.service.product.productQna;

import com.example.pickitup.domain.dao.product.productQna.ProductQnaDAO;
import com.example.pickitup.domain.vo.product.productQna.ProductQnaVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ProductQnaService {

    private  final ProductQnaDAO productQnaDAO;

    // QnA 전체 목록
    public List<ProductQnaVO> getList(Long productNum){
        return productQnaDAO.getList(productNum);
    }

    // QnA 상세보기
    public ProductQnaVO read(Long productNum){
        return productQnaDAO.read(productNum);
    }


    // QnA 등록
    public void register(ProductQnaVO productQnaVO){
        productQnaDAO.register(productQnaVO);
    }

    // QnA 수정
    public boolean update(ProductQnaVO productQnaVO){
        return productQnaDAO.update(productQnaVO);
    }

    // QnA 삭제
    public boolean remove(Long num){
        return productQnaDAO.remove(num);
    }

}
