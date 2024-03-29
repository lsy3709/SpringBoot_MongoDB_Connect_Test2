package com.mymongotest.springmongtest3.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Document("memo")
public class Memo {
   
	@Id
	private String id;
	
	private String title;
	private String message;
	private String dateField;
	private String imageFileObjectId;
	private String imageFileName;

}