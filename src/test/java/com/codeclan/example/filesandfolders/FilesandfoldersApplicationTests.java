package com.codeclan.example.filesandfolders;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.codeclan.example.filesandfolders.repository.FileRepository;
import com.codeclan.example.filesandfolders.repository.FolderRepository;
import com.codeclan.example.filesandfolders.repository.PersonRepository;

@SpringBootTest
class FilesandfoldersApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;


	@Test
	void contextLoads() {

	}

//	@Test
//	public void createFileAndSaveToFolder(){
//		Person person1 = new Person("Jazz");
//		personRepository.save(person1);
//		Folder folder1 = new Folder("Eds New Hair", person1);
//		folderRepository.save(folder1);
//
//		File file1 = new File("Chocolate",".jpg",100,folder1);
//		fileRepository.save(file1);
//		folder1.addFile(file1);
//		person1.addFolder(folder1);
//
//		personRepository.save(person1);
//		folderRepository.save(folder1);
//
//	}

}
