package com.ctrip.framework.apollo.use.cases.spring.boot.starter.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Service;
import com.ctrip.framework.apollo.use.cases.spring.boot.starter.dubbo.api.AnotherDemoService;

@Service
public class AnotherDemoServiceImpl implements AnotherDemoService {

  @Override
  public String sayHello(String name) {
    return "Hello another " + name;
  }
}
