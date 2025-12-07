package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.example.beans")
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfigUsingComponent {



}
