package com.mafengwo.demo.heroDemo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author chenminrui
 * @date 2020-04-10 5:05 下午
 */
@RestController
public class Hero {

    @GetMapping("/api/getHero")
    public List<HeroDto> getHeros(){
        ArrayList<HeroDto> arr = new ArrayList<>();
        HeroDto heroDto = new HeroDto(100,"mr", new ArrayList<String>(Collections.singleton("nihao")));
        arr.add(heroDto);
        return arr;
    }

    @PostMapping("/api/postHero")
    public HeroDto  postHero(@RequestBody HeroDto heroDto){
        System.out.println(heroDto.getName());
        System.out.println(heroDto.getZhh().toString());
        return heroDto;
    }

    public static void main(String[] args) {
        int  rs = -1 << 29;
        int i = ctlOf(5, 3);
        System.out.println( rs );
        System.out.println(i);
        retry:
        System.out.println("sss");
    }
    private static int ctlOf(int rs, int wc) { return rs | wc; }
}
