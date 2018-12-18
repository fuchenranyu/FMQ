package edu.csuft.fumenhqian.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



/**
 * 程序的入口
 * @author 傅梦芊
 *
 */
public class App {
	//alt+/
	public static void main(String[] args) {
		
		ExecutorService pool=Executors.newFixedThreadPool(8);
		pool=Executors.newCachedThreadPool();
		
		pool=Executors.newSingleThreadScheduledExecutor();
		
		for(int i=1;i<=100;i++)
		{
			pool.submit(new Task(i));
		}
		
				
				//Element t=e.select(".title").first();
				/*String num=e.select(".star span").last().text();
				Elements id=e.select(".em");
				
				//Elements rate=e.select(".rating_num");
				
				//Elements poster=e.select(".poster");
				System.out.println(t.text());
				System.out.println(t.text()+","+num);
				System.out.println(e.id());
				
				//System.out.println(((Object) e).rate());
				//System.out.println(e.poster);
				 */
			}
			

			//System.out.println(title);
			//System.out.println(html);
	
	
		
		
		
		
		
		
		
		
		
	

}
