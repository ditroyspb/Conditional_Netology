package ru.netology.springbootconditional.service;

//@RestController
public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}