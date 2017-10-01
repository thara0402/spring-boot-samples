# spring-boot-samples

## Install

### Java SDK のインストール

http://www.oracle.com/technetwork/java/javase/downloads/index.html

### 環境変数の設定

```shell-session
$ export JAVA_HOME='/usr/libexec/java_home'
$ echo export JAVA_HOME='/usr/libexec/java_home' >> ~/.bash_profile
```

or

```shell-session
$ sudo vi .bash_profile
```

add JAVA_HOME to .bash_profile.

```shell-session
export JAVA_HOME=$(/usr/libexec/java_home)
```

## SPRING INITIALIZR

https://start.spring.io/

### 利用できるライブラリの確認

```shell-session
$ ./mvnw dependency:tree
```

### Hello World

```java
package com.example.hajiboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HajibootApplication {

	@GetMapping("/")
	String home(){
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HajibootApplication.class, args);
	}
}
```

### 実行

```shell-session
$ ./mvnw spring-boot:run
```

### jar ファイルの実行

jar ファイルの作成

```shell-session
$ ./mvnw package
```

jar ファイルの実行

```shell-session
$ java -jar target/hajiboot-0.0.1-SNAPSHOT.jar
```

ポート番号を変更

```shell-session
$ java -jar target/hajiboot-0.0.1-SNAPSHOT.jar --server.port=8888
```

## Spring Tool Suite

https://spring.io/tools/sts/all

### Spring Dev Tools

```xml
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
```







