package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/02/28.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@RefreshScope
public class Greeting {
    private String greeting;
}
