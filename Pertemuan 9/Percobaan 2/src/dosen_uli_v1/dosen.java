package dosen_uli_v1;

public class dosen {
    
    protected String nama;
    protected String nik;
    protected String jurusan;

    dosen(String namaX, String nikX, String jurX) {
    	// membuat konstruktor
    	nama    = namaX;
    	nik     = nikX;
    	jurusan = jurX;
    }

    public void view() {
    	System.out.println("Nama               : " + nama);
    	System.out.println("NIK                : " + nik);
    	System.out.println("Jurusan            : " + jurusan);
    }
}
