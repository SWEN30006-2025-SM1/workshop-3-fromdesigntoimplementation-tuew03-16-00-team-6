package com.unimelb.swen30006.workshops;

import java.util.Date;

// Sample private file class to be replaced by your implementaiton
class File {
    private Date createdDate;
    private String fileData;
    private String fileName;

    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }

    public String content(){
        return fileName + ": " + fileData;
    };

    public int fileSize(){
        return 1;
    };

}