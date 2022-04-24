package org.bearfly.controller;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bearfly.util.DevUtil;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bearfly1990
 * @date 2022/4/21
 */
@Log4j2
@Controller
public class MyErrorController extends BasicErrorController {
    public MyErrorController(ServerProperties serverProperties) {
        super(new DefaultErrorAttributes(), serverProperties.getError());
    }

    /**
     * 覆盖默认的Json响应
     */
    @Override
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        // 获取原始的错误信息
        HttpStatus status = getStatus(request);

        Map<String, Object> result = new HashMap<>();
        String code = "400";
        String message = "My ERROR";
        String data = "DATA";


        result.put("code", code);
        result.put("message", message);
        result.put("data", data);

        log.error(DevUtil.traceStr(code, message, data));
        return new ResponseEntity<Map<String, Object>>(result, status);
    }


}
