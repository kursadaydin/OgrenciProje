import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Test {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Ogrenci> liste = new ArrayList<Ogrenci>();
		
		for (int i = 0; i < 2; i++) {
			
		Ogrenci o1  = new Ogrenci();
		o1.setOgrenciAd(JOptionPane.showInputDialog("L�tfen ��rencinin ad�n� giriniz...").toUpperCase());
		o1.setOgrenciSoyad(JOptionPane.showInputDialog("L�tfen ��rencinin soyad�n� giriniz...").toUpperCase());
		o1.setOgrenciNumara(Integer.valueOf(JOptionPane.showInputDialog("L�tfen ��rencinin numaras�n� giriniz...")));
		o1.setOgrenciBolum(JOptionPane.showInputDialog("L�tfen ��rencinin b�l�m�n� giriniz...").toUpperCase());
		o1.setOgrenciDers1(new Ders ((JOptionPane.showInputDialog("L�tfen ��rencinin 1. dersini giriniz...").toUpperCase())));
		o1.setOgrenciDers2(new Ders ((JOptionPane.showInputDialog("L�tfen ��rencinin 2. dersini giriniz...").toUpperCase())));
		o1.setOgrenciDers3(new Ders ((JOptionPane.showInputDialog("L�tfen ��rencinin 3. dersini giriniz...").toUpperCase())));
		o1.setOgrenciDers4(new Ders ((JOptionPane.showInputDialog("L�tfen ��rencinin 4. dersini giriniz...").toUpperCase())));
		liste.add(o1);
		
		}
		
		// yeni yarat�lacak dosya yolunun sadece isim olarak tan�mland��� i�in
		//proje dosyalar�n�n oldu�u dizinde dosya �retilmi�tir.
		File dosya =new File("ogrenci.txt");
		dosya.createNewFile();
		
		FileWriter yazma = new FileWriter(dosya);
		FileReader okuma = new FileReader(dosya);
		yazma.write("\t ��RENC� KAYIT TAK�P S�STEM�");
		yazma.write(System.lineSeparator());
		
		for (int i = 0; i < liste.size(); i++) {
			yazma.write(i+1 + "nci ��rencinin Ad�      : " +liste.get(i).getOgrenciAd()+ System.lineSeparator());
			yazma.write(i+1 + "nci ��rencinin Soyad�   : " +liste.get(i).getOgrenciSoyad()+ System.lineSeparator());
			yazma.write(i+1 + "nci ��rencinin Numaras� : " +liste.get(i).getOgrenciNumara()+ System.lineSeparator());
			yazma.write(i+1 + "nci ��rencinin B�l�m�   : " +liste.get(i).getOgrenciBolum()+ System.lineSeparator());
			yazma.write(i+1 + "nci ��rencinin 1. Dersi : " +liste.get(i).getOgrenciDers1().getDersAdi() +System.lineSeparator());
			yazma.write(i+1 + "nci ��rencinin 2. Dersi : " +liste.get(i).getOgrenciDers2().getDersAdi() +System.lineSeparator());
			yazma.write(i+1 + "nci ��rencinin 3. Dersi : " +liste.get(i).getOgrenciDers3().getDersAdi() +System.lineSeparator());
			yazma.write(i+1 + "nci ��rencinin 4. Dersi : " +liste.get(i).getOgrenciDers4().getDersAdi() +System.lineSeparator());
			yazma.write("_________________________________________" + System.lineSeparator());
			
		}
		
		yazma.close();
		
				
		
		
		}
		
		
		
		
		
		
		
		

	}

