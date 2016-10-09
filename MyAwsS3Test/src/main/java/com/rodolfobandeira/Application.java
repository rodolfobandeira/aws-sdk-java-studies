package com.rodolfobandeira;

import java.util.List;

import com.amazonaws.services.s3.model.Bucket;

public class Application {

	public static void main(String[] args) {
		System.out.println("Listing the first bucket in my AWS S3 Account: ");
		
		MyS3Class S3 = new MyS3Class();
		List<Bucket> myBucketList = S3.listMyBuckets();
		int x = 0;
		
		for (Bucket myBucket: myBucketList) {
			System.out.println("\tBucket[" + x + "]: " + myBucket.getName());
			x++;
		}
		
		System.out.println("Done");
		
		/*
		  	Listing the first bucket in my AWS S3 Account: 
				Bucket[0]: my-cool-bucket-name-1
				Bucket[1]: my-cool-bucket-name-2
				Bucket[2]: my-cool-bucket-name-3
			Done
		 */
	}
}
