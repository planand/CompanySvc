package com.example.companydemo.service.mobile;

import org.springframework.stereotype.Component;

@Component("MP1")
public class MobileProvider1 implements Sim
{
    @Override
    public void calling() {
        System.out.println("MobileProvider1 calling");
    }

    @Override
    public void data() {
        System.out.println("MobileProvider1 data");
    }
}
