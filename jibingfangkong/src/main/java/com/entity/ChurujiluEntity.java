package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 出入记录
 *
 * @author 
 * @email
 */
@TableName("churujilu")
public class ChurujiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChurujiluEntity() {

	}

	public ChurujiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 类型
     */
    @TableField(value = "churujilu_types")

    private Integer churujiluTypes;


    /**
     * 健康码
     */
    @TableField(value = "churujilu_photo")

    private String churujiluPhoto;


    /**
     * 备注
     */
    @TableField(value = "churujilu_content")

    private String churujiluContent;


    /**
     * 出入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "churu_time")

    private Date churuTime;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：类型
	 */
    public Integer getChurujiluTypes() {
        return churujiluTypes;
    }


    /**
	 * 获取：类型
	 */

    public void setChurujiluTypes(Integer churujiluTypes) {
        this.churujiluTypes = churujiluTypes;
    }
    /**
	 * 设置：健康码
	 */
    public String getChurujiluPhoto() {
        return churujiluPhoto;
    }


    /**
	 * 获取：健康码
	 */

    public void setChurujiluPhoto(String churujiluPhoto) {
        this.churujiluPhoto = churujiluPhoto;
    }
    /**
	 * 设置：备注
	 */
    public String getChurujiluContent() {
        return churujiluContent;
    }


    /**
	 * 获取：备注
	 */

    public void setChurujiluContent(String churujiluContent) {
        this.churujiluContent = churujiluContent;
    }
    /**
	 * 设置：出入时间
	 */
    public Date getChuruTime() {
        return churuTime;
    }


    /**
	 * 获取：出入时间
	 */

    public void setChuruTime(Date churuTime) {
        this.churuTime = churuTime;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Churujilu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", churujiluTypes=" + churujiluTypes +
            ", churujiluPhoto=" + churujiluPhoto +
            ", churujiluContent=" + churujiluContent +
            ", churuTime=" + churuTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
