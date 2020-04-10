package com.bhhan.license.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by hbh5274@gmail.com on 2020-04-10
 * Github : http://github.com/bhhan5274
 */

@Component
public class ServiceConfig {
    @Value("${example.property}")
    private String exampleProperty;

    public String getExampleProperty() {
        return exampleProperty;
    }
}
