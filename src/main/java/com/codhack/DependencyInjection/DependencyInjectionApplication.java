package com.codhack.DependencyInjection;

import com.codhack.DependencyInjection.Controllers.NewsControllerOCP;
import com.codhack.DependencyInjection.Controllers.NewsPaperController;
import com.codhack.DependencyInjection.services.NewsPaper;
import com.codhack.DependencyInjection.services.NewsPaperEnglish;
import com.codhack.DependencyInjection.services.NewsPaperHindi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		// application context
		SpringApplication.run(DependencyInjectionApplication.class, args);

		// dependency injection using without spring
		NewsPaperController newsPaperController=new NewsPaperController();
		newsPaperController.setNewsPaper(new NewsPaper());
		System.out.println(newsPaperController.getNews());

		// used Open closed principle to add additional feature;
		System.out.println("------ Open Closed Principle");
		NewsControllerOCP newsControllerOCP=new NewsControllerOCP();

		System.out.println("-----English Daily");
		newsControllerOCP.setOpenClosedNewSPaperService(new NewsPaperEnglish());
		System.out.println(newsControllerOCP.getNews());

		System.out.println("----- Hindi Daily");
		newsControllerOCP.setOpenClosedNewSPaperService(new NewsPaperHindi());
		System.out.println(newsControllerOCP.getNews());


	}

}
