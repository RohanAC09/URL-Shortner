package com.rohan.Service;

import org.springframework.stereotype.Service;

import com.rohan.model.Url;
import com.rohan.model.UrlDto;

@Service
public interface UrlService {
	
	public Url generateShortLink(UrlDto urlDto);
	
	public Url persistShortLink(Url url);
	
	public Url getEncodedUrl(String url);
	
	public void deleteShortLink(Url url);

}
