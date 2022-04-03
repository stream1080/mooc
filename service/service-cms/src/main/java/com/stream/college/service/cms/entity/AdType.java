package com.stream.college.service.cms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.stream.college.common.utils.model.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author stream
 * @since 2022/4/3 15:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("cms_ad_type")
@ApiModel(value = "AdType对象", description = "推荐位")
public class AdType extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "标题")
    private String title;


}
