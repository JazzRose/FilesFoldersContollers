package com.codeclan.example.filesandfolders.components;

import com.codeclan.example.filesandfolders.models.File;
import com.codeclan.example.filesandfolders.models.Folder;
import com.codeclan.example.filesandfolders.models.Person;
import com.codeclan.example.filesandfolders.repository.FileRepository;
import com.codeclan.example.filesandfolders.repository.FolderRepository;
import com.codeclan.example.filesandfolders.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class seeds implements ApplicationRunner{

        @Autowired
        PersonRepository personRepository;

        @Autowired
        FolderRepository folderRepository;

        @Autowired
        FileRepository fileRepository;

        @Override
        public void run(ApplicationArguments args) throws Exception {

            Person jazz = new Person("Jazz");
            personRepository.save(jazz);

            Person ashley = new Person("Ashley");
            personRepository.save(ashley);

            Person fiona = new Person("Fiona");
            personRepository.save(fiona);

            Folder folder1 = new Folder("Jazz's Projects", jazz);
            folderRepository.save(folder1);

            Folder folder2 = new Folder("Ashley's Gifs", ashley);
            folderRepository.save(folder2);

            Folder folder3 = new Folder("Fionas Art", fiona);
            folderRepository.save(folder3);

            Folder folder4 = new Folder("Fiona's Vids", fiona);
            folderRepository.save(folder4);

            File file1 = new File("GeoFun", ".js", 1000, folder1);
            fileRepository.save(file1);

            File file2 = new File("TravelBucketList", ".py", 12345, folder1);
            fileRepository.save(file2);

            File file3 = new File("Cat Falling", ".gif", 750, folder2);
            fileRepository.save(file3);

            File file4 = new File("Drunk Man", ".gif", 800, folder2);
            fileRepository.save(file4);

            File file5 = new File("Portrait of Duck", ".png", 100000000, folder3);
            fileRepository.save(file5);

            File file6 = new File("Oil of Coke Can", ".jpeg", 127486, folder3);
            fileRepository.save(file6);

            File file7 = new File("Blair Witch 5", ".mp4", 99999999, folder4);
            fileRepository.save(file7);

        }
    }
