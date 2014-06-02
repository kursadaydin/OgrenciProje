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
		o1.setOgrenciAd(JOptionPane.showInputDialog("Lütfen öðrencinin adýný giriniz...").toUpperCase());
		o1.setOgrenciSoyad(JOptionPane.showInputDialog("Lütfen öðrencinin soyadýný giriniz...").toUpperCase());
		o1.setOgrenciNumara(Integer.valueOf(JOptionPane.showInputDialog("Lütfen öðrencinin numarasýný giriniz...")));
		o1.setOgrenciBolum(JOptionPane.showInputDialog("Lütfen öðrencinin bölümünü giriniz...").toUpperCase());
		o1.setOgrenciDers1(new Ders ((JOptionPane.showInputDialog("Lütfen öðrencinin 1. dersini giriniz...").toUpperCase())));
		o1.setOgrenciDers2(new Ders ((JOptionPane.showInputDialog("Lütfen öðrencinin 2. dersini giriniz...").toUpperCase())));
		o1.setOgrenciDers3(new Ders ((JOptionPane.showInputDialog("Lütfen öðrencinin 3. dersini giriniz...").toUpperCase())));
		o1.setOgrenciDers4(new Ders ((JOptionPane.showInputDialog("Lütfen öðrencinin 4. dersini giriniz...").toUpperCase())));
		liste.add(o1);
		
		}
		
		// yeni yaratýlacak dosya yolunun sadece isim olarak tanýmlandýðý için
		//proje dosyalarýnýn olduðu dizinde dosya üretilmiþtir.
		File dosya =new File("ogrenci.txt");
		dosya.createNewFile();
		
		FileWriter yazma = new FileWriter(dosya);
		FileReader okuma = new FileReader(dosya);
		yazma.write("\t ÖÐRENCÝ KAYIT TAKÝP SÝSTEMÝ");
		yazma.write(System.lineSeparator());
		
		for (int i = 0; i < liste.size(); i++) {
			yazma.write(i+1 + "nci Öðrencinin Adý      : " +liste.get(i).getOgrenciAd()+ System.lineSeparator());
			yazma.write(i+1 + "nci Öðrencinin Soyadý   : " +liste.get(i).getOgrenciSoyad()+ System.lineSeparator());
			yazma.write(i+1 + "nci Öðrencinin Numarasý : " +liste.get(i).getOgrenciNumara()+ System.lineSeparator());
			yazma.write(i+1 + "nci Öðrencinin Bölümü   : " +liste.get(i).getOgrenciBolum()+ System.lineSeparator());
			yazma.write(i+1 + "nci Öðrencinin 1. Dersi : " +liste.get(i).getOgrenciDers1().getDersAdi() +System.lineSeparator());
			yazma.write(i+1 + "nci Öðrencinin 2. Dersi : " +liste.get(i).getOgrenciDers2().getDersAdi() +System.lineSeparator());
			yazma.write(i+1 + "nci Öðrencinin 3. Dersi : " +liste.get(i).getOgrenciDers3().getDersAdi() +System.lineSeparator());
			yazma.write(i+1 + "nci Öðrencinin 4. Dersi : " +liste.get(i).getOgrenciDers4().getDersAdi() +System.lineSeparator());
			yazma.write("_________________________________________" + System.lineSeparator());
			
		}
		
		yazma.close();
		
				
		
		
		}
		
		
		
		
		
		
		
		

	}

