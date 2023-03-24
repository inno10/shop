package com.shop.dto;

import com.shop.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

//상품 저장 이후 상품이미지에 대한 데이터를 전달 하는 역할을 함
@Getter
@Setter
public class ItemImgDto {

    private Long id;

    private String imgName;

    private String originalImgName;

    private String imgUrl;

    private String repImgYn;

    private static ModelMapper modelMapper = new ModelMapper();

    public static ItemImgDto of(ItemImg itemImg) {
        return modelMapper.map(itemImg, ItemImgDto.class);
    }

}
