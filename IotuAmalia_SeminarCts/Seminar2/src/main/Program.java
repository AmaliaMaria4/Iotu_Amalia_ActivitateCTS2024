package main;

import clase.Aplicant;
import readers.AngajatReader;
import readers.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		AplicantReader angajatReader = new AngajatReader("D:\\CTS2024recuperare\\IotuAmalia_SeminarCts\\Seminar2\\angajati.txt");

		try {
			listaAngajati = angajatReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
