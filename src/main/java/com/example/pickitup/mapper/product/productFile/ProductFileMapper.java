package com.example.pickitup.mapper.product.productFile;

import com.example.pickitup.domain.vo.product.productFile.ProductFileVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ProductFileMapper {
    //    해당 후기글 기본키로 file 객체 가져오기
    public List<ProductFileVO> findProjectReviewNum(Long productNum);

    //    해당 후기글에 작성 도중에 창을 닫는 경우 저장 경로에서 사진 지우기
    public  List<ProductFileVO> getOldFiles();

    //    사진 입력
    public void insert(ProductFileVO productFileVO);

    //    사진 삭제(후기 수정시에 호출)
    public void delete(Long projectReviewNum);
}
