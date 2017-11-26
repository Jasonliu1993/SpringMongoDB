package com.mongodb.mongodbdemo.dao;

import com.mongodb.mongodbdemo.domain.DemoInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  DemoInfoRepository  extends MongoRepository<DemoInfo, String> {
    DemoInfo findByName(String name);
}
