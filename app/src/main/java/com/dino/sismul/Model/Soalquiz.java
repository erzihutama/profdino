package com.dino.sismul.Model;

import android.media.MediaPlayer;

import com.dino.sismul.R;

public class Soalquiz {
    public String pertanyaan[] = {
        "https://files.fm/thumb_show.php?i=947gd3r6",
        "https://files.fm/thumb_show.php?i=4mne6nxc",
        "https://files.fm/thumb_show.php?i=a6akvhjv",
        "https://files.fm/thumb_show.php?i=2gr7hjk4",
        "https://files.fm/thumb_show.php?i=zh6zrvaj"
    };

    public String pertanyaan1[] = {
            "Jenis Dinosaurus apa ini?",
            "Jenis Dinosaurus apa ini?",
            "Apakah dinosaurus bertelur ?",
            "Aku memiliki sirip atau duri yang berjajar rapi di punggungku, sirip ini kuat dan tajam, siapa namaku ?",
            "Aku dinosaurus yang berjalan lamban, siapakah aku, aku memiliki pemukul yang keras di ujung ekorku"
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Ankilosaurus","Hypsilophodon","iguanadon"},
            {"Triseratops","Allosaurus","brachiosaurus"},
            {"Iya Bertelur","Tidak Bertelur","Semuanya Salah"},
            {"Plesiosaurus","Stegosaurus","Allosaurus"},
            {"Chungkingosaurus","Plesiosaurus","Ankilosaurus"}
    };

    //membuat array untuk jawaban yang benar
    private String jawabanBenar[] = {
            "Hypsilophodon",
            "Triseratops",
            "Iya Bertelur",
            "Stegosaurus",
            "Ankilosaurus"
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPertanyaan1(int x){
        String pert = pertanyaan1[x];
        return pert;
    }

    //membuat getter untuk mengambil pilihan yang ke 1 atau a
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return  jawaban1;
    }

    //membuat getter untuk mengambil pilihan yang ke 2 atau b
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan yang ke 3 atau c
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    // membuat getter untuk jawaban yang benar

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }

}
