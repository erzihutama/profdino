package com.dino.sismul.Model;

public class Soalquiz {
    //membuat array untuk pertanyaan berupa audio
    public String pertanyaan[] = {
        "https://awsimages.detik.net.id/community/media/visual/2018/11/30/f0bdeefc-1646-4ed1-89f9-96da8c512381.jpeg?w=700&q=99",
        "https://cdn.idntimes.com/content-images/community/2019/07/jw2-adv1sheet-trex-2-preview-rgb-220508902f652ee1486a1bc2200e7b07_600x400.jpg",
        "https://cdn2.tstatic.net/travel/foto/bank/images/ankylosaurus_20180402_130710.jpg"
    };

    //membuat array untuk pilihan jawaban
    private String pilihanJawaban[][] = {
            {"haha","hoho","hehe"},
            {"haha","hoho","hehe"},
            {"haha","hoho","hehe"}
    };

    //membuat array untuk jawaban yang benar
    private String jawabanBenar[] = {
            "haha",
            "hoho",
            "hehe"
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
