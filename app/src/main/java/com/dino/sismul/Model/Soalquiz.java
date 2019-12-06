package com.dino.sismul.Model;

public class Soalquiz {
    //membuat array untuk pertanyaan berupa audio
    public String pertanyaan[] = {
        "https://files.fm/thumb_show.php?i=ssujb99y",
        "https://files.fm/thumb_show.php?i=538rx3av",
        "https://files.fm/thumb_show.php?i=8ytvf6kr"
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"Iguanadon","Allosaurus","Hypsilophodon"},
            {"Allosaurus","Spinosaurus","Iguanadon"},
            {"Ankylosaurus","Brachiosaurus","Triceraptors"}
    };

    //membuat array untuk jawaban yang benar
    private String jawabanBenar[] = {
            "Hypsilophodon",
            "Allosaurus",
            "Brachiosaurus"
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
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
