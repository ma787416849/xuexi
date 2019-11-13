package com.xdl.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xdl.bean.EtHello;
import com.xdl.service.EtOccurLogService;
@Controller
public class EtOccurLogController {
	@Autowired
	private EtOccurLogService etolService;
	
	/**
	 * 查询
	 */
    @RequestMapping("/toindex")
    public ModelAndView load() {
    	ModelAndView mav = new ModelAndView();
    	mav.setViewName("index");
    	List<EtHello> list = etolService.findAllEtOccurLog();
    	mav.getModel().put("data", list);
    	return mav;
    }
}
