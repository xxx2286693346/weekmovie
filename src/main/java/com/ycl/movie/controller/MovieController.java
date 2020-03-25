package com.ycl.movie.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ycl.movie.domain.Movie;
import com.ycl.movie.service.MovieService;

@Controller
public class MovieController {
	
	@Resource
	private MovieService movieService;
	
	@RequestMapping("list")
	public String list(Model model,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "time")String zd,@RequestParam(defaultValue = "asc")String zhi ) {
		System.out.println(zd);
		System.out.println(zhi);
		PageHelper.startPage(pageNum, 3);
		List<Movie> moList=movieService.molist(zd,zhi);
		PageInfo info = new PageInfo(moList);
		model.addAttribute("zd", zd);
		model.addAttribute("zhi", zhi);
		model.addAttribute("info", info);
		model.addAttribute("moList", moList);
		return "list";
	}
	
	@ResponseBody
	@PostMapping("dele")
	public Object delete(String zhi) {
		System.out.println("进入删除页面");
		System.out.println(zhi);
		boolean i= movieService.deletMovie(zhi);
		return i;
	}
	
	
	@RequestMapping("like")
	public String like() {
		return "like";
	}
	
	@PostMapping("likelist")
	public String likelist (Model model,String mname,String time
			,String time2
			,String dao
			,String price
			,String price2
			,String nd
			,String longtime
			,String longtime2
			) {
		System.out.println(mname);
		List<Movie> list= movieService.likelist(mname,time,time2,dao,price,price2,nd,longtime,longtime2);
		model.addAttribute("moList", list);
		System.out.println("数组内容"+list);
		int size = list.size();
		System.out.println("数组的长度"+size);
		return "list2";
	}
	
	
	@RequestMapping("xj")
	public String xj(Integer id) {
		movieService.updateMovieXj(id);
		return "redirect:/list";
	}
	
	@RequestMapping("sj")
	public String sj(Integer id) {
		movieService.updateMovieSj(id);
		return "redirect:/list";
	}
	
	
	@RequestMapping("listli")
	public String list2() {
		return "redirect:/likelist";
	}
}
