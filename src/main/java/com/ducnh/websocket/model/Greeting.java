package com.ducnh.websocket.model;

public class Greeting {
    public String content;
    public Greeting() {
    }
    public Greeting(String content) {
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }
    
}
