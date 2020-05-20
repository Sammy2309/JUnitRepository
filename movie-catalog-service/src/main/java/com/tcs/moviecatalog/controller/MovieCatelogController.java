/**
 * 
 */
package com.tcs.moviecatalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.moviecatalog.model.MovieCatalogDto;

/**
 * @author Sammy
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatelogController {

	@RequestMapping("/getMovieCatalog")
	public ResponseEntity<MovieCatalogDto> getMovieCatalog(@PathVariable("movieId") String movieId) {
		return null;
	}
}
