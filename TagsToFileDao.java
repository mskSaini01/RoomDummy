package com.example.test;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TagsToFileDao {
    @Query("select * from tagsToFile")
    List<TagsToFile> getAllFiles();
    //LiveData<List<TagsToFileDao>> getAllFiles();

    @Insert()
    void addFilesInTag(TagsToFile tagRecord);

//    @Update
//    void updateTags(TagsToFile tagRecord);

    @Delete
    void removeTags(TagsToFile tagRecord);
}
