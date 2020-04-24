package com.mafengwo.demo.heroDemo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author chenminrui
 * @date 2020-04-10 6:16 下午
 */
@Data
@AllArgsConstructor
public class HeroDto {
    private int id;
    private String name;
    private List<String> zhh;
}
