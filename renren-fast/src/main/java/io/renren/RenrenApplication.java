/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class RenrenApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenrenApplication.class, args);
		System.out.println();
		System.out.println("   _________.__                .__  .__          ___________.__                   __      __.__.__  .__  .__  \n" +
				"  /   _____/|  |   ____   ____ |  | |__| ____    \\_   _____/|  |__   ____   ____ |  | __ /  |__|  | |  | |  | \n" +
				"  \\_____  \\ |  |  /  _ \\_/ ___\\|  | |  |/    \\    |    __)  |  |  \\_/ __ \\_/ ___\\|  |/ / \\   __\\  | |  | |  | \n" +
				"  /        \\|  |_(  <_> )  \\___|  |_|  |   |  \\   |     \\   |   Y  \\  ___/\\  \\___|    <   |  | |  |_|  |_|  \n" +
				" /_______  /|____/\\____/ \\___  >____/__|___|  /   \\___  /   |___|  /\\___  >\\___  >__|_ \\  |__| |____/____/  \n" +
				"         \\/                  \\/             \\/        \\/          \\/     \\/     \\/     \\/                    ");
		System.out.println();
		System.out.println("renren-fast 启动成功          ");
		System.out.println();
		System.out.println("本地访问: http://localhost:8080");
		System.out.println();
	}

}