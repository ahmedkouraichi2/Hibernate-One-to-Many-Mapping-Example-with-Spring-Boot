package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Comment;
import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;

@SpringBootApplication
public class SpringBootOneToManyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToManyApplication.class, args);
	}
	
	@Autowired
	private PostRepository postRepository ;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Post post = new Post("java","java is my job ");
		Comment comment1 = new Comment("daccord");
		Comment comment2 = new Comment("ahmed");
		Comment comment3 = new Comment("ahmed");
		post.getComments().add(comment2);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		
		
		
		
		this.postRepository.save(post);
	}
	
	

}
