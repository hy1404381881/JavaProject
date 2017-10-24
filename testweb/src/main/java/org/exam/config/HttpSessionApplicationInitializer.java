package org.exam.config;

import org.springframework.core.annotation.Order;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;
/**
 * Created by xin on 15/1/23.
 */
@Order(99)
public class HttpSessionApplicationInitializer extends AbstractHttpSessionApplicationInitializer {
}
