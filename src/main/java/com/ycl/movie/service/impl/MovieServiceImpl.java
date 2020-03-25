package com.ycl.movie.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ycl.movie.dao.MovieDao;
import com.ycl.movie.domain.Movie;
import com.ycl.movie.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	@Resource
	private MovieDao movieDao;
	
	
	@Override
	public List<Movie> molist(String zd,String zhi) {
		return movieDao.molist(zd,zhi);
	}


	@Override
	public boolean deletMovie(String zhi) {
		try {
			String[] split = zhi.split(",");
			for (String string : split) {
				movieDao.deleteMovie(string);
			}
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}


	@Override
	public List<Movie> likelist(String mname, String time, String time2, String dao, String price, String price2,
			String nd, String longtime, String longtime2) {
		return movieDao.likelist(mname,time,time2,
				dao,price,price2,nd,longtime,longtime2);
	}


	@Override
	public void updateMovieSj(Integer id) {
		movieDao.updateMovieSj(id);
		
	}


	@Override
	public void updateMovieXj(Integer id) {
		movieDao.updateMovieXj(id);
	}

}
