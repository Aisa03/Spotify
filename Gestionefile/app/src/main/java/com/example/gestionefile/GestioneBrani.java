package com.example.gestionefile;

import java.util.ArrayList;
import java.util.List;

public class GestoreBrani
{
    ArrayList<Brano> listaBrani;
    public gestoreBrani()
    {
        listaBrani = new ArrayList<Brano>();
    }

    public void addBrano(String titolo, String autore, String genere, int durata)
    {
        Brano br = new Brano(titolo, autore, genere, durata);
        this.listaBrani.add(br);
    }

    public void viewBrani()
    {

    }
}

