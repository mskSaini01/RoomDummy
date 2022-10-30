package com.example.test;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tagsToFile")
public class TagsToFile {
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "tagName")
    @NonNull
    private String tagName;

    @ColumnInfo(name = "fileName")
    @NonNull
    private String fileName;

    @ColumnInfo(name = "filePaths")
    @NonNull
    private String filePaths;

    TagsToFile (String tagName, String fileName, String filePaths) {
        this.tagName = tagName;
        this.fileName = fileName;
        this.filePaths = filePaths;
    }

    //Getter & Setter Methods


    public String getTagName() { return tagName; }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePaths() {
        return filePaths;
    }

    public void setFilePaths(String filePaths) {
        this.filePaths = filePaths;
    }
}