package com.rodolfobandeira;

import java.util.List;

import com.amazonaws.services.s3.*;
import com.amazonaws.services.s3.model.Bucket;

public class MyS3Class {
	
	private final AmazonS3Client amazonS3Client;
	
	public MyS3Class() {
		amazonS3Client = new AmazonS3Client();
	}
	
	public List<Bucket> listMyBuckets() {
		return this.amazonS3Client.listBuckets();
	}
}
