package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
//import android.widget.Button;
//import android.widget.EditText;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*
    // Component Declaration
    EditText edtTag, edtName, edtPath;
    Button btnAdd;
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        // Find Component Using ID
        edtTag = findViewById(R.id.fileTag);
        edtName = findViewById(R.id.fileName);
        edtPath = findViewById(R.id.filePath);
        btnAdd = findViewById(R.id.btnAdd);
         */

        //Instantiate Database
        DatabaseHelper databaseHelper = DatabaseHelper.getDB(this);

        String FPs = "";
        String FNs = "";

        for (int i = 1; i <= 20000; i++) {
            FNs += "FN-"+i+",";
            FPs += "FP-"+i+",";
        }

        //Insert DAO
        databaseHelper.tagsToFileDao().addFilesInTag(
                new TagsToFile("T_0", "F_N_0", "F_P_0")
        );


        // Populate Database
        for (int i = 1; i <= 50000; i++) {
            //Insert Ti, (FN1, FN2, ... FN20000), (FP1, FP2, ... FP20000)
            databaseHelper.tagsToFileDao().addFilesInTag(
                    new TagsToFile("T_("+ i +")", FNs, FPs)
            );
//            Insert Single tag, name, path into Room
//            databaseHelper.tagsToFileDao().addFilesInTag(
//                    new TagsToFile("T_("+ i +")", "F_N_("+i+")", "F_P_("+i+")")
//            );
        }


        //Query Database
        List<TagsToFile> tagsRecord = databaseHelper.tagsToFileDao().getAllFiles();

        //Log All Records in the Database
        for(int i = 0; i < tagsRecord.size(); i++) {
            Log.d("Tags_Query_List--", "TN:"+tagsRecord.get(i).getTagName()+"FN:" + tagsRecord.get(i).getFileName()+"FP:"+tagsRecord.get(i).getFilePaths());
        }

    }
}











