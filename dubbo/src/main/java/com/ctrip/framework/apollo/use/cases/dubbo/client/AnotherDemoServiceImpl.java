package com.ctrip.framework.apollo.use.cases.dubbo.client;

import com.ctrip.framework.apollo.use.cases.dubbo.api.AnotherDemoService;

public class AnotherDemoServiceImpl implements AnotherDemoService {

  @Override
  public String sayHello(String name) {
    return "Hello another " + name;
  }
}
