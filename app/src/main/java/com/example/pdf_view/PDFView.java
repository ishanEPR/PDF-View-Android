package com.example.pdf_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PDFView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_view);
        com.github.barteksc.pdfviewer.PDFView pdfView=findViewById(R.id.pdfview);
        pdfView.fromAsset("iris.pdf").load();
    }
}