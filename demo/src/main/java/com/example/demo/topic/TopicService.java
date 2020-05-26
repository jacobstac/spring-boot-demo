package com.example.demo.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Python", "Python MasterClass", "a course in python"),
            new Topic("react JS", "webprogramming", "a course in basic react js"),
            new Topic("paint", "ms paint art", "a course in painting i ms paint")
        ));

    public List<Topic> getALlTopics () {
        return topics;
    }

    public Topic getTopic(String id ) {
        return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if(t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }

        }
    }
}