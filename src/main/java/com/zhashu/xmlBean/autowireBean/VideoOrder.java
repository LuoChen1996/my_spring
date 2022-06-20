package com.zhashu.xmlBean.autowireBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoOrder {
    
    private Integer id;
    
    private String no;
    
    private Video video;

    public VideoOrder(Video video) {
        this.video = video;
    }
}
