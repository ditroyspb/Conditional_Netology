package ru.netology.springbootconditional.service;

//@RestController
public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}