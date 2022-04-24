package org.bearfly.learn.spring.annotation.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author bearfly1990
 * @date 2022/4/24
 */
@Data
public class People {
    @Value("bearfly1990")
    private String name;
}
