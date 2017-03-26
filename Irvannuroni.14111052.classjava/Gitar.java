//Nama 	: Irvan Nuroni
//NIM	: 14.111.052
//Kelas	: 14.TIF.Weekend

class Gitar{

	//Atribut class Gitar {
				String warna;
				String merk;
				String type;

	void gitardiambil(){
	System.out.println("Gitar diambil");
	}

	void gitarmelody(){
	System.out.println("Gitar dimainkan dengan melody");
	}

	void gitardisimpan(){
	System.out.println("Gitar disimpan");
	}

public static void main(String[] args){

	Gitar MyGitar =new Gitar(); //class yang dibutuhkan
	MyGitar.warna="Warna Gitar ini Hitam";
	MyGitar.merk="Merk Gitar ini Ibanez";
	MyGitar.type="Jenis Gitar ini Akustik";

	System.out.println(MyGitar.warna);
	System.out.println(MyGitar.merk);
	System.out.println(MyGitar.type);

	//memanggil method gitardiambil
	MyGitar.gitardiambil();
	//memanggil method gitarmelody();
	MyGitar.gitarmelody();
	//memanggil method gitardisimpan
	MyGitar.gitardisimpan();
}
}





	