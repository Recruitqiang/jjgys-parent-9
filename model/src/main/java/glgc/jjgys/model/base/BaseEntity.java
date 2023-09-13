package glgc.jjgys.model.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class BaseEntity implements Serializable {

    //@TableId(type = IdType.ASSIGN_UUID)

    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    @TableField("create_time")
    private Date createTime;



    @TableField(exist = false)
    private Map<String,Object> param = new HashMap<>();
}
