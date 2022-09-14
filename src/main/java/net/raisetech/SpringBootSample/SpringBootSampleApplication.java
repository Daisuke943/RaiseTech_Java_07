package net.raisetech.SpringBootSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@RestController
public class SpringBootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/japan")
	public String japan(@RequestParam(value = "name", defaultValue = "日本") String name) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime time = LocalDateTime.now();

		return String.format("%sの現在時刻は%sです。", name, time.format(fmt));
	}

	// 引数にデフォルト値を設定しなかった場合、どうなるか確認
	@GetMapping("/japantest")
	public String japantest(@RequestParam(value = "name", required = false) String name) {

		if(name == null) {
			name = "日本";
		}

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime time = LocalDateTime.now();

		return String.format("%sの現在時刻は%sです。", name, time.format(fmt));
	}

}
