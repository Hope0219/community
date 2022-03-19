package com.community.community.controller;

import com.community.community.dto.AccesstokecDTO;
import com.community.community.provider.GithubProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorizeController {

    @Autowired
    private GithubProvider githubProvider;

    @GetMapping("/callback")
    public String callback(@RequestParam(name = "code") String code,
                           @RequestParam(name = "state") String state){
        AccesstokecDTO accesstokecDTO = new AccesstokecDTO();
        accesstokecDTO.setCode(code);
        accesstokecDTO.setClient_id();
        githubProvider.getAccessToken(accesstokecDTO);
        return "index";
    }
}
