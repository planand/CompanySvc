package com.example.companydemo.service.mobile;

import org.springframework.stereotype.Component;

@Component("MP2")
public class MoblieProvider2 implements Sim{
    @Override
    public void calling() {
        System.out.println("MobileProvider2 calling");
    }

    @Override
    public void data() {
        System.out.println("MobileProvider2 data");
    }
}
